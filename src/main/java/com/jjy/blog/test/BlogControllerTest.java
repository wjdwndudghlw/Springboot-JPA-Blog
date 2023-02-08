package com.jjy.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//스프링이 com.jjy.blog 패키지 이하를 스캔해서 모든 파일들을 메모리에 new 해서 하는건 아니고요
//특정 어노테이션이 붙어있는 클래스 파일들을 new(loc)해서 스프링 컨테이너에서 관리해줍니다
@RestController
public class BlogControllerTest {

	@GetMapping("/test/hello")
	public String hello() {
		
		return "<h1>hello Spring boot</h1>";
	}
}
