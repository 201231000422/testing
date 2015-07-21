package com.spe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.spe.prototype.BasicModel;

@Entity
@Table(name="department")
public class Department extends BasicModel{
	
	@Column(name="name")
	public String name;
	
	@Column(name="level")
	public int level;
	
	@Column(name="parent_id")
	public String parentId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	
	public Department(String name,int level,String parentId){
		this.name = name;
		this.level = level;
		this.parentId = parentId;
		
	}
	
	public Department(){
		
	}
	
}
