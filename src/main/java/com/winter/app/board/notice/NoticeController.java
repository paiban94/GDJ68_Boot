package com.winter.app.board.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.winter.app.board.BoardVO;
import com.winter.app.commons.Pager;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/notice/*")
@Slf4j //롬복쓸땐 어노테이션으로 로그를 찍을수 있다.
public class NoticeController {

	@Autowired
	private NoticeService noticeService;
	
	//ModelAndView, void, String
	@GetMapping("list")
	public String getList(Pager pager, Model model)throws Exception{
		List<BoardVO> ar = noticeService.getList(pager);
		model.addAttribute("list",ar);
		//log : ERROR - 심각한오류, WARN - 경고, INFO, DEBUG, TARACE
		log.info("getList 실행");
		//board의 list.jsp로 가라
		return "board/list";
	}
	//글쓰기
	@GetMapping("add")
	public String add()throws Exception{
		return "board/add";
	}
	@PostMapping("add")
	public String add(NoticeVO noticeVO)throws Exception{ 
		int result = noticeService.add(noticeVO);
		
		return "redirect:./list";
	}
	
	
}
