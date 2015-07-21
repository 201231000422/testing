package com.spe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.spe.prototype.BasicModel;
/**
 * 入库记录
 * @author Liang Bizhi
 *
 */
@Entity
@Table(name = "in_storage")
public class InStorage extends BasicModel {
	
	@Column(name = "goods_id")
	private String goodsId;
	
	@Column(name = "operator_id")
	private String operatorId;
	
	@Column(name = "amount")
	private int amount;
	
	@Column(name = "in_type")
	private int inType;
	
	@Column(name = "desciption")
	private String description;
		
	@Column(name = "vendor_id")
	private String vendorId;
		
	public InStorage() {
		super();
	}

	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getInType() {
		return inType;
	}

	public void setInType(int inType) {
		this.inType = inType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

}
