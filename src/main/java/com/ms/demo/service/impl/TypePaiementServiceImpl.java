package com.ms.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ms.demo.bean.TypePaiement;
import com.ms.demo.dao.TypePaiementDao;
import com.ms.demo.service.facade.TypePaiementService;

@Service
public class TypePaiementServiceImpl implements TypePaiementService{

	@Autowired
	private TypePaiementDao typePaiementDao;

	@Override
	public TypePaiement findByCode(String code) {
		return typePaiementDao.findByCode(code);
	}

	@Override
	@Transactional
	public int deleteByCode(String code) {
		return typePaiementDao.deleteByCode(code);
	}

	@Override
	public int save(TypePaiement typePaiement) {
		if(findByCode(typePaiement.getCode()) != null) {
			return -1;
		}else {
			typePaiementDao.save(typePaiement);
			return 1;
		}
	}
	

}
