package com.spe.dao.Impl;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.spe.dao.UserDao;
import com.spe.model.User;
import com.spe.prototype.BasicImpl;

@Repository
public class UserDaoImpl extends BasicImpl<User> implements UserDao{
	

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		User resultUser=null;
		Session session=this.getSession();
		Query query=session.createQuery("from User u where u.account=? and u.password=?");
		query.setString(0, user.getAccount());
		query.setString(1, user.getPassword());
		List<User> userList=(List<User>)query.list();
		if(userList.size()>0){
			resultUser=userList.get(0);
		}
		return resultUser;
	}
	
	 
} 
