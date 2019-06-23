package com.turismogroup.Turismo.models.services;

import java.util.List;
import java.util.Optional;


import com.turismogroup.Turismo.models.entities.Ruta;

public interface IRutaService {
 public List<Ruta> findAll ();
	 
	 public Ruta save (Ruta Ruta);
	 
	 public Optional <Ruta> findBy (Long id);
	 
	 public void delete (Long id);
}
