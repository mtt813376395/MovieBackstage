package com.service;

import com.domain.Information;
import com.domain.PageBean;

public interface InformationService {

	PageBean<Information> findByPage(Integer currPage);

	void save(Information information);

	Information findById(Integer iid);

	void update(Information information);

	void delete(Information information);

}
