package com.ex.personas.service;

import java.util.List;

import com.ex.personas.entidad.Personas;
import com.ex.personas.respuesta.Respuesta;

public interface MetodosPersona {

	public Respuesta guardar(Personas persona);
	
	public Respuesta editar(Personas persona);
	 
	public Respuesta eliminar(Personas persona);
	
	public Respuesta buscar(Personas persona);
	
	public Respuesta mostrar();
	
	public Respuesta mostrarViejos();
	
	public Respuesta mostrarGenero(String genero);
	
	public Respuesta mostrarCiudad();
	
	public Respuesta calcularPeso();
	
	public Respuesta buscarCiudadCp(String ciudad, String codigoPostal);
	
	public Respuesta buscarApellidos(String apellidop, String apellidom);
	
}
