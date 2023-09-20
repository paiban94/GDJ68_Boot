package com.winter.app.aop;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component //객체준비
public class Transfer {

	//point-cut : 핵심로직
	public void useBus(String number) {
		log.info("버스 타기");
		
	}
	//point-cut : 핵심로직
	public void useSubway(String number) {
		log.info("지하철 타기");
	}
}
