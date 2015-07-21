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
@Table(name = "vendor")
public class Vendor extends BasicModel {
	@Column(name = "vendor_name")
	private String vendorName;
	@Column(name = "address")
	private String address;
	@Column(name = "post_code")
	private String postCode;
	@Column(name = "vendor_phone")
	private String vendorPhone;
	@Column(name = "chief_man")
	private String chiefMan;
	@Column(name = "chief_man_phone")
	private String chiefManPhone;

	public Vendor() {
		super();
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getVendorPhone() {
		return vendorPhone;
	}

	public void setVendorPhone(String vendorPhone) {
		this.vendorPhone = vendorPhone;
	}

	public String getChiefMan() {
		return chiefMan;
	}

	public void setChiefMan(String chiefMan) {
		this.chiefMan = chiefMan;
	}

	public String getChiefManPhone() {
		return chiefManPhone;
	}

	public void setChiefManPhone(String chiefManPhone) {
		this.chiefManPhone = chiefManPhone;
	}

}
