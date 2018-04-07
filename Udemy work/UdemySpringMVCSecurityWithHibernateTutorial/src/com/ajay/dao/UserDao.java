package com.ajay.dao;

import com.ajay.model.Users;

public interface UserDao {
	Users findByUserName(String username);
}
