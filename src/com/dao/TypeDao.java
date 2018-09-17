package com.dao;

import java.util.List;

import com.domain.Type;

public interface TypeDao {
	int findCount();
	List<Type> findByPage(int begin, int pageSize);
	void save(Type type);
	
	
	Type findById(Integer tid);
	void update(Type type);
	void delete(Type type);

	

}
