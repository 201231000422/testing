package com.spe.service;

import java.util.List;

import com.spe.model.Vendor;

public interface VendorService {
	
	public void save(Vendor vendor);
	
	public void update(Vendor vendor);
	
	public void delete(Vendor vendor);
	
	public List<Vendor> list();

}
