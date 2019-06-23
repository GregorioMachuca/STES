package com.turismogroup.Turismo.models.services;

import java.util.List;
import java.util.Optional;

import com.turismogroup.Turismo.models.entities.RutaDetalle;

public interface IRutadetalleService {
 public List<RutaDetalle> findAll ();
	 
	 public RutaDetalle save (RutaDetalle RutaDetalle);
	 
	 public Optional <RutaDetalle> findBy (Long id);
	 
	 public void delete (Long id);
}
