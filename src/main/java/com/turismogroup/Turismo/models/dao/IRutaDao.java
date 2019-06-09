package com.turismogroup.Turismo.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turismogroup.Turismo.models.entities.Ruta;

public interface IRutaDao extends JpaRepository<Ruta, Long> {

}
