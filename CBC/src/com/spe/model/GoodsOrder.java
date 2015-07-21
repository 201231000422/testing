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
@Table(name = "goods_order")
public class GoodsOrder extends BasicModel {
	
	@Column(name = "status")
	private int status;
	
	@Column(name = "operator_id")
	private String operatorId;
	
	@Column(name = "send_time")
	private long sendTime;
	
	@Column(name = "remark")
	private String remark;
	
	@Column(name = "receive_time")
	private long receiveTime;
	
	public GoodsOrder() {
		super();
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public long getSendTime() {
		return sendTime;
	}

	public void setSendTime(long sendTime) {
		this.sendTime = sendTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public long getReceiveTime() {
		return receiveTime;
	}

	public void setReceiveTime(long receiveTime) {
		this.receiveTime = receiveTime;
	}

}
