package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.IBankDao;

@Service(value="BankServiceImpl")
@Transactional	//ÊÂÎñµÄ
public class BankServiceImpl implements IBankService {

	@Autowired
	private IBankDao bankDao;

	@Override
	public void zhuanzhang() {
		bankDao.updatezhangsan(1);
		bankDao.updatelisi(2);
	}

}
