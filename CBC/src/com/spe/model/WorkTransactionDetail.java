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
@Table(name = "work_transaction_detail")
public class WorkTransactionDetail extends BasicModel{
	@Column(name = "name")
	private String name;
	
	@Column(name = "transaction_cate_id")
	private String transaction_cate_id;
	
	@Column(name = "secure_department_id")
	private String secure_department_id;
	
	@Column(name = "secure_level")
	private int secure_level;
	
	@Column(name = "facilitator")
	private String facilitator;
	
	@Column(name = "first_trial_deadline")
	private int first_trial_deadline;
	
	@Column(name = "response_deadline")
	private int response_deadline;
	
	@Column(name = "arrive_deadline")
	private int arrive_deadline;
	
	@Column(name = "handle_deadline")
	private int handle_deadline;
	
	@Column(name = "remark")
	private String remark;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTransaction_cate_id() {
		return transaction_cate_id;
	}
	public void setTransaction_cate_id(String transaction_cate_id) {
		this.transaction_cate_id = transaction_cate_id;
	}
	public String getSecure_department_id() {
		return secure_department_id;
	}
	public void setSecure_department_id(String secure_department_id) {
		this.secure_department_id = secure_department_id;
	}
	public int getSecure_level() {
		return secure_level;
	}
	public void setSecure_level(int secure_level) {
		this.secure_level = secure_level;
	}
	public String getFacilitator() {
		return facilitator;
	}
	public void setFacilitator(String facilitator) {
		this.facilitator = facilitator;
	}
	public int getFirst_trial_deadline() {
		return first_trial_deadline;
	}
	public void setFirst_trial_deadline(int first_trial_deadline) {
		this.first_trial_deadline = first_trial_deadline;
	}
	public int getResponse_deadline() {
		return response_deadline;
	}
	public void setResponse_deadline(int response_deadline) {
		this.response_deadline = response_deadline;
	}
	public int getArrive_deadline() {
		return arrive_deadline;
	}
	public void setArrive_deadline(int arrive_deadline) {
		this.arrive_deadline = arrive_deadline;
	}
	public int getHandle_deadline() {
		return handle_deadline;
	}
	public void setHandle_deadline(int handle_deadline) {
		this.handle_deadline = handle_deadline;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
