package com.winter.app.board.notice;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.winter.app.board.BoardDAO;


//스프링부트에서는 dao는 클래스가 아닌 인터페이스
//@Repository
//레포지토리는 안써도 상관없음, mapper는 필수임
@Mapper
//스프링부트에서는 mapper을 추가해서 어노테이션해줘야함
public interface NoticeDAO extends BoardDAO{
//상속받았기때문에 안에는 getList가 들어있음.
//인터페이스는 객체생성 안됨.
// dao에선 자기자신의 풀패키지명과 동일한 메퍼의 네임스페이스가 같아야함
// mapper의 네임스페이스와 dao의 풀패키지명이 동일해야함.	
// 메서드명과 일치하는 mapper를 가져옴
}
