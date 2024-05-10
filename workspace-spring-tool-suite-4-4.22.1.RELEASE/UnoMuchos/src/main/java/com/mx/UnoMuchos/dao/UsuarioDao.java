package com.mx.UnoMuchos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.UnoMuchos.entidad.Usuarios;

public interface UsuarioDao extends JpaRepository<Usuarios, String> {

}
