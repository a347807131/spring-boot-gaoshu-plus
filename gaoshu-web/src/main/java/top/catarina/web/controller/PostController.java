package top.catarina.web.controller;

import io.swagger.annotations.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;
import top.catarina.base.lang.Enums;
import top.catarina.base.upload.FileRepo;
import top.catarina.base.utils.R;
import top.catarina.core.annotation.CurrentUser;
import top.catarina.core.data.PostForm;
import top.catarina.core.persist.entity.Attach;
import top.catarina.core.persist.entity.Post;
import top.catarina.core.persist.entity.PostAttribute;
import top.catarina.core.persist.entity.User;
import top.catarina.core.persist.service.PostService;
import top.catarina.core.persist.service.UserService;
import top.catarina.core.validator.ValidatorUtils;

import java.util.List;

/**
 * @author Civin
 * @Create 2018-01-25 0:00
 */
@Api("推送的相关控制器")
@RestController
@RequestMapping("/post")
public class PostController extends BaseController {

	@Autowired
	PostService postService;
	@Autowired
	FileRepo fileRepo;
	@Autowired
	UserService userService;

	/**
	 * 公共post列表页面
	 *
	 * @param pn 页码
	 * @return 实体类
	 */
	@ApiOperation(value = "推送列表查询接口", response = Page.class)
	@ApiImplicitParam(name = "pn", defaultValue = "0")
	@GetMapping("/list")
	public Page<Post> list(@RequestParam(defaultValue = "0") Integer pn) {
		Sort sort = new Sort(Sort.Direction.DESC, "created");
		return postService.paging(wrapPage(pn, sort));
	}

	/**
	 * 公共post列表页面
	 *
	 * @return 实体类
	 */
	@ApiOperation(value = "未处理推送列表查询接口", response = List.class)
	@ApiImplicitParam(name = "pn", defaultValue = "0")
	@GetMapping(value = "/list",params = "method=unread")
	public List<Post> listUnread(@CurrentUser User user) {
		return postService.pagingUnread(user.getId());
	}


	/**
	 * 用户查询自己的post列表
	 *
	 * @param pn 页码
	 * @return page实体
	 */
	@ApiOperation(value = "用户查询自己的推送列表",response = Page.class)
	@ApiImplicitParam(name = "pn", defaultValue = "0",value = "页码")
	@GetMapping("/mylist")
	public Page<Post> myPosts(@CurrentUser User user,
	                          @RequestParam(defaultValue = "0") Integer pn) {
		Sort sort = new Sort(Sort.Direction.DESC, "created");
		return postService.pagingByAuthorId(wrapPage(pn, sort), user.getId(), Enums.Privacy.OPEN.getIndex());
	}

	/**
	 * 用于ajax异步请求post详情的访问api
	 *
	 * @param id post的id
	 * @return post的数据
	 */
	@ApiOperation(value = "推送详情查询接口", notes = "根据post的id进行查询")
	@ApiImplicitParam(name = "id", defaultValue = "1",value = "推送id")
	@GetMapping
	public PostAttribute detall(long id) {
		postService.identityComments(id);
		return postService.get(id);
	}

	/**
	 * 修改post 不能修改素材
	 */
	@ApiOperation(value = "推送修改接口",notes = "注意：修改接口后台不提供上传素材的功能.")
	@ApiParam(name = "form",required = true)
	@PutMapping
	public R update(@RequestBody PostForm form,
	                @CurrentUser User user) {
		ValidatorUtils.validateEntity(form);
		Post po = postService.getPost(form.getId());

		if (user.getId() != po.getAuthor().getId())
			return R.error(403, "你没有权限进行操作");
		po.setTag(form.getTag());
		po.setContent(form.getContent());
		po.setTitle(form.getTitle());

		postService.update(po);
		return R.ok();
	}

	/**
	 * 提交post表单,发布成功后跳转到发布成功页面
	 *
	 * @return msg
	 */
	@ApiOperation("发布推送接口")
	@ApiParam(name = "form",required = true)
	@PostMapping
	public R submit(@RequestBody PostForm form,
	                @CurrentUser User user) throws Exception {

		Post post = new Post();
		PostAttribute postAttribute = new PostAttribute();
		BeanUtils.copyProperties(form, post);
		post.setAuthor(user);
		postAttribute.setPost(post);
		//处理素材
		List<Attach> attachs = handleAblums(form.getMids());
		post.setAttaches(attachs);
		postService.post(postAttribute);
		if (post.getReward() > 0)
			userService.changeGolds(user.getId(), form.getReward());
		return R.ok();
	}

	/**
	 * 删除post并刷新当前页面
	 * 并清理掉：附属文件
	 *
	 * @param id   comment的id
	 * @param user 当前会话用户
	 */
	@ApiOperation(value = "推送删除接口", notes = "根据post的id进行操作")
	@ApiImplicitParam(name = "id", required = true,value = "推送id")
	@DeleteMapping
	public R delete(@RequestParam Long id, @CurrentUser User user) {
		//删除附属文件
		Post post = postService.getPost(id);
		if (post == null)
			return R.error(404, "没有对应的推送");
		postService.delete(id, user.getId());
		return R.ok();
	}

	@ApiOperation(value = "完结推送的接口", notes = "需要带上method=end参数，以便与获取详情接口区别开。")
	@ApiImplicitParam(name = "id", required = true,value = "推送id")
	@GetMapping(params = "method=end")
	public R end(@RequestParam long id) {
		Post vo = postService.getPost(id);
		if (vo == null) {
			return R.error("未查到对应的主题。");
		}
		postService.lock(id);
		return R.ok();
	}
}
