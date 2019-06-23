package com.turismogroup.Turismo.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.turismogroup.Turismo.models.dao.IRutadetalleDao;
import com.turismogroup.Turismo.models.entities.RutaDetalle;

public class RutadetalleService implements IRutadetalleService {

	@Autowired
	private IRutadetalleDao RutadetalleDao;
	
	@Override
	@Transactional (readOnly = true)
	public List<RutaDetalle> findAll() {
		return RutadetalleDao.findAll();
	}

	@Override
	@Transactional
	public RutaDetalle save(RutaDetalle RutaDetalle) {
		return RutadetalleDao.save(RutaDetalle);
	}

	@Override
	@Transactional (readOnly = true)
	public Optional<RutaDetalle> findBy(Long id) {
		return RutadetalleDao.findById(id);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		RutadetalleDao.deleteById(id);
		
	}

}
