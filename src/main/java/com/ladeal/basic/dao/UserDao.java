package com.ladeal.basic.dao;

import java.io.Serializable;
import java.util.List;

import com.ladeal.basic.model.User;


public interface UserDao {

	public Serializable saveDao(User user);
	
	List<User> findAll();	
	
	void addUser(User user);
	
	void delete(String id);
}
