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

import com.turismogroup.Turismo.models.entities.Flota;
import com.turismogroup.Turismo.models.services.IFlotaService;
import com.turismogroup.Turismo.models.utils.NotFoundException;

public class FlotaController {
	public static final Logger Logger = LoggerFactory.getLogger(FlotaController.class);

	@Autowired
	private IFlotaService FlotaService;
	
	@RequestMapping("")
	private List<Flota> findAll(){
		return FlotaService.findAll(); 
	}
	
	@GetMapping("/{id}")
	public Flota getOne (@PathVariable ("id") long id) {
		Logger.debug("Fetching Flota with id {}", id);

		Optional<Flota> flota = FlotaService.findBy(id);
		if (!flota.isPresent())
			throw new NotFoundException("id-" + id);
		return flota.get();
	}
	
	@PostMapping("")
	public ResponseEntity<Object> create (@RequestBody Flota newFlota) {
		Logger.info("Creating Flota : {}", newFlota);
		
		 Flota flota = FlotaService.save(newFlota);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(flota.getIdMatricula()).toUri();
		return ResponseEntity.created(location).build().ok().body(flota);	
	} 
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> update(@PathVariable("id") long id, @RequestBody Flota flota){
		
		Logger.info("Updating Flota with id {}", id);
		
		Optional<Flota> projectFlota = FlotaService.findBy(id);
		if (!projectFlota.isPresent())
			return ResponseEntity.notFound().build();
		flota.setIdMatricula(id);
		FlotaService.save(flota);
		return ResponseEntity.noContent().build();
	}	
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") long id) {
		
		Logger.info("Fetching & Deleting Flota with id {}", id);
		
		FlotaService.delete(id);
	}

}


