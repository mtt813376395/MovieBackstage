package com.action;
import com.domain.PageBean;
import com.domain.Type;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.TypeService;
public class TypeAction extends ActionSupport implements ModelDriven<Type>{
	//模型驱动使用的对象
    private Type type=new Type();
	public Type getModel() {
		
		return type;
	}
	private Integer currPage=1;
	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}
	//注入影片分类的Service
	private TypeService typeService;
	
     public void setTypeService(TypeService typeService) {
		this.typeService = typeService;
	}
     public String findAll(){
 		
			PageBean<Type> pageBean=typeService.findByPage(currPage);
			ActionContext.getContext().getValueStack().push(pageBean);
	    	return "findAll";
	}
	
	//跳转到添加电影类别的页面的方法
	public String saveUI(){
		return "saveUI";
	}
	//添加部门的页面的执行方法
     public String save(){
    	 typeService.save(type);
 		return "saveSuccess";
     }
     
	
	public  String edit(){
		type=typeService.findById(type.getTid());
		return "editSuccess";
	}
	public String update(){
		typeService.update(type);
		return "updateSuccess";
	}
	public String delete(){
		type=typeService.findById(type.getTid());
		typeService.delete(type);
		return "deleteSuccess";
	}
}