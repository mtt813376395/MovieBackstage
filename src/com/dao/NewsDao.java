package com.dao;

import java.util.List;

import com.domain.News;

public interface NewsDao {

	int findCount();

	List<News> findByPage(int begin, int pageSize);

	void save(News news);

	News findById(Integer nid);

	void update(News news);

	void delete(News news);

}
