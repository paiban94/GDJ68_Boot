package com.winter.app.config;

import java.util.Locale;

import javax.websocket.Session;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration // 설정파일이라는 의미
public class MessgaeConfig implements WebMvcConfigurer {
	//<bean class=""> 객체만드는 코드	
	@Bean
	public LocaleResolver localeResolver() {
		//쿠키나 세션을 이용해서 언어 확인 
		//1. session
		SessionLocaleResolver resolver = new SessionLocaleResolver();
		//아무것도 안오면 디폴트로 한글
		resolver.setDefaultLocale(Locale.KOREAN);
		
		
		//2.Cookie
		CookieLocaleResolver cookieLocaleResolver = new CookieLocaleResolver();
		cookieLocaleResolver.setDefaultLocale(Locale.KOREAN);
		//lang로 영어를 볼꺼냐 한글을 볼꺼냐 
		cookieLocaleResolver.setCookieName("lang");
		
		//return resolver;
		//같은 resolver타입이라 쿠키, 세션 둘다 리턴가능
		return cookieLocaleResolver;
	}

	
	//Message Interceptor 객체 생성
	@Bean
	public LocaleChangeInterceptor changeInterceptor() {
		LocaleChangeInterceptor interceptor = new LocaleChangeInterceptor();
		//인터셉터가 파라미터로 들어오는것으로 언어 결정해줌
		interceptor.setParamName("lang");
		//parameter 받아서 언어 구분
		//url?lang=en (lang은 위에 파라미터를 lang으로 지정해줘서)
		//url?lang=ko
		return interceptor;	
	}



}
