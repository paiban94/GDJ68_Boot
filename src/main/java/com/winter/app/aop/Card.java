package com.winter.app.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@Aspect
public class Card {
	// advice : 공통로직
	//@Before("execution(* com.winter.aop.Transfer.*())")
	//@After("execution(* com.winter.aop.Transfer.*())")
	@Around("execution(* com.winter.aop.Transfer.*())")
	public Object cardCheck(ProceedingJoinPoint joinPoint)throws Throwable{
											//joinPoint == useBus, useSubway
		log.info("======================");
		log.info("Card Check 타기");
		
		Object [] args = joinPoint.getArgs();
		log.info("Args : {}", args);
		//실행  
		//void 말고 string이면실행하고 리턴이 있을수 있으니 object를 해줌
		Object obj = joinPoint.proceed();
		
		log.info("Card Check 내리기");
		log.info("======================");
		return obj;
	}
	
}
