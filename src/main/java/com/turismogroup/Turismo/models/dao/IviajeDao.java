package com.turismogroup.Turismo.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turismogroup.Turismo.models.entities.Viaje;


public interface IviajeDao extends JpaRepository<Viaje, Long> {

}
