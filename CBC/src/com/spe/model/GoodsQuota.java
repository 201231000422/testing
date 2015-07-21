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
@Table(name = "goods_quota")
public class GoodsQuota extends BasicModel {
	
	@Column(name = "goods_id")
	private String goodsId;
	
	@Column(name = "dep_id")
	private String depId;
	
	@Column(name = "quota")
	private int quota;
	
	public GoodsQuota() {
		super();
	}

	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getDepId() {
		return depId;
	}

	public void setDepId(String depId) {
		this.depId = depId;
	}

	public int getQuota() {
		return quota;
	}

	public void setQuota(int quota) {
		this.quota = quota;
	}

}
