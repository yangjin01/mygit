package com.tyjy.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tyjy.app.entity.User;
import com.tyjy.app.service.impl.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserContorller {
	@Autowired
	private UserServiceImpl us;
	@RequestMapping("/findById")
	public String findById() {
		return us.findById(0).toString();
		
	}
	@RequestMapping("/find")
	public String find() {
		List<User> userList=us.find();
		return userList.toString();
		//return "ppppp";
	}
	@RequestMapping("/hello")
	public String Hello() {
		return  "hello world";
	}
}
