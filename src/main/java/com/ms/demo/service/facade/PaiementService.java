package com.ms.demo.service.facade;

import com.ms.demo.bean.Paiement;

public interface PaiementService {

	Paiement findByRef(String ref);
	
	int deleteByRef(String ref);
	
	int save(Paiement paiement);
	
}
