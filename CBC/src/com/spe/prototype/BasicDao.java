package com.spe.prototype;

import java.util.List;

import javax.persistence.MappedSuperclass;

import com.spe.prototype.BasicModel;

@MappedSuperclass
public interface  BasicDao<T extends BasicModel> {
	
	public void beforeSave(T model);
	
	public void save(T model);
	
	public T findById(String id);
	
	public void deleteById(String id);
	
	public List<T> find();
	
	public List<T> find(Object ...strArray);
	
	public void update(T model);
}
