package com.mx.AutoresLibros.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.AutoresLibros.entidad.Autor;

public interface AutorDao extends JpaRepository<Autor, Integer>{

}
