package com.turismogroup.Turismo.models.services;

import java.util.List;
import java.util.Optional;

import com.turismogroup.Turismo.models.entities.Cliente;

public interface IClienteService {
	 public List<Cliente> findAll ();
	 
	 public Cliente save (Cliente Cliente);
	 
	 public Optional <Cliente> findBy (Long id);
	 
	 public void delete (Long id);
}
