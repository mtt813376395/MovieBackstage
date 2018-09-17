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
//ע��ӰƬ�����DAO
	private TypeDao typeDao;

	public void setTypeDao(TypeDao typeDao) {
		this.typeDao = typeDao;
	}
public PageBean<Type> findByPage(Integer currPage) {
		
		PageBean<Type> pageBean=new PageBean<Type>();
		//��װ��ǰ��ҳ��
		pageBean.setCurrPage(currPage);
		//��װÿҳ��ʾ�ļ�¼��
		int pageSize=8;
		pageBean.setPageSize(pageSize);
		
		//��װ�ܼ�¼��
		int totalCount=typeDao.findCount();
		pageBean.setTotalCount(totalCount);
		//��װ��ҳ��
		double tc=totalCount;
		Double num=Math.ceil(tc/pageSize);
		pageBean.setTotalPage(num.intValue());
		//��װÿҳ��ʾ������
		int begin=(currPage-1)*pageSize;
		List<Type> list=typeDao.findByPage(begin,pageSize);
		pageBean.setList(list);
		return pageBean;
	}

	public void save(Type type) {
		// TODO Auto-generated method stub
		typeDao.save(type);
	}

 
//����id��ѯ���
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
