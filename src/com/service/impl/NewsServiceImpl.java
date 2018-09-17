package com.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.dao.NewsDao;
import com.domain.Information;
import com.domain.News;
import com.domain.PageBean;
import com.service.NewsService;
@Transactional
public class NewsServiceImpl implements NewsService {
   private NewsDao newsDao;
   public void setNewsDao(NewsDao newsDao) {
	this.newsDao = newsDao;
}
public PageBean<News> findByPage(Integer currPage) {
	PageBean<News> pageBean=new PageBean<News>();
	//封装当前的页数
			pageBean.setCurrPage(currPage);
			//封装每页显示的记录数
			int pageSize=5;
			pageBean.setPageSize(pageSize);
			
			//封装总记录数
			int totalCount=newsDao.findCount();
			pageBean.setTotalCount(totalCount);
			//封装总页数
			double tc=totalCount;
			Double num=Math.ceil(tc/pageSize);
			pageBean.setTotalPage(num.intValue());
			//封装每页显示的数据
			int begin=(currPage-1)*pageSize;
			List<News> list=newsDao.findByPage(begin,pageSize);
			pageBean.setList(list);
			
	return pageBean;
}
public void save(News news) {
	newsDao.save(news);
}
public News findById(Integer nid) {
	// TODO Auto-generated method stub
	return newsDao.findById(nid);
}
public void update(News news) {
	newsDao.update(news);
	
}
public void delete(News news) {
	// TODO Auto-generated method stub
	newsDao.delete(news);
}
}
