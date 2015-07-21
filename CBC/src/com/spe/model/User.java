package com.spe.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.spe.prototype.*;
import javax.persistence.Column;;

@Entity
@Table(name="user")
public class User extends BasicModel{
	
	@Column(name="name")
	public String name;
	
	@Column(name="department_id")
	public String departmentId;
	
	@Column(name="phone")
	public String phone;
	
	@Column(name="account")
	public String account;
	
	@Column(name="password")
	public String password;
	
	public User(){
		super();
	}
	
	public User(String name,String departmentId){
		super();
		this.name = name;
		this.departmentId = departmentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void trimUser(){
		this.account = this.account.trim();
		this.password = this.password.trim();
		this.departmentId = this.departmentId.trim();
		this.name = this.name.trim();
		this.phone = this.phone.trim();
	}
	
	
	
	

}
