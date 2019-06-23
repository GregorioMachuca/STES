package com.turismogroup.Turismo.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.turismogroup.Turismo.models.dao.IRutaDao;
import com.turismogroup.Turismo.models.entities.Ruta;

public class RutaService implements IRutaService {

	@Autowired
	private IRutaDao RutaDao;
	
	@Override
	@Transactional (readOnly = true)
	public List<Ruta> findAll() {
		return RutaDao.findAll();
	}

	@Override
	@Transactional
	public Ruta save(Ruta Ruta) {
		return RutaDao.save(Ruta);
	}

	@Override
	@Transactional (readOnly = true)
	public Optional<Ruta> findBy(Long id) {
		return RutaDao.findById(id);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		RutaDao.deleteById(id);
		
	}

}
