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
@Table(name = "goods_order_item")
public class GoodsOrderItem extends BasicModel {
	
	@Column(name = "goods_order_id")
	private String goodsOrderId;
	
	@Column(name = "goods_id")
	private String goodsId;
	
	@Column(name = "goods_num")
	private int goodsNum;
	
	@Column(name = "total_money")
	private double totalMoney;
		
	public GoodsOrderItem() {
		super();
	}

	public String getGoodsOrderId() {
		return goodsOrderId;
	}

	public void setGoodsOrderId(String goodsOrderId) {
		this.goodsOrderId = goodsOrderId;
	}

	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public int getGoodsNum() {
		return goodsNum;
	}

	public void setGoodsNum(int goodsNum) {
		this.goodsNum = goodsNum;
	}

	public double getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(double totalMoney) {
		this.totalMoney = totalMoney;
	}
}
