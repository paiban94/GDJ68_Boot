package com.winter.app.board.notice;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.winter.app.board.BoardVO;
import com.winter.app.board.FileVO;
import com.winter.app.commons.Pager;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/notice/*")
@Slf4j //롬복쓸땐 어노테이션으로 로그를 찍을수 있다.
public class NoticeController {

	@Autowired
	private NoticeService noticeService;
	
	@ModelAttribute("board")
	// == model.addAttribute("board".notice)
	// list, detail 등 일일히 넣지말고 한번에 모든 메서드에 넣어주기
	public String getBoard() {
		return "notice";
	}
	
	//파일다운
	@GetMapping("fileDown")
	public String getFileDown(FileVO fileVO, Model model)throws Exception{
		fileVO = noticeService.getFileDetail(fileVO);
		model.addAttribute("fileVO", fileVO);
		return "fileDownView";
	}
	
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
	public String add(NoticeVO noticeVO, MultipartFile [] files)throws Exception{
		
		 int result = noticeService.add(noticeVO, files);
		
		return "redirect:./list";
	}
	
	@GetMapping("detail")
	public String getDetail(NoticeVO noticeVO, Model model)throws Exception{
		BoardVO boardVO = noticeService.getDetail(noticeVO);
		model.addAttribute("boardVO", boardVO);
		
		return "board/detail";
	}
	

	
	
}
