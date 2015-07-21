package com.spe.service.Impl;


import org.hsqldb.lib.StringUtil;
import org.springframework.stereotype.Service;

import com.spe.model.User;
import com.spe.prototype.BasicServiceImpl;
import com.spe.service.UserService;

@Service
public class UserServiceImpl extends BasicServiceImpl implements UserService{

	
	@Override
	public User login(User user) {
		return this.getUserDao().login(user);
	}
	
	@Override
	public void register(User user){
		if(StringUtil.isEmpty(user.account) || StringUtil.isEmpty(user.password)){
			return ;
		}
		this.getUserDao().save(user);
		
	}

	@Override
	public void update(User user) {
		this.userDao.update(user);
		
	}

	@Override
	public void delete(User user) {
		this.userDao.deleteById(user.id);
	}

}
