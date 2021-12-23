package com.ms.demo.requiered;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ms.demo.vo.CommandeVo;

@FeignClient(name = "MS-COMMANDE", url = "http://localhost:8081/api/commande")
public interface CommandeRequiered {

	@GetMapping("/ref/{reference}")
	public CommandeVo findByReference(@PathVariable String reference);
	
	@PutMapping("/")
	CommandeVo update(@RequestBody CommandeVo commandeVo);
	
}
