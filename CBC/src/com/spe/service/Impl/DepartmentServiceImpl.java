package com.spe.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import com.spe.dao.DepartmentDao;
import com.spe.model.Department;
import com.spe.prototype.BasicServiceImpl;
import com.spe.service.DepartmentService;

public class DepartmentServiceImpl extends BasicServiceImpl implements DepartmentService{
	
	@Override
	public void save(Department department){
		this.getDepartmentDao().save(department);
	}

	@Override
	public List<Department> find(Object... strArray) {
		return this.getDepartmentDao().find(strArray);
	}

}