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
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import top.catarina.core.annotation.resolver.CurrentUserMethodArgumentResolver;

import java.util.List;

/**
 * 静态资源配置
 * @author Civin
 * 邮箱：   Civin@bupt.edu.cn
 * @since 2018-03-07 18:38
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

	@Autowired
	CurrentUserMethodArgumentResolver currentUserMethodArgumentResolver;

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
}
