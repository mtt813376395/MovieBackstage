package com.service;

import com.domain.PageBean;
import com.domain.Type;

public interface TypeService {

	

	PageBean<Type> findByPage(Integer currPage);

	void save(Type type);

	Type findById(Integer tid);

	void update(Type type);

	void delete(Type type);

	
    
}
