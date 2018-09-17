package com.service.impl;

import com.dao.UserDao;
import com.domain.User;
import com.service.UserService;

public class UserServiceImpl implements UserService {
  private UserDao userDao;

public void setUserDao(UserDao userDao) {
	this.userDao = userDao;
}

public User login(User user) {
	User existUser=userDao.findByUsernameAndPassword(user);
	return existUser;
}
  
}
