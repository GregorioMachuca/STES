package com.turismogroup.Turismo.models.services;

import java.util.List;
import java.util.Optional;

import com.turismogroup.Turismo.models.entities.Aranceles;

public interface IArancelesService {
 public List<Aranceles> findAll ();
 
 public Aranceles save (Aranceles Aranceles);
 
 public Optional <Aranceles> findBy (Long id);
 
 public void delete (Long id);
 
}
