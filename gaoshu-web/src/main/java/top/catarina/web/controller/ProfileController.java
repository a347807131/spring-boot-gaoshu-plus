package top.catarina.web.controller;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.catarina.base.lang.Consts;
import top.catarina.base.utils.R;
import top.catarina.core.annotation.CurrentUser;
import top.catarina.core.persist.entity.User;
import top.catarina.core.persist.service.CollegeService;
import top.catarina.core.persist.service.UserService;

import javax.servlet.http.HttpSession;
import java.util.regex.Pattern;

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
		return user;
	}

	/**
	 * 修改用户信息
	 * 说明：用户资料只能修改昵称、大学、性别 、头像、手机号
	 * @return 访问状态
	 */
	@PostMapping
	public R update(@RequestBody User profile,
	                @CurrentUser User user) {

		return R.ok();
	}
	
}
