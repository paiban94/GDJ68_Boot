package com.winter.app.board;
//상속받을때 내용이 달라질수 있어서 interface 사용?

import java.util.List;

public interface BoardDAO {
	//boardvo가 여러개 오니까 list
	//메서드명인 mapper랑 동일하게.
	public List<BoardVO> getList() throws Exception;
	
	public int add(BoardVO boardVO)throws Exception;
	
}
