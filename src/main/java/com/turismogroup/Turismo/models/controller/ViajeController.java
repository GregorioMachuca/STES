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

import com.turismogroup.Turismo.models.entities.Viaje;
import com.turismogroup.Turismo.models.services.IViajeService;
import com.turismogroup.Turismo.models.utils.NotFoundException;

public class ViajeController {
	public static final Logger Logger = LoggerFactory.getLogger(ViajeController.class);

	@Autowired
	private IViajeService ViajeService;
	
	@RequestMapping("")
	private List<Viaje> findAll(){
		return ViajeService.findAll(); 
	}
	
	@GetMapping("/{id}")
	public Viaje getOne (@PathVariable ("id") long id) {
		Logger.debug("Fetching Viaje with id {}", id);

		Optional<Viaje> viaje = ViajeService.findBy(id);
		if (!viaje.isPresent())
			throw new NotFoundException("id-" + id);
		return viaje.get();
	}
	
	@PostMapping("")
	public ResponseEntity<Object> create (@RequestBody Viaje newViaje) {
		Logger.info("Creating Viaje : {}", newViaje);
		
		 Viaje viaje = ViajeService.save(newViaje);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(viaje.getIdViaje()).toUri();
		return ResponseEntity.created(location).build().ok().body(viaje);	
	} 
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> update(@PathVariable("id") long id, @RequestBody Viaje viaje){
		
		Logger.info("Updating Viaje with id {}", id);
		
		Optional<Viaje> projectViaje = ViajeService.findBy(id);
		if (!projectViaje.isPresent())
			return ResponseEntity.notFound().build();
		viaje.setIdViaje(id);
		ViajeService.save(viaje);
		return ResponseEntity.noContent().build();
	}	
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") long id) {
		
		Logger.info("Fetching & Deleting Viaje with id {}", id);
		
		ViajeService.delete(id);
	}
}
