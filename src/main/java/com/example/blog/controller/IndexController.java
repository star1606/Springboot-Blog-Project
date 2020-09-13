package com.example.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class IndexController {

	@GetMapping({ "/", "" })
	public String index() {
		return "index";
	}
	
	// 누구나 들어올 수 있는 페이지는 indexController에서 만든다
	@GetMapping("/auth/joinForm")
	public String joinForm() {
		return "user/joinForm";
	}
	
	@GetMapping("/auth/loginForm")
	public String loginForm() {
		return "user/loginForm";
	}
	
}
