package com.spe.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.spe.prototype.BasicModel;

@Entity
@Table(name="return_record")
public class ReturnRecord extends BasicModel{
	@Column(name="id")
	private String id;// �˵���¼id
	@Column(name="return_order_id")
	private String return_order_id;// �˵�id��һ���˵������ж����˵���¼
	@Column(name="goods_id")
	private String goods_id;// ����id
	@Column(name="operator_id")
	private String operator_id;// ������id

	@Column(name="want_return_num")
	private int want_return_num;// �����˻���
	@Column(name="real_return_num")
	private int real_return_num;// ʵ���˻���
	@Column(name="status")
	private int status;// �˵�״̬��0��ʾ������1��ʾ������

	public ReturnRecord() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getReturn_order_id() {
		return return_order_id;
	}

	public void setReturn_order_id(String return_order_id) {
		this.return_order_id = return_order_id;
	}

	public String getGoods_id() {
		return goods_id;
	}

	public void setGoods_id(String goods_id) {
		this.goods_id = goods_id;
	}

	public String getOperator_id() {
		return operator_id;
	}

	public void setOperator_id(String operator_id) {
		this.operator_id = operator_id;
	}

	public int getWant_return_num() {
		return want_return_num;
	}

	public void setWant_return_num(int want_return_num) {
		this.want_return_num = want_return_num;
	}

	public int getReal_return_num() {
		return real_return_num;
	}

	public void setReal_return_num(int real_return_num) {
		this.real_return_num = real_return_num;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
