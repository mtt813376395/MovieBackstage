package com.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dao.InformationDao;
import com.domain.Information;

public class InformationDaoImpl extends HibernateDaoSupport implements InformationDao {

	public int findCount() {
		String hql="select count(*) from Information";
		List<Long> list=this.getHibernateTemplate().find(hql);
		if(list.size()>0){
			return list.get(0).intValue();
		}
		return 0;
	}

	public List<Information> findByPage(int begin, int pageSize) {
		DetachedCriteria criteria=DetachedCriteria.forClass(Information.class);
		List<Information> list=this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
		return list;
	}

	public void save(Information information) {
		this.getHibernateTemplate().save(information);
		
	}

	public Information findById(Integer iid) {
		
		return this.getHibernateTemplate().get(Information.class,iid);
	}

	public void update(Information information) {
		this.getHibernateTemplate().update(information);
		
	}

	public void delete(Information information) {
		this.getHibernateTemplate().delete(information);
		
	}

}
