package com.example.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.blog.model.Test;

@Controller
public class TestController {

	@Autowired
	Test t;
	
	
	@GetMapping({"", "/"})
	public String index() {
		
		System.out.println(t.age);
//		System.out.println(t.money);
		System.out.println(t.getMoney());
		return "test";
	}
	
}
