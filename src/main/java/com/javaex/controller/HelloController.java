package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class HelloController {
	
	@RequestMapping(value="/hello", method = {RequestMethod.GET, RequestMethod.POST})
	 public String hello() {
	 System.out.println("/hellospring/hello");
	 return "/WEB-INF/views/index.jsp";
	 // spring-servlet에서 뷰리졸버 쓰고나선 return index;만 쓰면 됨
	}
}
