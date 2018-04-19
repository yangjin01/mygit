package com.tyjy.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyjy.app.dao.UserDao;
import com.tyjy.app.entity.User;
import com.tyjy.app.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	@Override
	public User findById(Integer id) {
		User user=userDao.findById(id);
		return user;
	}
	@Override
	public List<User> find() {
		List<User> userList=userDao.find();
		return userList;
	}

}
