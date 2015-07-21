package com.spe.service;

import java.util.List;

import com.spe.model.Goods;

public interface GoodsService {
	
	public void save(Goods goods);
	
	public void update(Goods goods);
	
	public void delete(Goods goods);
	
	public List<Goods> list();

}
