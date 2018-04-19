package com.tyjy.app.dao;

import java.util.List;

import com.tyjy.app.entity.User;


public interface UserDao {
	public User findById(Integer id);
	public List<User> find();
}
