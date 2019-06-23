package com.turismogroup.Turismo.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.turismogroup.Turismo.models.dao.IArancelesDao;
import com.turismogroup.Turismo.models.entities.Aranceles;

public class ArancelesService implements IArancelesService{
	

@Autowired
private IArancelesDao ArancelesDao;

@Override
@Transactional (readOnly = true)
public List <Aranceles> findAll () {
	
	return ArancelesDao.findAll();
	
}

@Override
@Transactional
public Aranceles save(Aranceles Aranceles) {
	return ArancelesDao.save(Aranceles);
}

@Override
@Transactional (readOnly = true)
public Optional<Aranceles> findBy(Long id) {
	return ArancelesDao.findById(id);
}

@Override
@Transactional 
public void delete(Long id) {
ArancelesDao.deleteById(id);
	
}


}
