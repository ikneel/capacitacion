package com.mx.UnoMuchos.service;


import com.mx.UnoMuchos.entidad.Usuarios;
import com.mx.UnoMuchos.respuesta.Respuesta;

public interface MetodosUsuario {
	public Respuesta guardar(Usuarios usuario);
	
	public Respuesta editar(Usuarios usuario);
	
	public Respuesta eliminar(Usuarios usuario);
	
	public Respuesta buscar(Usuarios usuario);
	
	public Respuesta mostrar(Usuarios usuario);
	

}
