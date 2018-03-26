/*
+--------------------------------------------------------------------------
|   [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2017, 2018 All Rights Reserved
|   http://www.catarina.top
+---------------------------------------------------------------------------
*/
package top.catarina.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import top.catarina.core.annotation.resolver.CurrentUserMethodArgumentResolver;
import top.catarina.web.fileter.RequestCostFilter;
import top.catarina.web.interceptor.AuthInterceptor;
import top.catarina.web.interceptor.AuthInterceptor4Dev;

import java.util.List;

/**
 * web资源配置
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-07 18:38
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

	private final
	AuthInterceptor4Dev authInterceptor;

	private final
	CurrentUserMethodArgumentResolver currentUserMethodArgumentResolver;

	@Autowired
	public WebConfig(AuthInterceptor4Dev authInterceptor, CurrentUserMethodArgumentResolver currentUserMethodArgumentResolver) {
		this.authInterceptor = authInterceptor;
		this.currentUserMethodArgumentResolver = currentUserMethodArgumentResolver;
	}


	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/statics/**").addResourceLocations("classpath:/statics/");
	}

	/**
	 * 注册CurrentUser解析器
	 * @param argumentResolvers 注解@CurrentUser的解析器
	 */
	@Override
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
		argumentResolvers.add(currentUserMethodArgumentResolver);
		super.addArgumentResolvers(argumentResolvers);
	}

	/**
	 * 添加拦截器
	 * @param registry 拦截器注册实体类
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(authInterceptor).addPathPatterns("/*");  //对来自/user/** 这个链接来的请求进行拦截
	}

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**");
	}
}
