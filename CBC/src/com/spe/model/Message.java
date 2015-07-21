package com.spe.model;

import javax.persistence.Column;

public class Message {
	@Column(name="content")
	public String content;
	
	@Column(name="operator_id")
	public String operatorId;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
}
