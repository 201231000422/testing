package com.spe.action;


import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;

import com.spe.prototype.BasicAction;


@Scope("prototype")
@Namespace("/")
@Action(value="department",results={@Result(name="success",type="dispatcher",location="/result.jsp")})
public class DepartmentAction extends BasicAction{
	
	/**
	 * default
	 * login
	 * resource user
	 */
	@Override
	public String execute() {
		
		return SUCCESS;
	}

}
