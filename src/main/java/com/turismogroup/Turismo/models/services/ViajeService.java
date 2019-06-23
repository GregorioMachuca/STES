package com.turismogroup.Turismo.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.turismogroup.Turismo.models.dao.IviajeDao;
import com.turismogroup.Turismo.models.entities.Viaje;

public class ViajeService implements IViajeService {

	@Autowired
	private IviajeDao ViajeDao;
	
	@Override
	@Transactional (readOnly = true)
	public List<Viaje> findAll() {
		return ViajeDao.findAll();
	}

	@Override
	@Transactional
	public Viaje save(Viaje Viaje) {
		return ViajeDao.save(Viaje);
	}

	@Override
	@Transactional (readOnly = true)
	public Optional<Viaje> findBy(Long id) {
		return ViajeDao.findById(id);
	}

	@Override
	public void delete(Long id) {
		ViajeDao.deleteById(id);
		
	}

}
