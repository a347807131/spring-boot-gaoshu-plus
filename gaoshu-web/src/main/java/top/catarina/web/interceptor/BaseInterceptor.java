package top.catarina.web.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 *
 * 基础拦截器 - 向 request 中添加一些基础变量
 *
 * @author langhsu
 *
 */
@Component
public class BaseInterceptor extends HandlerInterceptorAdapter {

}
