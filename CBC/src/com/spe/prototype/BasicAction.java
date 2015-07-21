package com.spe.prototype;

import javax.annotation.Resource;
import javax.persistence.MappedSuperclass;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.spe.model.Department;
import com.spe.model.User;
import com.spe.model.Vendor;
import com.spe.service.DepartmentService;
import com.spe.service.UserService;
import com.spe.service.VendorService;

@MappedSuperclass
public abstract class BasicAction extends ActionSupport implements ServletRequestAware{	
	
	//All Service
	@Resource
	private DepartmentService departmentService;

	@Resource
	private UserService userService;
	
	//All Model
	private Department department;

	private User user;
	

	private HttpServletRequest request;

	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request=request;
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public DepartmentService getDepartmentService() {
		return departmentService;
	}

	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
