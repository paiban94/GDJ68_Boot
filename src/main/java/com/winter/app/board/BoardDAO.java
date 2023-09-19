package com.winter.app.board;
//상속받을때 내용이 달라질수 있어서 interface 사용?

import java.util.List;

import com.winter.app.commons.Pager;

public interface BoardDAO {
	//boardvo가 여러개 오니까 list
	//메서드명인 mapper랑 동일하게.
	
	
	public Long getCount(Pager pager)throws Exception;
	
	public List<BoardVO> getList(Pager pager)throws Exception;
	
	public int add(BoardVO boardVO)throws Exception;
	
	public BoardVO getDetail(BoardVO boardVO)throws Exception;
	
	public int setUpdate (BoardVO boardVO)throws Exception;
	
	public int setHitUpdate (BoardVO boardVO)throws Exception;
	
	public int setDelete(BoardVO boardVO)throws Exception;
}
