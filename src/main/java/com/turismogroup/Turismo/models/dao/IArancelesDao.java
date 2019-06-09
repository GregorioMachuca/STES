package com.turismogroup.Turismo.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turismogroup.Turismo.models.entities.Aranceles;

public interface IArancelesDao extends JpaRepository<Aranceles, Long> {

}
