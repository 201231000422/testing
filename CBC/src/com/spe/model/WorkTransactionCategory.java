package com.spe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.spe.prototype.BasicModel;

/**
 * transaction detail table
 * @author chensiyuan
 *
 */
@Entity
@Table(name = "work_transaction_category")
public class WorkTransactionCategory extends BasicModel{
	@Column(name = "name")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
