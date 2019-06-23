package com.turismogroup.Turismo.models.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.turismogroup.Turismo.models.entities.Metododepago;
import com.turismogroup.Turismo.models.services.IMetodosdepagoService;
import com.turismogroup.Turismo.models.utils.NotFoundException;

public class MetododepagoController {
	public static final Logger Logger = LoggerFactory.getLogger(MetododepagoController.class);

	@Autowired
	private IMetodosdepagoService MetododepagoService;
	
	@RequestMapping("")
	private List<Metododepago> findAll(){
		return MetododepagoService.findAll(); 
	}
	
	@GetMapping("/{id}")
	public Metododepago getOne (@PathVariable ("id") long id) {
		Logger.debug("Fetching Metododepago with id {}", id);

		Optional<Metododepago> metododepago = MetododepagoService.findBy(id);
		if (!metododepago.isPresent())
			throw new NotFoundException("id-" + id);
		return metododepago.get();
	}
	
	@PostMapping("")
	public ResponseEntity<Object> create (@RequestBody Metododepago newMetododepago) {
		Logger.info("Creating Metododepago : {}", newMetododepago);
		
		 Metododepago metododepago = MetododepagoService.save(newMetododepago);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(metododepago.getIdMpago()).toUri();
		return ResponseEntity.created(location).build().ok().body(metododepago);	
	} 
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> update(@PathVariable("id") long id, @RequestBody Metododepago metododepago){
		
		Logger.info("Updating Metododepago with id {}", id);
		
		Optional<Metododepago> projectMetododepago = MetododepagoService.findBy(id);
		if (!projectMetododepago.isPresent())
			return ResponseEntity.notFound().build();
		metododepago.setIdMpago(id);
		MetododepagoService.save(metododepago);
		return ResponseEntity.noContent().build();
	}	
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") long id) {
		
		Logger.info("Fetching & Deleting Metododepago with id {}", id);
		
		MetododepagoService.delete(id);
	}

}



