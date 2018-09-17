package com.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dao.NewsDao;
import com.domain.Information;
import com.domain.News;

public class NewsDaoImpl extends HibernateDaoSupport implements NewsDao {

	public int findCount() {
		String hql="select count(*) from News";
		List<Long> list=this.getHibernateTemplate().find(hql);
		if(list.size()>0){
			return list.get(0).intValue();
		}
		return 0;
	}

	public List<News> findByPage(int begin, int pageSize) {
		DetachedCriteria criteria=DetachedCriteria.forClass(News.class);
		List<News> list=this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
		return list;
	}

	public void save(News news) {
		this.getHibernateTemplate().save(news);
	}

	public News findById(Integer nid) {
		
		return this.getHibernateTemplate().get(News.class, nid);
	}

	public void update(News news) {
		this.getHibernateTemplate().update(news);
		
	}

	public void delete(News news) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(news);
	}

}
