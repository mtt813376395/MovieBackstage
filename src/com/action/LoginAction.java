package com.action;

import com.domain.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.UserService;

public class LoginAction extends ActionSupport implements ModelDriven<User>{
	private User user=new User();
	public User getModel() {
		
		return user;
	}
	//注入业务层的类
	private UserService userService;
	
  public void setUserService(UserService userService) {
		this.userService = userService;
	}

public String execute() throws Exception{
	  System.out.println("login执行了....");
	 
	  //调用业务层的类
	  User existUser=userService.login(user);
	  if(existUser==null){
		  this.addActionError("用户名或密码错误！");
		  return INPUT;
		  		
	  }else{
		  ActionContext.getContext().getSession().put("existUser", existUser);
		  return SUCCESS;
	  }
	  
  }
}
