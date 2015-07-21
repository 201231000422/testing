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
@Table(name = "goods")
public class Goods extends BasicModel {
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "is_ordered")
	private boolean isOrdered;
	
	@Column(name = "g_category_id")
	private String gCategoryId;
	
	@Column(name = "dist_way")
	private int distWay;
	
	@Column(name = "unit_price")
	private double unitPrice;
	
	@Column(name = "amount")
	private int amount;
	
	@Column(name = "is_cen_dist")
	private boolean isCenDist;
	
	@Column(name = "cen_time")
	private long cenTime;
	
	@Column(name = "level")
	private int level;
	
	@Column(name = "dist_principle")
	private int distPrinciple;
	
	@Column(name = "remark")
	private String remark;
	
	@Column(name = "unit")
	private String unit;

	public Goods() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isOrdered() {
		return isOrdered;
	}

	public void setOrdered(boolean isOrdered) {
		this.isOrdered = isOrdered;
	}

	public String getgCategoryId() {
		return gCategoryId;
	}

	public void setgCategoryId(String gCategoryId) {
		this.gCategoryId = gCategoryId;
	}

	public int getDistWay() {
		return distWay;
	}

	public void setDistWay(int distWay) {
		this.distWay = distWay;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public boolean isCenDist() {
		return isCenDist;
	}

	public void setCenDist(boolean isCenDist) {
		this.isCenDist = isCenDist;
	}

	public long getCenTime() {
		return cenTime;
	}

	public void setCenTime(long cenTime) {
		this.cenTime = cenTime;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getDistPrinciple() {
		return distPrinciple;
	}

	public void setDistPrinciple(int distPrinciple) {
		this.distPrinciple = distPrinciple;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

}
