package com.example.blog.model;

import org.springframework.stereotype.Component;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Test {
	private int id;
	private String name;
	public int age = 30;
	private int money = 10000;
}
