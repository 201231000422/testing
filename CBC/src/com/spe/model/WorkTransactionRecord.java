package com.spe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.spe.prototype.BasicModel;

@Entity
@Table(name = "work_transaction_record")
public class WorkTransactionRecord extends BasicModel{
	@Column(name = "from_user_id")
	private String fromUserId;
	@Column(name = "to_user_id")
	private String toUserId;
	@Column(name = "message")
	private String message;
	@Column
	private String status;
	
	public String getFromUserId() {
		return fromUserId;
	}
	public void setFromUserId(String fromUserId) {
		this.fromUserId = fromUserId;
	}
	public String getToUserId() {
		return toUserId;
	}
	public void setToUserId(String toUserId) {
		this.toUserId = toUserId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
