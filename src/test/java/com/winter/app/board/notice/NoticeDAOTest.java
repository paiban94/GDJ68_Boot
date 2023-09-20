package com.winter.app.board.notice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.winter.app.board.BoardVO;
import com.winter.app.commons.Pager;

@SpringBootTest
class NoticeDAOTest {
	@Autowired
	private NoticeDAO noticeDAO;
	
	//@Test
	void addTest()throws Exception{
		for(int i=0; i<150; i++) {
		//for문으로 150개까지 만들기
		BoardVO boardVO = new BoardVO();
		boardVO.setBoardTitle("title" + (i+1));
		  //타이틀의 숫자가 증가한다
		boardVO.setBoardWriter("writer");
		boardVO.setBoardContents("contents");
		int reuslt = noticeDAO.add(boardVO);
		//문제없음 1이 나오게
		//assertEquals(1, reuslt);
		if(i%10 == 0) {
		Thread.sleep(500);
		//10개씩 돌리고 잠깐쉬기
		}
	}
		System.out.println("finish");
}	
	
	//@Test
	//count	
	void getCountTest()throws Exception{
		Pager pager = new Pager();
		pager.setKind("1");
		//제목에서 검색한다
		pager.setSearch("1");
		Long count = noticeDAO.getCount(pager);
		assertEquals(70, count);
		//카운트가 2개가 맞냐! 확인
	}
	
	
	//@Test
	void getListTest()throws Exception {
		Pager pager = new Pager();
		pager.setStartRow(0L);
		pager.setLastRow(10L);
		//10개까지
		pager.setKind("1");
		//타이틀에서 검색하고싶을떄
		pager.setSearch("20");
		
		List<BoardVO> ar = noticeDAO.getList(pager); 
		//noticeDAO에서 getlist를 호출하면 	List<BoardVO> 이걸 리턴해줌.
		assertNotEquals(2, ar.size());
		//ar에서 size를 꺼낼때 0과 같지 않았으면 좋겠다.
		
	}

}
