package com.spe.service.Impl;

import java.util.List;

import org.hsqldb.lib.StringUtil;
import org.springframework.stereotype.Service;

import com.spe.model.Vendor;
import com.spe.prototype.BasicServiceImpl;
import com.spe.service.VendorService;

@Service
public class GoodsServiceImpl extends BasicServiceImpl implements VendorService{

	@Override
	public void save(Vendor vendor) {
		if(StringUtil.isEmpty(vendor.getVendorName())) {
			return;
		}
		this.getVendorDao().save(vendor);
	}
	

	@Override
	public void update(Vendor vendor) {
		
	}

	@Override
	public void delete(Vendor vendor) {
		
	}


	@Override
	public List<Vendor> list() {
		return this.getVendorDao().find();
	}

}
