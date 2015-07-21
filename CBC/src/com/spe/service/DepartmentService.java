package com.spe.service;

import java.util.List;

import com.spe.model.Department;

public interface DepartmentService {
	
	public void save(Department department);
	
	public List<Department> find(Object ... strArray);

}
