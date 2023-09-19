package com.winter.app.commons;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pager {
	
	//시작 인덱스 번호
	private Long startRow;
	
	//가져올 갯수
	private Long lastRow;
	
	//검색할 컬럼
	private String kind;
	
	//검색어
	private String search;

	//starRow null값대신 0부터 시작하게, getter 또 만들어주기
	public Long getStartRow() {
		//startrow가 null이거나 0보다 작으면 0을 리턴해주자
		if(this.startRow==null || this.startRow<0) {
			return 0L;
			}
		//위에경우아니면 startrow 반환
		return this.startRow;
	}
	
	//lastRow
	public Long getLastRow() {
		if(this.lastRow==null || this.lastRow<0) {
			return 10L;
		}
		return this.lastRow;
	}
	
	//search를 설정안하면 전체가 올수있게, null 값은 안들어오게하기
	public String getSearch() {
		if(this.search==null) {
			return "";
		}return this.search;

	}

}