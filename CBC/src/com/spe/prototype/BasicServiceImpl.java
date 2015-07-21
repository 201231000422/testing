package com.spe.prototype;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.MappedSuperclass;

import com.spe.dao.DepartmentDao;
import com.spe.dao.UserDao;
import com.spe.dao.VendorDao;

@MappedSuperclass
public class BasicServiceImpl {
	
	@Resource
	private  DepartmentDao departmentDao;
	
	
	@Resource
	public UserDao userDao;
	
	@Resource
	private VendorDao vendorDao;

	public VendorDao getVendorDao() {
		return vendorDao;
	}

	public void setVendorDao(VendorDao vendorDao) {
		this.vendorDao = vendorDao;
	}
	
	public DepartmentDao getDepartmentDao() {
		return departmentDao;
	}


	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}


	public UserDao getUserDao() {
		return userDao;
	}


	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
}
