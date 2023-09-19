package com.winter.app.board.notice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.winter.app.board.BoardVO;

@SpringBootTest
class NoticeDAOTest {
	@Autowired
	private NoticeDAO noticeDAO;
	
//	@Test
//	void addTest()throws Exception{
//		BoardVO boardVO = new BoardVO();
//		boardVO.setBoardTitle("title");
//		boardVO.setBoardWriter("writer");
//		boardVO.setBoardContents("contents");
//		int reuslt = noticeDAO.add(boardVO);
//		//문제없음 1이 나오게
//		assertEquals(1, reuslt);
//	}
//	
//	
	
	
	@Test
	void getListTest()throws Exception {
		List<BoardVO> ar =noticeDAO.getList(); 
		//noticeDAO에서 getlist를 호출하면 	List<BoardVO> 이걸 리턴해줌.
		assertNotEquals(0, ar.size());
		//ar에서 size를 꺼낼때 0과 같지 않았으면 좋겠다.
		
	}

}
