package com.mx.AutoresLibros.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.AutoresLibros.entidad.Libro;

public interface LibroDao extends JpaRepository<Libro, String> {

}
