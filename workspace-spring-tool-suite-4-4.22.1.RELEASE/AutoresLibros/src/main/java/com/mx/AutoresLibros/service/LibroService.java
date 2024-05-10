package com.mx.AutoresLibros.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.AutoresLibros.dao.LibroDao;
import com.mx.AutoresLibros.entidad.Libro;
import com.mx.AutoresLibros.respuesta.Respuesta;

@Service
public class LibroService implements MetodosLibro{
	@Autowired
	LibroDao dao;
	@Override
	public Respuesta guardar(Libro libro) {
		Respuesta rs = new Respuesta();
		if(dao.findAll().isEmpty()) {
			dao.save(libro);
			rs.setMensaje("EL libro se registro");
			rs.setSucces(true);
			rs.setObj(libro);
			return rs;
		}
		if(dao.existsById(libro.getIsbn())) {
			rs.setMensaje("EL libro no se ha registrado por que ya existe");
			rs.setSucces(false);
			rs.setObj(dao.findById(libro.getIsbn()));
			return rs;
		}
		for(Libro l : dao.findAll()) {
			if(libro.getTitulo().equalsIgnoreCase(l.getTitulo())) {
				rs.setMensaje("El libro que tratas de registrar ya existe");
				rs.setSucces(false);
				rs.setObj(l);
				return rs;
			}
		}
		dao.save(libro);
		rs.setMensaje("El libro ha sido registrado");
		rs.setSucces(true);
		rs.setObj(libro);
		return rs;
	}

	@Override
	public Respuesta editar(Libro libro) {
		Respuesta rs = new Respuesta();
		Libro libro_aux = dao.findById(libro.getIsbn()).orElse(null);
		if(libro_aux == null) {
			rs.setMensaje("El libro que tratas de editar no esta regitrado");
			rs.setObj(null);
			rs.setSucces(false);
			return rs;
		}
		libro_aux.setTitulo(libro.getTitulo());
		libro_aux
	}

	@Override
	public Respuesta eliminar(Libro libro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Respuesta buscar(Libro libro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Respuesta mostrar() {
		// TODO Auto-generated method stub
		return null;
	}

}