package com.winter.app.board.notice;

import java.sql.Date;
import java.util.List;

import com.winter.app.board.BoardVO;

import lombok.Getter;
import lombok.Setter;

//noticevo는 boardvo를 상속받으면 됨.
@Getter
@Setter
// notice 하나가 여러개를 가지고 있다..라는뜻
public class NoticeVO extends BoardVO {
	
	private List<NoticeFileVO> list;

	
}
