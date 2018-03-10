package top.catarina.web.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;
import top.catarina.base.lang.Enums;
import top.catarina.base.upload.FileRepo;
import top.catarina.base.utils.R;
import top.catarina.core.annotation.CurrentUser;
import top.catarina.core.data.PostForm;
import top.catarina.core.data.PostVo;
import top.catarina.core.persist.entity.Attach;
import top.catarina.core.persist.entity.Post;
import top.catarina.core.persist.entity.User;
import top.catarina.core.persist.service.PostService;
import top.catarina.core.validator.ValidatorUtils;

import java.util.List;

/**
 * @author Civin
 * @Create 2018-01-25 0:00
 */
@RestController
@RequestMapping("/post")
public class PostController extends BaseController {

	@Autowired
	PostService postService;
	@Autowired
	FileRepo fileRepo;

	/**
	 * 公共post列表页面
	 *
	 * @param pn 页码
	 * @return 实体类
	 */
	@GetMapping("/list")
	public Page<PostVo> list(@RequestParam(defaultValue = "1") Integer pn) {
		Sort sort = new Sort(Sort.Direction.DESC, "created");
		Page<PostVo> page = postService.paging(wrapPage(pn, sort));
		return page;
	}

	/**
	 * 用户查询自己的post列表
	 *
	 * @param pn 页码
	 * @return page实体
	 */
	@GetMapping("/mylist")
	public Page<PostVo> myPosts(@CurrentUser User user,
	                            @RequestParam(defaultValue = "1") Integer pn) {
		Sort sort = new Sort(Sort.Direction.DESC, "created");
		Page<PostVo> page = postService.pagingByAuthorId(wrapPage(pn, sort), user.getId(), Enums.Privacy.OPEN.getIndex());
		return page;
	}

	/**
	 * 用于ajax异步请求post详情的访问api
	 *
	 * @param id post的id
	 * @return post的数据
	 */
	@GetMapping
	public Post detall(long id) {
		postService.identityComments(id);
		Post post = postService.get(id);
		return post;
	}

	/**
	 * 修改post 不能修改素材
	 */
	@PutMapping
	public R update(@RequestBody PostForm form,
                    @RequestParam(name = "mids") String[] mids,
                    @CurrentUser User user
			        ) throws Exception {
		ValidatorUtils.validateEntity(form);
		Post po = postService.get(form.getId());

		if(user.getId()!=po.getAuthor().getId())
			return R.error(403,"你没有权限进行操作");
		BeanUtils.copyProperties(form,po);
		return R.ok();
	}

	/**
	 * 提交post表单,发布成功后跳转到发布成功页面
	 * @return msg
	 */
	@PostMapping
	public R submit(@RequestBody PostForm form,
	                @CurrentUser User user) throws Exception {

		Post post = new Post();
		BeanUtils.copyProperties(form,post);
		postService.add(post);

		List<Attach> attachs = handleAblums(form.getMids());
		post.getAttribute().setAttaches(attachs);

		postService.update(post);
		return R.ok("提交的内容有误，请重新提交。");
	}

	/**
	 * 删除post并刷新当前页面
	 * 并清理掉：附属文件
	 *
	 * @param id   comment的id
	 * @param user 当前会话用户
	 */
	@DeleteMapping
	public void delete(@RequestParam Long id, @CurrentUser User user) {
		//删除附属文件
		Post post = postService.get(id);
		Assert.notNull(post, "没有对应id的post。");
		postService.delete(id, user.getId());
	}

	@GetMapping(value = "/end")
	public R end(@RequestParam long pid) {
		Post vo = postService.get(pid);
		if (vo == null) {
			return R.error("未查到对应的主题。");
		}
		postService.lock(pid);
		return R.ok();
	}
}
