package com.turismogroup.Turismo.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.turismogroup.Turismo.models.dao.IFlotaDao;
import com.turismogroup.Turismo.models.entities.Flota;

public class FlotaService implements IFlotaService{

	@Autowired
	private IFlotaDao FlotaDao;
	
	@Override
	@Transactional (readOnly = true)
	public List<Flota> findAll() {
		return FlotaDao.findAll();
	}

	@Override
	@Transactional
	public Flota save(Flota Flota) {
		return FlotaDao.save(Flota);
	}

	@Override
	@Transactional (readOnly = true)
	public Optional<Flota> findBy(Long id) {
		return FlotaDao.findById(id);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		FlotaDao.deleteById(id);
		
	}

}
