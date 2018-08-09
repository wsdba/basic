package com.ladeal.basic.service;

import java.util.List;

import com.ladeal.basic.model.User;


public interface UserService {
	
	public void saveUser(User user);

    List<User> findAll();
	 
	void addUser(User user);
		
    void delete(String ids);
}
