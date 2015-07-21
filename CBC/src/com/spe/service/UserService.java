package com.spe.service;

import com.spe.model.User;

public interface UserService {
	
	public User login(User user);
	
	public void register(User user);
	
	public void update(User user);
	
	public void delete(User user);

}
