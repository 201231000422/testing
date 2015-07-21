package com.spe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.spe.prototype.BasicModel;
/**
 * Transaction table
 * @author chensiyuan
 *
 */
@Entity
@Table(name="transaction")
public class Transaction extends BasicModel{
	@Column(name = "work_transaction_id")
	private String work_transaction_id;
	@Column(name = "user_id")
	private String user_id;
	@Column(name = "remind")
	private int remind;
	@Column(name = "status")
	private int status;
	public String getWork_transaction_id() {
		return work_transaction_id;
	}
	public void setWork_transaction_id(String work_transaction_id) {
		this.work_transaction_id = work_transaction_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public int getRemind() {
		return remind;
	}
	public void setRemind(int remind) {
		this.remind = remind;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
