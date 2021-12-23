package com.ms.demo.service.facade;

import com.ms.demo.bean.TypePaiement;

public interface TypePaiementService {

	TypePaiement findByCode(String code);
	
	int deleteByCode(String code);
	
	int save(TypePaiement typePaiement);
	
}
