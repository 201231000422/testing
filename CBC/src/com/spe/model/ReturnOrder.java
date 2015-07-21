package com.spe.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.spe.prototype.BasicModel;

@Entity
@Table(name="return_order")
public class ReturnOrder extends BasicModel{
	@Column(name="id")
	private String id;// 退单id，一个退单可以有多条退单记录
	@Column(name="return_man_id")
	private String return_man_id;// 请求退货员id
	@Column(name="goods_id")
	private String goods_id;// 货物id

	
	public ReturnOrder() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getReturn_man_id() {
		return return_man_id;
	}

	public void setReturn_man_id(String return_man_id) {
		this.return_man_id = return_man_id;
	}

	public String getGoods_id() {
		return goods_id;
	}

	public void setGoods_id(String goods_id) {
		this.goods_id = goods_id;
	}

	
}
