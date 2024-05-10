package com.mx.UnoMuchos2.service;


import com.mx.UnoMuchos2.entidad.Persona;
import com.mx.UnoMuchos2.respuesta.Respuesta;

public interface MetodosPersona {
	public Respuesta guardar(Persona persona);
	
	public Respuesta editar(Persona persona);
	
	public Respuesta eliminar(Persona persona);
	
	public Respuesta buscar(Persona persona);
	
	public Respuesta mostrar();
	
	public Respuesta mostrarGenero(String genero);
	
	public Respuesta mostrarViejitos();
	
	public Respuesta personaSinMascota();
	
}
