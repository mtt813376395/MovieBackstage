package com.service.impl;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.dao.TypeDao;
import com.domain.Information;
import com.domain.PageBean;
import com.domain.Type;
import com.service.TypeService;
@Transactional
public class TypeServiceImpl implements TypeService {
//注入影片分类的DAO
	private TypeDao typeDao;

	public void setTypeDao(TypeDao typeDao) {
		this.typeDao = typeDao;
	}
public PageBean<Type> findByPage(Integer currPage) {
		
		PageBean<Type> pageBean=new PageBean<Type>();
		//封装当前的页数
		pageBean.setCurrPage(currPage);
		//封装每页显示的记录数
		int pageSize=8;
		pageBean.setPageSize(pageSize);
		
		//封装总记录数
		int totalCount=typeDao.findCount();
		pageBean.setTotalCount(totalCount);
		//封装总页数
		double tc=totalCount;
		Double num=Math.ceil(tc/pageSize);
		pageBean.setTotalPage(num.intValue());
		//封装每页显示的数据
		int begin=(currPage-1)*pageSize;
		List<Type> list=typeDao.findByPage(begin,pageSize);
		pageBean.setList(list);
		return pageBean;
	}

	public void save(Type type) {
		// TODO Auto-generated method stub
		typeDao.save(type);
	}

 
//根据id查询类别
	public Type findById(Integer tid) {
		
		return typeDao.findById(tid);
	}

	public void update(Type type) {
		// TODO Auto-generated method stub
		typeDao.update(type);
	}

	public void delete(Type type) {
		// TODO Auto-generated method stub
		typeDao.delete(type);
	}
	
}
