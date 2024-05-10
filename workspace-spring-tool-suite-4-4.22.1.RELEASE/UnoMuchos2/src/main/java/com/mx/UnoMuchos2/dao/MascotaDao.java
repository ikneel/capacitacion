package com.mx.UnoMuchos2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.UnoMuchos2.entidad.Mascotas;

public interface MascotaDao extends JpaRepository<Mascotas, String> {

}
