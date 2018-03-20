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

import io.renren.modules.sys.entity.PostAttributeEntity;
import io.renren.modules.sys.service.PostAttributeService;
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
@RequestMapping("sys/postattribute")
public class PostAttributeController {
    @Autowired
    private PostAttributeService postAttributeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:postattribute:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = postAttributeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:postattribute:info")
    public R info(@PathVariable("id") Long id){
			PostAttributeEntity postAttribute = postAttributeService.selectById(id);

        return R.ok().put("postAttribute", postAttribute);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:postattribute:save")
    public R save(@RequestBody PostAttributeEntity postAttribute){
			postAttributeService.insert(postAttribute);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:postattribute:update")
    public R update(@RequestBody PostAttributeEntity postAttribute){
			postAttributeService.updateById(postAttribute);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:postattribute:delete")
    public R delete(@RequestBody Long[] ids){
			postAttributeService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
