package com.mx.UnoMuchos.service;

import com.mx.UnoMuchos.entidad.Red;
import com.mx.UnoMuchos.respuesta.Respuesta;

public interface MetodosRed {
	
	public Respuesta guardar(Red red);
	
	public Respuesta editar(Red red);
	
	public Respuesta eliminar(Red red);
	
	public Respuesta buscar(Red red);
	
	public Respuesta mostrar(Red red);
	

}
