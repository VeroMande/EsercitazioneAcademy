package com.fincons.academy.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fincons.academy.dto.PromemoriaDTO;
import com.fincons.academy.model.entities.Promemoria;
import com.fincons.academy.services.PromemoriaService;

@RestController
@RequestMapping(value = "/promemoria")
public class PromemoriaController {
	
	// con autowired faccio la injection dei getter e setter 
	@Autowired
	private PromemoriaService promemoriaService;
	
	
	//get totale
	@GetMapping("/")
	public List<PromemoriaDTO> findAllPromemoria(){
	List<PromemoriaDTO> allprom = promemoriaService.findAll();
		return allprom;
	}
		
		
	/* get per id */
	@GetMapping("/{id}")
	//@GetMapping(path = "/promemoria/{id}", produces = "application/json")
	public Promemoria getPromemoriaById(@PathVariable ("id") Integer id){
	Promemoria prom = promemoriaService.findPromemoriaById(id);
		return prom;
	}
		
	/* creazione: mi serve l'oggetto (userDto) 
	* contiene i dati che mi arrivano dalla post effettuata dal frontend*/
	@PostMapping
	public Integer create(@RequestBody PromemoriaDTO prom ) {
		Integer key  = promemoriaService.save(prom);
		return key;
	}
		
		
	//passo la primary key
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		promemoriaService.delete(id);
	}
		
		
	@PutMapping("/{id}")
	public PromemoriaDTO update(@PathVariable("id") Integer id, @RequestBody PromemoriaDTO prom ) {
		return promemoriaService.update(id, prom);
	}
		
		
	@GetMapping
	public PromemoriaDTO findByTesto(@RequestParam("testo") String testo, @RequestParam("dataScadenza") String dataScadenza ) {
		return promemoriaService.findByTesto(testo, dataScadenza);
	}

}
