package com.mx.UnoMuchos2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.UnoMuchos2.entidad.Persona;

public interface PersonaDao extends JpaRepository<Persona, String>{

}
