package com.ms.demo.ws.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.demo.bean.TypePaiement;
import com.ms.demo.service.facade.TypePaiementService;

@RestController
@RequestMapping(value= "api/type-paiement")
public class TypePaiementRest {
	
	@Autowired
	private TypePaiementService typePaiementService; 
	
	@GetMapping("/code/{code}")
	public TypePaiement findByRef(@PathVariable String code) {
		return typePaiementService.findByCode(code);
	}
	@DeleteMapping("/code/{code}")
	public int deleteByCode(@PathVariable String code) {
		return typePaiementService.deleteByCode(code);
	}
	
	@PostMapping("/")
	public int save(@RequestBody TypePaiement typePaiement){
		return typePaiementService.save(typePaiement);
	}
}
