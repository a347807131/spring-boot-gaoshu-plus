package io.renren.modules.sys.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.sys.entity.PostsEntity;
import io.renren.modules.sys.service.PostsService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-03-14 23:07:39
 */
@RestController
@RequestMapping("sys/posts")
public class PostsController {
    @Autowired
    private PostsService postsService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:posts:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = postsService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:posts:info")
    public R info(@PathVariable("id") Long id){
			PostsEntity posts = postsService.selectById(id);

        return R.ok().put("posts", posts);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:posts:save")
    public R save(@RequestBody PostsEntity posts){
			postsService.insert(posts);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:posts:update")
    public R update(@RequestBody PostsEntity posts){
			postsService.updateById(posts);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:posts:delete")
    public R delete(@RequestBody Long[] ids){
			postsService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
