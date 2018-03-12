package top.catarina.web.controller;

import com.github.binarywang.wxpay.bean.notify.WxPayOrderNotifyResult;
import com.github.binarywang.wxpay.bean.request.WxPayUnifiedOrderRequest;
import com.github.binarywang.wxpay.exception.WxPayException;
import com.github.binarywang.wxpay.service.WxPayService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.catarina.base.context.AppContext;
import top.catarina.base.lang.Consts;
import top.catarina.base.utils.R;
import top.catarina.core.annotation.CurrentUser;
import top.catarina.core.data.UserForm;
import top.catarina.core.persist.entity.College;
import top.catarina.core.persist.entity.Order;
import top.catarina.core.persist.entity.User;
import top.catarina.core.persist.service.CollegeService;
import top.catarina.core.persist.service.OrderService;
import top.catarina.core.persist.service.UserService;
import top.catarina.core.validator.ValidatorUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.InputStream;

import static top.catarina.base.utils.IPUtils.getIpAddr;

/**
 * 用户资料控制层
 *
 * @author Civin
 * @create 2018-01-30 19:55
 */
@RestController
@RequestMapping("/user/profile")
public class ProfileController {

	@Autowired
	private UserService userService;
	@Autowired
	CollegeService collegeService;

	/**
	 * 获取该访问的用户信息
	 */
	@GetMapping
	public User get(@CurrentUser User user) {
		return userService.get(user.getId());
	}

	/**
	 * 修改用户信息
	 * 说明：用户资料只能修改昵称、大学、性别 、头像、手机号
	 *
	 * @return 访问状态
	 */
	@PostMapping
	public R update(@RequestBody UserForm form,
	                @CurrentUser User user) {
		ValidatorUtils.validateEntity(form);

		College college = collegeService.get(form.getCollegeName());
		if (college == null) {
			return R.error("院校不存在.");
		}
		User po = userService.get(user.getId());
		po.setCollege(college);
		BeanUtils.copyProperties(form, po);
		return R.ok();
	}

}