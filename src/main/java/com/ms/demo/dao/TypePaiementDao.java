package com.ms.demo.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms.demo.bean.TypePaiement;

@Repository
public interface TypePaiementDao extends JpaRepository<TypePaiement, Long>{
	TypePaiement findByCode(String code);
	
	int deleteByCode(String code);
	
}
