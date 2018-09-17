package com.dao;

import java.util.List;

import com.domain.Information;

public interface InformationDao {

	int findCount();

	List<Information> findByPage(int begin, int pageSize);

	void save(Information information);

	Information findById(Integer iid);

	void update(Information information);

	void delete(Information information);

}
