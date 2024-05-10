package com.mx.AutoresLibros.service;


import com.mx.AutoresLibros.entidad.Autor;
import com.mx.AutoresLibros.respuesta.Respuesta;

public interface MetodosAutor {
	
	public Respuesta guardar(Autor autor);
	
	public Respuesta editar(Autor autor);
	
	public Respuesta eliminar(Autor autor);
	
	public Respuesta buscar(Autor autor);
	
	public Respuesta mostrar();
}
