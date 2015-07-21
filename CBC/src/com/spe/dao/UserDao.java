package com.spe.dao;

import com.spe.model.User;

import com.spe.prototype.*;

public interface UserDao extends BasicDao<User>{
	
	public User login(User user);
	
}
