package com.ex.personas.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ex.personas.entidad.Personas;

@Repository
public interface PersonasDao extends CrudRepository<Personas, String>{

}