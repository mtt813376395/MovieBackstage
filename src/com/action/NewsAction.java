package com.action;

import com.domain.News;
import com.domain.PageBean;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.service.NewsService;

public class NewsAction extends ActionSupport implements ModelDriven<News>{
    private News news=new News();
	public News getModel() {
		// TODO Auto-generated method stub
		return news;
	}
   private Integer currPage=1;
   
   public void setCurrPage(Integer currPage) {
	this.currPage = currPage;
}
  private NewsService newsService;
  public void setNewsService(NewsService newsService) {
	this.newsService = newsService;
}

public String findAll(){
	   PageBean<News> pageBean=newsService.findByPage(currPage);
	   ActionContext.getContext().getValueStack().push(pageBean);
	   return "findAll";
   }
public String saveUI(){
	return "saveUI";
}
public String save(){
	newsService.save(news);
	return "saveSuccess";
}
public String edit(){
	news=newsService.findById(news.getNid());
	return "editSuccess";
}
public String update(){
	newsService.update(news);
	return "updateSuccess";
}
public String delete(){
	news=newsService.findById(news.getNid());
	newsService.delete(news);
	return "deleteSuccess";
}
}
