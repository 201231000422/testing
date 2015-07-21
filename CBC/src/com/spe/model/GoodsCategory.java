package com.spe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.spe.prototype.BasicModel;
/**
 * 
 * @author Liang Bizhi
 *
 */
@Entity
@Table(name = "goods_category")
public class GoodsCategory extends BasicModel {
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "parent_id")
	private String parentId;
	
	public GoodsCategory() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
}
