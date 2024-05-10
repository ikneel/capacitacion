package com.mx.UnoMuchos.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.mx.UnoMuchos.dao.RedDao;
import com.mx.UnoMuchos.entidad.Red;
import com.mx.UnoMuchos.respuesta.Respuesta;

public class RedService implements MetodosRed {
	@Autowired
	RedDao dao;
	@Override
	public Respuesta guardar(Red red) {
		Respuesta rs = new Respuesta();
		if(dao.findAll().isEmpty()) {
			dao.save(red);
			rs.setMensaje("La red ha sido registrada");
			rs.setSucces(true);
			rs.setObj(red);
			return rs;
		}else {
			if(dao.existsById(red.getId())) {
				rs.setMensaje("Este id ya existe");
				rs.setSucces(false);
				rs.setObj(dao.findById(red.getId()));
			}else {
				for(Red r : dao.findAll()) {
					if(red.getNombre().equalsIgnoreCase(r.getNombre())) {
						rs.setMensaje("Este nombre ya existe");
						rs.setSucces(false);
						rs.setObj(r);
					}
				}
				dao.save(red);
				rs.setMensaje("La red fue agregada");
				rs.setSucces(true);
				rs.setObj(red);
			}
		}
		return null;
	}

	@Override
	public Respuesta editar(Red red) {
		
		return null;
	}

	@Override
	public Respuesta eliminar(Red red) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Respuesta buscar(Red red) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Respuesta mostrar(Red red) {
		// TODO Auto-generated method stub
		return null;
	}

}