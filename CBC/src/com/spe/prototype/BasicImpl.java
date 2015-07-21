package com.spe.prototype;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

import net.sf.json.JSONArray;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hsqldb.lib.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;

import com.spe.enums.DeleteEnum;
import com.spe.util.JsonUtil;
import com.spe.util.UuidUtil;

/**
 * 
 * @author keithchen
 *
 * @param <T>
 */
@MappedSuperclass
public class BasicImpl<T extends BasicModel> implements BasicDao<T>{
	
	Class clazz;
	private SessionFactory sessionFactory;
	
	/**
	 * init
	 */
	public BasicImpl(){
		ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass(); 
		this.clazz = (Class<T>) pt.getActualTypeArguments()[0];
	}
		
	/**
	 * BeforeSaveModel,init id,updateTime,createTime,isDelete
	 * @param model
	 */
	public void beforeSave(T model){
		Long curTime = System.currentTimeMillis();
		if(StringUtil.isEmpty(model.id)){
	      model.id = UuidUtil.generateUUID();
	    }
	    if(model.createTime == null){
	      model.createTime = curTime;
	    }
	    model.updateTime = curTime;
	}
	
	/**
	 * SaveModel
	 * @param Model
	 */
	public void save(T model){
		this.beforeSave(model);
		this.getSession().save(model);
		this.getSession().flush();
	}
	
	/**
	 * findModelById
	 * @param id
	 */
	public T findById(String id){
		Session session = this.getSession();
		T model = (T)(session.get(clazz,id));
		if(DeleteEnum.isDelete(model.isDelete)){
			return null;
		}
		return model;
	}
	
	/**
	 * DeleteModelById(Just set isDelete)
	 * @param id
	 */
	public void deleteById(String id){
		T model = this.findById(id);
		if(model != null){
			model.isDelete = DeleteEnum.isDeleted.getValue();
		}
		update(model);
	}
	
	/**
	 * findAllModelList (noDelete) 
	 */
	public List<T> find(){
		Session session = this.getSession();
		String query = "from " + clazz.getSimpleName() + " t where t.isDelete = " + DeleteEnum.noDelete.getValue();
		return session.createQuery(query).list();
	}
	
	/**
	 * findByYouHql 
	 * the first args is your hql and the other is your hql args
	 */
	public List<T> find(Object ... strArray){
		String hql;
		if(strArray == null || strArray.length == 0){
			return this.find();
		}
		Session session = this.getSession();
		if(strArray[0] instanceof String){
			hql = (String)strArray[0];
		}else{
			return this.find();
		}
		Query query = session.createQuery(hql);
		for(int i = 1 ,length = strArray.length; i < length ; i++){
			query.setParameter(i-1,strArray[i]);
		}
		List<T> list = query.list();
		for(T each : list){
			if(DeleteEnum.isDelete(each.isDelete)){
				list.remove(each);
			}
		}
		return list;
	}
	
	public SessionFactory getSessionFactory(){
		return this.sessionFactory;
	}
	
	@Resource
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void update(T model) {
		if(!StringUtil.isEmpty(model.id)){
			Session session = this.getSession();
			session.update(model);
			session.flush();
		}
	}
	
	
}
