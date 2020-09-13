package com.example.blog.repository;

import com.example.blog.model.User;

public interface UserRepository {
	 public User findById(int id);
	 // persistance를 만들어준다. 자바오브젝트에 보관해주는 애
	 // Mybatis는 영속성을 만들어주는 프레임워크
	 // 리턴 필요하면 데이터타입쓰고 필요없으면 void쓴다.
	 
	 public void save(User user);
}
