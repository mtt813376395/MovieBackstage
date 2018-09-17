package com.action;

import com.domain.Information;
import com.domain.PageBean;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.InformationService;

public class InformationAction extends ActionSupport implements ModelDriven<Information>{
    private Information information=new Information();
	public Information getModel() {
		
		return information;
	}
	private Integer currPage=1;
	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}
  private InformationService informationService;
public void setInformationService(InformationService informationService) {
	this.informationService = informationService;
}
  //���յ�ǰҳ��
 
 public String findAll(){
	 PageBean<Information> pageBean=informationService.findByPage(currPage);
	 ActionContext.getContext().getValueStack().push(pageBean);
	 return "findAll";
 }
 //��ת����ӵ�Ӱ��Ϣ
 public String saveUI(){
	 return "saveUI";
 }
 //�����Ӱ��Ϣ
 public String save(){
	 informationService.save(information);
	 return "saveSuccess";
 }
 //�޸ĵ�Ӱ��Ϣ
 public String edit(){
	 information=informationService.findById(information.getIid());
	 return "editSuccess";
 }
 public String update(){
	 informationService.update(information);
	 return "updateSuccess";
 }
 public String delete(){
	 information=informationService.findById(information.getIid());
	 informationService.delete(information);
	 return "deleteSuccess";
 }
}