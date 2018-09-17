package com.service.impl;

import java.util.List;


import org.springframework.transaction.annotation.Transactional;

import com.dao.InformationDao;
import com.domain.Information;
import com.domain.PageBean;
import com.service.InformationService;
@Transactional
public class InformationServiceImpl implements InformationService {
    private InformationDao informationDao;
    
	public void setInformationDao(InformationDao informationDao) {
		this.informationDao = informationDao;
	}

	public PageBean<Information> findByPage(Integer currPage) {
		
		PageBean<Information> pageBean=new PageBean<Information>();
		//��װ��ǰ��ҳ��
		pageBean.setCurrPage(currPage);
		//��װÿҳ��ʾ�ļ�¼��
		int pageSize=5;
		pageBean.setPageSize(pageSize);
		
		//��װ�ܼ�¼��
		int totalCount=informationDao.findCount();
		pageBean.setTotalCount(totalCount);
		//��װ��ҳ��
		double tc=totalCount;
		Double num=Math.ceil(tc/pageSize);
		pageBean.setTotalPage(num.intValue());
		//��װÿҳ��ʾ������
		int begin=(currPage-1)*pageSize;
		List<Information> list=informationDao.findByPage(begin,pageSize);
		pageBean.setList(list);
		return pageBean;
	}
//�����Ӱ��Ϣ
	public void save(Information information) {
		informationDao.save(information);
		
	}

	public Information findById(Integer iid) {
		
		return informationDao.findById(iid);
	}
//�޸ĵ�Ӱ��Ϣ
	public void update(Information information) {
		informationDao.update(information);
		
	}

	public void delete(Information information) {
		informationDao.delete(information);
		
	}

}
