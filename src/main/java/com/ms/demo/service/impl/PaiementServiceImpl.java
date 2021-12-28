package com.ms.demo.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ms.demo.bean.Paiement;
import com.ms.demo.dao.PaiementDao;
import com.ms.demo.requiered.CommandeRequiered;
import com.ms.demo.service.facade.PaiementService;
import com.ms.demo.vo.CommandeVo;

@Service
public class PaiementServiceImpl implements PaiementService{

	Logger logger= LoggerFactory.getLogger(PaiementService.class);
	
	@Autowired
	private CommandeRequiered commandeRequiered; 
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
		logger.info("[BEGIN]save paiement [/BEGIN]");
		CommandeVo commandeVo = commandeRequiered.findByReference(paiement.getCommandeRef());
		if(findByRef(paiement.getRef()) != null) {
			return -1;
		}else if(commandeVo == null || commandeVo.getId() == null) {
			return -2;
		}else {
			paiementDao.save(paiement);
			logger.info("[FIN]save paiement [/FIN]");
			return 1;
		}
	}

}
