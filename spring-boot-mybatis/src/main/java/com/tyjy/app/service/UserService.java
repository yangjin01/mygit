package com.tyjy.app.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.tyjy.app.entity.User;



@Service
public interface UserService {

	User findById(Integer id);

	List<User> find();
	
}
