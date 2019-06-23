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

import com.turismogroup.Turismo.models.entities.Ruta;
import com.turismogroup.Turismo.models.services.IRutaService;
import com.turismogroup.Turismo.models.utils.NotFoundException;

public class RutaController {
	public static final Logger Logger = LoggerFactory.getLogger(RutaController.class);

	@Autowired
	private IRutaService RutaService;
	
	@RequestMapping("")
	private List<Ruta> findAll(){
		return RutaService.findAll(); 
	}
	
	@GetMapping("/{id}")
	public Ruta getOne (@PathVariable ("id") long id) {
		Logger.debug("Fetching Ruta with id {}", id);

		Optional<Ruta> ruta = RutaService.findBy(id);
		if (!ruta.isPresent())
			throw new NotFoundException("id-" + id);
		return ruta.get();
	}
	
	@PostMapping("")
	public ResponseEntity<Object> create (@RequestBody Ruta newRuta) {
		Logger.info("Creating Ruta : {}", newRuta);
		
		 Ruta ruta = RutaService.save(newRuta);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(ruta.getIdRuta()).toUri();
		return ResponseEntity.created(location).build().ok().body(ruta);	
	} 
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> update(@PathVariable("id") long id, @RequestBody Ruta ruta){
		
		Logger.info("Updating Ruta with id {}", id);
		
		Optional<Ruta> projectRuta = RutaService.findBy(id);
		if (!projectRuta.isPresent())
			return ResponseEntity.notFound().build();
		ruta.setIdRuta(id);
		RutaService.save(ruta);
		return ResponseEntity.noContent().build();
	}	
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") long id) {
		
		Logger.info("Fetching & Deleting Ruta with id {}", id);
		
		RutaService.delete(id);
	}
}
