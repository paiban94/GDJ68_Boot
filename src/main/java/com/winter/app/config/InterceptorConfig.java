package com.winter.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

import com.winter.app.Interceptor.TestInterceptor;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
	
	
	@Autowired // 만들어진 객체를 가지고오기
	private TestInterceptor testInterceptor;
	
	@Autowired
	private LocaleChangeInterceptor localeChangeInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(testInterceptor)
				.addPathPatterns("/notice/list");
	
		//등록
		registry.addInterceptor(localeChangeInterceptor)
				.addPathPatterns("/**")
				;
	}
	
	

}
