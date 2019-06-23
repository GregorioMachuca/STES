package com.turismogroup.Turismo.models.services;

import java.util.List;
import java.util.Optional;

import com.turismogroup.Turismo.models.entities.Flota;

public interface IFlotaService {
 public List<Flota> findAll ();
	 
	 public Flota save (Flota Flota);
	 
	 public Optional <Flota> findBy (Long id);
	 
	 public void delete (Long id);
}
