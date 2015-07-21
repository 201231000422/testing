package com.spe.action;

import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;

import com.spe.model.Vendor;
import com.spe.prototype.BasicAction;
import com.spe.service.VendorService;
import com.spe.util.JsonUtil;
/**
 * 
 * @author Liang Bizhi
 *
 */
@Scope("prototype")
@Namespace("/")
@Action(value="vendor",results={@Result(name="success",type="dispatcher",location="/result.jsp")})
public class VendorAction extends BasicAction{	

	private static final long serialVersionUID = 1L;

	private Vendor vendor;
	
	@Resource
	private VendorService vendorService; 

	@Override
	public String execute() {
		List<Vendor> vendors = this.getVendorService().list();
		JSONObject jsArray = JsonUtil.okJs(vendors);
		this.getRequest().setAttribute("json", jsArray);
		return SUCCESS;
	}

	public void save() {
		this.getVendorService().save(getVendor());
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public VendorService getVendorService() {
		return vendorService;
	}

	public void setVendorService(VendorService vendorService) {
		this.vendorService = vendorService;
	}
	
}
