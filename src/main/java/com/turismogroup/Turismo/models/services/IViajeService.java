package com.turismogroup.Turismo.models.services;

import java.util.List;
import java.util.Optional;


import com.turismogroup.Turismo.models.entities.Viaje;

public interface IViajeService {
 public List<Viaje> findAll ();
	 
	 public Viaje save (Viaje Viaje);
	 
	 public Optional <Viaje> findBy (Long id);
	 
	 public void delete (Long id);
}
