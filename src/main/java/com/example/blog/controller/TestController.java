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
	public @ResponseBody String index() {
		
		// => /viewresolver/src/main/resources/templates/index.mustache
		// viewresolver의 역할 : return하는 것은 파일, prefix와 surfix를 붙여준다. return에 index만 써도 알아서 붙여준다는 뜻
		// 원래 requestDispatcher를 써서 데이터를 보냈는데 스프링에서는 클래스로 Model 이라는것을 만들어놨음
		// Model model  함수안에 파라미터를 적기만하면 DI해줌..  
		
		System.out.println(t.age);
//		System.out.println(t.money);
		System.out.println(t.getMoney());
		return "Hello world";
	}
	
}
