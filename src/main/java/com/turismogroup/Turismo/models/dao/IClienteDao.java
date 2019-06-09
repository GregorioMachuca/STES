package com.turismogroup.Turismo.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turismogroup.Turismo.models.entities.Cliente;

public interface IClienteDao extends JpaRepository<Cliente, Long> {

}
