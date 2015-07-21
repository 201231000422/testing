package com.spe.prototype;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import com.spe.enums.DeleteEnum;

@MappedSuperclass
public class BasicModel {
	
	@Id
	@Column(name="id")
	public String id;
	
	@Column(name="create_time")
	public Long createTime;
	
	@Column(name="update_time")
	public Long updateTime;
	
	@Column(name="is_deleted")
	public int isDelete;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public Long getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}

	
}
