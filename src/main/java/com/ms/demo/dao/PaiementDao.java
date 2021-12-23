package com.ms.demo.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms.demo.bean.Paiement;

@Repository
public interface PaiementDao extends JpaRepository<Paiement, Long>{
	Paiement findByRef(String ref);
	
	int deleteByRef(String ref);
	
}
