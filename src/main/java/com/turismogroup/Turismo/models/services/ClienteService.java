package com.turismogroup.Turismo.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


import com.turismogroup.Turismo.models.dao.IClienteDao;
import com.turismogroup.Turismo.models.entities.Cliente;

public class ClienteService implements IClienteService{

	@Autowired
	private IClienteDao ClienteDao;
	
	@Override
	@Transactional (readOnly = true)
	public List<Cliente> findAll() {
	
		return ClienteDao.findAll();
	}

	@Override
	@Transactional
	public Cliente save(Cliente Cliente) {
		return ClienteDao.save(Cliente);
	}

	@Override
	@Transactional (readOnly = true)
	public Optional<Cliente> findBy(Long id) {
		return ClienteDao.findById(id);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		ClienteDao.deleteById(id);
		
	}

	
}
