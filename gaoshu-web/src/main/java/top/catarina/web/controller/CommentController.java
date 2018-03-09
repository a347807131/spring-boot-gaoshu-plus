package top.catarina.web.controller;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;
import top.catarina.base.lang.Consts;
import top.catarina.base.utils.R;
import top.catarina.core.annotation.CurrentUser;
import top.catarina.core.persist.entity.*;
import top.catarina.core.persist.service.CommentService;
import top.catarina.core.persist.service.PostService;

import java.util.List;

/**
 * @author Civin
 * @create 2018-01-25 19:08
 */
@RestController
@RequestMapping("/comment")
public class CommentController extends BaseController {

	@Autowired
	PostService postService;
	@Autowired
	CommentService commentService;

	/**
	 * 分页查询回复
	 *
	 * @param pn   页码
	 * @param toId 所属post的id
	 * @return 包装了Comment的page
	 */
	@GetMapping("/list/{toId}")
	public Page<Comment> view(Integer pn, @PathVariable long toId) {
		Sort sort = new Sort(Sort.Direction.ASC, "sort");
		Pageable pageable = wrapPage(pn, sort);
		Page<Comment> list = commentService.paging( toId,pageable);
		return list;
	}

	/**
	 * 提交评论
	 * @param comment 实体
	 * @param pid 所要提交给的推送
	 * @param albums 素材id数组
	 * @param user 当前操作用户
	 */
	@PostMapping
	public R post(@RequestBody Comment comment,
	              @RequestParam(name = "pid") long pid,
	              @RequestParam(name = "mids") String[] albums,
	              @CurrentUser User user){
		if (comment.getContent()!=null || albums!=null) {

			comment.setAuthor(user);
			if(albums!=null){
				List<Attach> attachList = handleAblums(albums);
				comment.setAttachs(attachList);
			}
			commentService.post(comment,pid);
			//发送通知
			if(postService.get(pid).getAuthor().getId()!=user.getId())
				//sendNotify();
			return R.ok();
		}
		return R.error("发布评论失败,没有内容。");
	}

	@DeleteMapping
	public R delete(@RequestParam(name = "cid") Long id,@CurrentUser User user) {
		if (id != null) {
			commentService.delete(id, user.getId());
			return R.ok();
		}
		return R.error();
	}
/*
	private void sendNotify(long userId,long postId){
		NotifyEvent event = new NotifyEvent("NotifyEvent");
		event.setFromUserId(userId);
		event.setEvent(Consts.NOTIFY_EVENT_C
		OMMENT);
		// 此处不知道文章作者, 让通知事件系统补全
		event.setPostId(postId);
	}*/

	//不存在更新这么一说

}
