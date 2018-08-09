package com.ladeal.basic.action;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.ladeal.basic.model.User;
import com.ladeal.basic.service.UserService;

public class LoginAction extends BaseAction{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public UserService userService;
	
	public UserService getUserService() {
			return userService;
	}
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public String login(){
		String id=ServletActionContext.getRequest().getParameter("username");
 		String password=ServletActionContext.getRequest().getParameter("password");
		if(id.equals("root")&&password.equals("123456")){
			return "success";
		}
		return "failured";
	}
	
	public void test() {
			User u = new User();
		userService.saveUser(u);
	}
}
