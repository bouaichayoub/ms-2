package com.ms.demo.ws.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.demo.bean.Paiement;
import com.ms.demo.requiered.CommandeRequiered;
import com.ms.demo.service.facade.PaiementService;
import com.ms.demo.vo.CommandeVo;

@RestController
@RequestMapping(value= "/api/paiement")
public class PaiementRest {
	
	@Autowired
	private PaiementService paiementService; 
	
	@GetMapping("/ref/{ref}")
	public Paiement findByRef(@PathVariable String ref) {
		return paiementService.findByRef(ref);
	}
	@DeleteMapping("/ref/{ref}")
	public int deleteByRef(@PathVariable String ref) {
		return paiementService.deleteByRef(ref);
	}
	
	@PostMapping("/")
	public int save(@RequestBody Paiement paiement){
		return paiementService.save(paiement);
	}
}
