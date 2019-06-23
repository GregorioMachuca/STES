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

import com.turismogroup.Turismo.models.utils.NotFoundException;
import com.turismogroup.Turismo.models.entities.Cliente;
import com.turismogroup.Turismo.models.services.IClienteService;
import com.turismogroup.Turismo.models.utils.NotFoundException;

public class ClienteController {

	public static final Logger Logger = LoggerFactory.getLogger(ClienteController.class);

	@Autowired
	private IClienteService ClienteService;
	
	@RequestMapping("")
	private List<Cliente> findAll(){
		return ClienteService.findAll(); 
	}
	
	@GetMapping("/{id}")
	public Cliente getOne (@PathVariable ("id") long id) {
		Logger.debug("Fetching Cliente with id {}", id);

		Optional<Cliente> cliente = ClienteService.findBy(id);
		if (!cliente.isPresent())
			throw new NotFoundException("id-" + id);
		return cliente.get();
	}
	
	@PostMapping("")
	public ResponseEntity<Object> create (@RequestBody Cliente newCliente) {
		Logger.info("Creating Cliente : {}", newCliente);
		
		Cliente cliente = ClienteService.save(newCliente);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(cliente.getDui()).toUri();
		return ResponseEntity.created(location).build().ok().body(cliente);	
	} 
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> update(@PathVariable("id") long id, @RequestBody Cliente cliente){
		
		Logger.info("Updating Cliente with id {}", id);
		
		Optional<Cliente> projectCliente = ClienteService.findBy(id);
		if (!projectCliente.isPresent())
			return ResponseEntity.notFound().build();
		cliente.setDui(id);
		ClienteService.save(cliente);
		return ResponseEntity.noContent().build();
	}	
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") long id) {
		
		Logger.info("Fetching & Deleting Cliente with id {}", id);
		
		ClienteService.delete(id);
	}

}
