package top.catarina.web.controller;

import io.swagger.annotations.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.catarina.base.utils.R;
import top.catarina.core.annotation.CurrentUser;
import top.catarina.core.data.UserForm;
import top.catarina.core.persist.entity.College;
import top.catarina.core.persist.entity.User;
import top.catarina.core.persist.service.CollegeService;
import top.catarina.core.persist.service.UserService;
import top.catarina.core.validator.ValidatorUtils;

/**
 * 用户资料控制层
 *
 * @author Civin
 * @create 2018-01-30 19:55
 */
@Api("用户资料相关操作控制器")
@RestController
@RequestMapping("/user/profile")
public class ProfileController {

	@Autowired
	UserService userService;
	@Autowired
	CollegeService collegeService;

	/**
	 * 获取该访问的用户信息
	 */
	@ApiOperation(value = "用户信息获取接口", notes = "默认是查询自己的信息，页可带上用户id进行查询。",response = User.class)
	@GetMapping
	public User get(@RequestParam(required = false) Long id, @CurrentUser User user) {
		if (id != null) {
			return userService.get(id);
		}
		return userService.get(user.getId());
	}

	/**
	 * 修改用户信息
	 * 说明：用户资料只能修改昵称、大学、性别 、头像、手机号
	 *
	 * @return 访问状态
	 */
	@ApiParam(name = "form",required = true)
	@ApiOperation(value = "用户信息修改接口", notes = "只能为本人操作")
	@PutMapping(params = "method=form")
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

	/**
	 * 前端修改单个字段
	 */
	@ApiOperation(value = "单字段修改接口")
	@PutMapping(params = "method=single")
	public R updateSingleAttr( String attr,@RequestParam Object value,
	                          @CurrentUser User user) throws IllegalAccessException {
		long id = user.getId();
		try {
			userService.changeSingleAttr(attr,value,id);
		} catch (Exception e) {
			return R.error("你所提交的属性不存在。");
		}
		return R.ok();
	}


}