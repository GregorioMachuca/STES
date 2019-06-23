package com.turismogroup.Turismo.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.turismogroup.Turismo.models.dao.IMetodosdepagoDao;
import com.turismogroup.Turismo.models.entities.Metododepago;

public class MetododepagoService implements IMetodosdepagoService{

	@Autowired
	private IMetodosdepagoDao MetodosdepagoDao;
	
	@Override
	@Transactional (readOnly = true)
	public List<Metododepago> findAll() {
		return MetodosdepagoDao.findAll();
	}

	@Override
	@Transactional
	public Metododepago save(Metododepago Metododepago) {
		return MetodosdepagoDao.save(Metododepago);
	}

	@Override
	@Transactional (readOnly = true)
	public Optional<Metododepago> findBy(Long id) {
		return MetodosdepagoDao.findById(id);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		MetodosdepagoDao.deleteById(id);
		
	}

}
