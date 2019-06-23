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



import com.turismogroup.Turismo.models.entities.Aranceles;
import com.turismogroup.Turismo.models.services.IArancelesService;
import com.turismogroup.Turismo.models.utils.NotFoundException;

public class ArancelesController {

		
		public static final Logger Logger = LoggerFactory.getLogger(ArancelesController.class);

		@Autowired
		private IArancelesService ArancelesService;
		
		@RequestMapping("")
		private List<Aranceles> findAll(){
			return ArancelesService.findAll(); 
		}
		
		@GetMapping("/{id}")
		public Aranceles getOne (@PathVariable ("id") long id) {
			Logger.debug("Fetching Aranceles with id {}", id);

			Optional<Aranceles> aranceles = ArancelesService.findBy(id);
			if (!aranceles.isPresent())
				throw new NotFoundException("id-" + id);
			return aranceles.get();
		}
		
		@PostMapping("")
		public ResponseEntity<Object> create (@RequestBody Aranceles newAranceles) {
			Logger.info("Creating Aranceles : {}", newAranceles);
			
			Aranceles aranceles = ArancelesService.save(newAranceles);
			
			URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(aranceles.getIdAranceles()).toUri();
			return ResponseEntity.created(location).build().ok().body(aranceles);	
		} 
		
		@PutMapping("/{id}")
		public ResponseEntity<Object> update(@PathVariable("id") long id, @RequestBody Aranceles aranceles){
			
			Logger.info("Updating Aranceles with id {}", id);
			
			Optional<Aranceles> projectAranceles = ArancelesService.findBy(id);
			if (!projectAranceles.isPresent())
				return ResponseEntity.notFound().build();
			aranceles.setIdAranceles(id);
			ArancelesService.save(aranceles);
			return ResponseEntity.noContent().build();
		}	
		
		@DeleteMapping("/{id}")
		public void delete(@PathVariable("id") long id) {
			
			Logger.info("Fetching & Deleting Aranceles with id {}", id);
			
			ArancelesService.delete(id);
		}

	}


