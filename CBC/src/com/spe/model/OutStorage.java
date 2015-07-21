package com.spe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.spe.prototype.BasicModel;
/**
 * 出库记录
 * @author Liang Bizhi
 *
 */
@Entity
@Table(name = "out_storage")
public class OutStorage extends BasicModel {
	
	@Column(name = "goods_id")
	private String goodsId;
	
	@Column(name = "operator_id")
	private String operatorId;
	
	@Column(name = "amount")
	private int amount;
	
	@Column(name = "out_type")
	private int outType;
	
	@Column(name = "desciption")
	private String description;
		
	@Column(name = "vendor_id")
	private String vendorId;
		
	public OutStorage() {
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

	public int getOutType() {
		return outType;
	}

	public void setOutType(int outType) {
		this.outType = outType;
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
