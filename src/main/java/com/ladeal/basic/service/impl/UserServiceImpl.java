package com.ladeal.basic.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ladeal.basic.dao.UserDao;
import com.ladeal.basic.dao.impl.UserDaoImpl;
import com.ladeal.basic.model.User;
import com.ladeal.basic.service.UserService;


@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

	private UserDao userDao = new UserDaoImpl();
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void saveUser(User user) {
		user.setName("111");
		user.setAccount("fym");
		user.setPassword("a45678c29");
		userDao.saveDao(user);
	}

	public List<User> findAll() {
		return userDao.findAll();
	}

	public void addUser(User user) {
		userDao.addUser(user);
	}

	public void delete(String ids) {
		userDao.delete(ids);
	}
}
