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
	//ע��ҵ������
	private UserService userService;
	
  public void setUserService(UserService userService) {
		this.userService = userService;
	}

public String execute() throws Exception{
	  System.out.println("loginִ����....");
	 
	  //����ҵ������
	  User existUser=userService.login(user);
	  if(existUser==null){
		  this.addActionError("�û������������");
		  return INPUT;
		  		
	  }else{
		  ActionContext.getContext().getSession().put("existUser", existUser);
		  return SUCCESS;
	  }
	  
  }
}
