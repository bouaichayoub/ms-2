package com.ms.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ms.demo.bean.Paiement;
import com.ms.demo.dao.PaiementDao;
import com.ms.demo.service.facade.PaiementService;

@Service
public class PaiementServiceImpl implements PaiementService{

	@Autowired
	private PaiementDao paiementDao;
	@Override
	public Paiement findByRef(String ref) {
		return paiementDao.findByRef(ref);
	}

	@Override
	@Transactional
	public int deleteByRef(String ref) {
		return paiementDao.deleteByRef(ref);
	}

	@Override
	public int save(Paiement paiement) {
		if(findByRef(paiement.getRef()) != null) {
			return -1;
		}else {
			paiementDao.save(paiement);
			return 1;
		}
	}

}
