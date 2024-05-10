package com.mx.AutoresLibros.service;


import com.mx.AutoresLibros.entidad.Libro;
import com.mx.AutoresLibros.respuesta.Respuesta;

public interface MetodosLibro {

public Respuesta guardar(Libro libro);
	
	public Respuesta editar(Libro libro);
	
	public Respuesta eliminar(Libro libro);
	
	public Respuesta buscar(Libro libro);
	
	public Respuesta mostrar();
}
