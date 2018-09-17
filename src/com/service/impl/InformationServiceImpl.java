package com.service.impl;

import java.util.List;


import org.springframework.transaction.annotation.Transactional;

import com.dao.InformationDao;
import com.domain.Information;
import com.domain.PageBean;
import com.service.InformationService;
@Transactional
public class InformationServiceImpl implements InformationService {
    private InformationDao informationDao;
    
	public void setInformationDao(InformationDao informationDao) {
		this.informationDao = informationDao;
	}

	public PageBean<Information> findByPage(Integer currPage) {
		
		PageBean<Information> pageBean=new PageBean<Information>();
		//封装当前的页数
		pageBean.setCurrPage(currPage);
		//封装每页显示的记录数
		int pageSize=5;
		pageBean.setPageSize(pageSize);
		
		//封装总记录数
		int totalCount=informationDao.findCount();
		pageBean.setTotalCount(totalCount);
		//封装总页数
		double tc=totalCount;
		Double num=Math.ceil(tc/pageSize);
		pageBean.setTotalPage(num.intValue());
		//封装每页显示的数据
		int begin=(currPage-1)*pageSize;
		List<Information> list=informationDao.findByPage(begin,pageSize);
		pageBean.setList(list);
		return pageBean;
	}
//保存电影信息
	public void save(Information information) {
		informationDao.save(information);
		
	}

	public Information findById(Integer iid) {
		
		return informationDao.findById(iid);
	}
//修改电影信息
	public void update(Information information) {
		informationDao.update(information);
		
	}

	public void delete(Information information) {
		informationDao.delete(information);
		
	}

}
