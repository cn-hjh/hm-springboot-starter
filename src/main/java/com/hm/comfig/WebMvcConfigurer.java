package com.hm.comfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.hm.controller.interceptor.OneInterceptor;
import com.hm.controller.interceptor.TwoInterceptor;

/**
 * SpringBoot拦截器 继承WebMvcConfigurerAdapter
 * @author 004
 *
 */
@Configuration//配置拦截器
public class WebMvcConfigurer extends WebMvcConfigurerAdapter {

	//重写addInterceptors() 添加需要的拦截器地址
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		/**
		 * 拦截器按照顺序执行
		 */
		//registry.addInterceptor(new OneInterceptor()).addPathPatterns("/*/**"); //拦截所有请求
		
		//两个controller同时被一个拦截器拦截
		registry.addInterceptor(new TwoInterceptor()).addPathPatterns("/two/**")
													 .addPathPatterns("/one/**");
		registry.addInterceptor(new OneInterceptor()).addPathPatterns("/one/**");
		
		
		super.addInterceptors(registry);
	}

}
