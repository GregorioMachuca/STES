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

import com.turismogroup.Turismo.models.entities.RutaDetalle;
import com.turismogroup.Turismo.models.services.IRutadetalleService;
import com.turismogroup.Turismo.models.utils.NotFoundException;

public class RutaDetalleController {
	public static final Logger Logger = LoggerFactory.getLogger(RutaDetalleController.class);

	@Autowired
	private IRutadetalleService RutadetalleService;
	
	@RequestMapping("")
	private List<RutaDetalle> findAll(){
		return RutadetalleService.findAll(); 
	}
	
	@GetMapping("/{id}")
	public RutaDetalle getOne (@PathVariable ("id") long id) {
		Logger.debug("Fetching RutaDetalle with id {}", id);

		Optional<RutaDetalle> rutadetalle = RutadetalleService.findBy(id);
		if (!rutadetalle.isPresent())
			throw new NotFoundException("id-" + id);
		return rutadetalle.get();
	}
	
	@PostMapping("")
	public ResponseEntity<Object> create (@RequestBody RutaDetalle newRutaDetalle) {
		Logger.info("Creating RutaDetalle : {}", newRutaDetalle);
		
		 RutaDetalle rutadetalle = RutadetalleService.save(newRutaDetalle);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(rutadetalle.getRutadetalleID()).toUri();
		return ResponseEntity.created(location).build().ok().body(rutadetalle);	
	} 
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> update(@PathVariable("id") long id, @RequestBody RutaDetalle rutadetalle){
		
		Logger.info("Updating RutaDetalle with id {}", id);
		
		Optional<RutaDetalle> projectRutaDetalle = RutadetalleService.findBy(id);
		if (!projectRutaDetalle.isPresent())
			return ResponseEntity.notFound().build();
		rutadetalle.setRutadetalleID(id);
		RutadetalleService.save(rutadetalle);
		return ResponseEntity.noContent().build();
	}	
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") long id) {
		
		Logger.info("Fetching & Deleting RutaDetalle with id {}", id);
		
		RutadetalleService.delete(id);
	}
}
