package com.example.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.blog.model.User;
import com.example.blog.repository.UserRepository;

// Controller, Repository, Configuration, Service, Component
// RestController, Bean
// 디스패처 서블릿의 역할

// @Controller viewResolver가 관여하고
// @RestController는 데이터만 리턴함..
// @Configuration 설정파일
// @Service : 트랜잭션 발동
// @Bean : 메서드에 거는 것.



@Service // IOC
public class UserService {

	@Autowired
	private UserRepository userRepository; // DI
	
	@Transactional  // commit이 필요하기 때문에
					// 함수 종료되면 트랜잭션 종료
	public int 회원가입(User user) {
		try {
			userRepository.save(user); // 호출할 때 user를 날린다.
			return 1;
		} catch (Exception e) {
			e.getMessage();
			return -1;
		}
	}
	
	
	
}
