package com.dao;

import com.domain.User;

public interface UserDao {

	User findByUsernameAndPassword(User user);

}
