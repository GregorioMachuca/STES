package com.turismogroup.Turismo.models.services;

import java.util.List;
import java.util.Optional;

import com.turismogroup.Turismo.models.entities.Metododepago;

public interface IMetodosdepagoService {
 public List<Metododepago> findAll ();
	 
	 public Metododepago save (Metododepago Metododepago);
	 
	 public Optional <Metododepago> findBy (Long id);
	 
	 public void delete (Long id);
}
