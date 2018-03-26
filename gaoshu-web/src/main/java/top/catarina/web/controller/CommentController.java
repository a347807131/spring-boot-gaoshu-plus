package top.catarina.web.controller;

import io.swagger.annotations.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;
import top.catarina.base.utils.R;
import top.catarina.core.annotation.CurrentUser;
import top.catarina.core.data.CommentForm;
import top.catarina.core.persist.entity.Attach;
import top.catarina.core.persist.entity.Comment;
import top.catarina.core.persist.entity.Notify;
import top.catarina.core.persist.entity.User;
import top.catarina.core.persist.service.CommentService;
import top.catarina.core.persist.service.NotifyService;
import top.catarina.core.persist.service.PostService;
import top.catarina.core.validator.ValidatorUtils;

import java.util.List;

/**
 * @author Civin
 * @create 2018-01-25 19:08
 */
@Api("评论回复的相关控制器")
@RestController
@RequestMapping("/comment")
public class CommentController extends BaseController {

	@Autowired
	PostService postService;
	@Autowired
	CommentService commentService;
	@Autowired
	NotifyService notifyService;

	/**
	 * 分页查询回复
	 *
	 * @param pn   页码
	 * @param toId 所属post的id
	 * @return 包装了Comment的page
	 */
	@ApiOperation(value = "回复查询接口.", notes = "前端根据用户的id查询回复." +
			"默认查询第一页.", response = Page.class)
	@ApiImplicitParams({
			@ApiImplicitParam(name = "pn", value = "页码"),
			@ApiImplicitParam(name = "toId", value = "用户id", required = true)
	})
	@GetMapping("/list")
	public Page<Comment> view(Integer pn, @RequestParam Long toId) {
		Sort sort = new Sort(Sort.Direction.ASC, "created");
		Pageable pageable = wrapPage(pn, sort);
		return commentService.paging(toId, pageable);
	}

	@ApiOperation(value = "用户我的回答查询接口.", notes = "参数页码.")
	@GetMapping("/mylist")
	public Page<Comment> myview(Integer pn,@CurrentUser User user) {
		Sort sort = new Sort(Sort.Direction.ASC, "created");
		Pageable pageable = wrapPage(pn, sort);
		return commentService.paging(user.getId(), pageable);
	}


	/**
	 * 提交评论
	 * @param user 当前操作用户
	 */
	@ApiOperation("发布回复接口")
	@ApiParam(name = "form",required = true)
	@PostMapping
	public R post(@RequestBody CommentForm form,
	              @CurrentUser User user) throws Exception {
		ValidatorUtils.validateEntity(form);
		//防止前台恶意提交
		form.setId(0);

		Comment comment = new Comment();
		BeanUtils.copyProperties(form, comment);
		comment.setAuthor(user);
		commentService.post(comment, form.getPid());
		List<Attach> attaches = handleAblums(form.getMids());
		comment.setAttachs(attaches);

		notifyService.send(user.getId(),form.getPid());
		return R.ok();
	}

	@ApiOperation(value = "删除评论接口", notes = "根据回复的id进行删除该评论")
	@ApiImplicitParam(name = "id", required = true,value = "评论id")
	@DeleteMapping
	public R delete(@RequestParam(name = "id") Long id, @CurrentUser User user) {
		if (id != null) {
			commentService.delete(id, user.getId());
			return R.ok();
		}
		return R.error();
	}

	//不存在更新这么一说

}
