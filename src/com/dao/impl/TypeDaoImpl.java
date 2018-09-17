package com.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dao.TypeDao;
import com.domain.Type;

public class TypeDaoImpl extends HibernateDaoSupport implements TypeDao {
	public int findCount() {
		String hql="select count(*) from Type";
		List<Long> list=this.getHibernateTemplate().find(hql);
		if(list.size()>0){
			return list.get(0).intValue();
		}
		return 0;
	}

	public void save(Type type) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(type);
	}



	public List<Type> findByPage(int begin, int pageSize) {
		DetachedCriteria criteria=DetachedCriteria.forClass(Type.class);
		List<Type> list=this.getHibernateTemplate().findByCriteria(criteria, begin, pageSize);
		
		return list;
	}

	public Type findById(Integer tid) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Type.class,tid);
	}

	public void update(Type type) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(type);
	}

	public void delete(Type type) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(type);
	}
	
 
}
