/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2017, 2018 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina.web.controller;

import com.fasterxml.jackson.databind.ser.Serializers;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.catarina.base.utils.R;
import top.catarina.core.annotation.CurrentUser;
import top.catarina.core.persist.entity.User;
import top.catarina.core.persist.service.NotifyService;
import top.catarina.core.persist.service.UserService;

/**
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-10 18:03
 */
@Api("主页接口")
@RestController
@RequestMapping("/home/index")
public class HomeController extends Serializers.Base {
	@Autowired
	UserService userService;
	@Autowired
	NotifyService notifyService;

	@ApiOperation(value = "主页信息获取接口",notes = "无需相关id",response = R.class)
	@GetMapping
	public R get(@CurrentUser User user){
		int count = notifyService.unread4Me(user.getId());
		return R.ok().put("user",user)
				.put("notify_nums",count);
	}
}
