package com.service;

import com.domain.News;
import com.domain.PageBean;

public interface NewsService {

	PageBean<News> findByPage(Integer currPage);

	void save(News news);

	News findById(Integer nid);

	void update(News news);

	void delete(News news);

	

}
