package com.winter.app.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/")
	public String getIndex()throws Exception{
		//WEB-INF / views 밑의 index.jsp로 간다
		return "index";
	}
}
