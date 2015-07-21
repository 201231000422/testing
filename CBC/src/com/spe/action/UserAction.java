package com.spe.action;

import javax.annotation.Resource;
import net.sf.json.JSONObject;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;

import com.spe.model.User;
import com.spe.prototype.BasicAction;
import com.spe.service.UserService;
import com.spe.util.JsonUtil;
import com.spe.util.StringUtil;

@Scope("prototype")
@Namespace("/")
@Action(value="user",results={@Result(name="success",type="dispatcher",location="/result.jsp")})
public class UserAction extends BasicAction{
	

	
	/**
	 * default
	 * login
	 * resource user
	 */
	@Override
	public String execute() {
		User user = this.getUser();
		if(user != null && !StringUtil.isEmpty(user.account) && !StringUtil.isEmpty(user.password)){
			User currentUser = this.getUserService().login(this.getUser());
			if(currentUser != null){
				currentUser.trimUser();
				JSONObject object = JsonUtil.okJs(currentUser);
				this.getRequest().setAttribute("json", object);
			}
		}else{
			JSONObject object = JsonUtil.errorJs("error account or password");
			this.getRequest().setAttribute("json", object);
		}
		return SUCCESS;
	}

	/**
	 * register user
	 * @return
	 */
	public String register() {
		User user = this.getUser();
		if(user != null){
			user.trimUser();
			if(StringUtil.isEmpty(user.account) || StringUtil.isEmpty(user.name) || StringUtil.isEmpty(user.password) || StringUtil.isEmpty(user.phone) || StringUtil.isEmpty(user.departmentId)){
				return null;
			}
			this.getUserService().register(this.getUser());
		}
		return null;
	}
	
	/**
	 * update userInfo
	 * @param user
	 * @return
	 */
	public void updateUser(User user) {
		this.getUserService().update(user);
	}
	
	/**
	 * delete user (logic)
	 * @param user
	 */
	public void deleteUser(User user) {
		this.getUserService().delete(user);
	}
	
}
