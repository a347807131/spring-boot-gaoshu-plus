package top.catarina.core.annotation.resolver;

import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.multipart.support.MissingServletRequestPartException;
import top.catarina.base.lang.Consts;
import top.catarina.core.annotation.CurrentUser;
import top.catarina.core.persist.entity.User;

/**
 * 增加方法注入，将含有 @CurrentUser 注解的方法参数注入当前登录用户
 * @author Civin
 * @create 2018-02-21 13:00
 */
@Component
public class CurrentUserMethodArgumentResolver implements HandlerMethodArgumentResolver {
	@Override
	public boolean supportsParameter(MethodParameter parameter) {
		return parameter.getParameterType().isAssignableFrom(User.class)
				&& parameter.hasParameterAnnotation(CurrentUser.class);
	}

	@Override
	public Object resolveArgument(MethodParameter methodParameter, ModelAndViewContainer modelAndViewContainer, NativeWebRequest nativeWebRequest, WebDataBinderFactory webDataBinderFactory) throws Exception {
		User user = (User) nativeWebRequest.getAttribute(Consts.USER_ID, RequestAttributes.SCOPE_SESSION);
		if (user != null) {
			return user;
		}
		throw new MissingServletRequestPartException("currentUser");
	}
}
