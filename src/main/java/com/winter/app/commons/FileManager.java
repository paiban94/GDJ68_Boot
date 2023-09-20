	package com.winter.app.commons;

import java.io.File;
import java.util.UUID;

import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

@Component
// 객체만들어줘야하니 어노테이션 주입
public class FileManager {

	//file 저장 후 파일명 리턴
	public String save(String path, MultipartFile multipartFile)throws Exception{
		//어떤파일을 어디에 저장할지?  =>String path, MultipartFile multipartFile 넣어주기
		//1.파일 객체 생성
		//해당폴더가 객체를 만들어준다, 해당폴더가 있을수도 있고 없을수도 있다
		//없으면 만들어줘야함
		//file.exists() 존재하는지 물어보기 / !file.exists() = 파일이 존재하지 않으면!
		File file = new File(path);
		
	
		if(!file.exists()) {
			file.mkdirs();
			//없으면 만들어주기
		}
		//2.저장할 파일명 생성
		//확장자 꺼내기 multipartFile.getOriginalFilename();
		String fileName = UUID.randomUUID().toString()+"_"+multipartFile.getOriginalFilename();
		
		//3.파일을 저장
		//FileCopyUtils.copy
		//FileCopyUtils.copy(MultipartFile.getBytes(),);
		//transferTo
		//두개중 아무거나 사용하면 됨.
		
		file = new File(file, fileName);
		multipartFile.transferTo(file);
		return fileName;
		//저장된 파일네임을 리턴해주자
	}
	
}
