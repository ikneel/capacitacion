package com.mx.UnoMuchos2.service;


import com.mx.UnoMuchos2.entidad.Mascotas;
import com.mx.UnoMuchos2.respuesta.Respuesta;

public interface MetodosMascota {
	public Respuesta guardar(Mascotas mascota);
	
	public Respuesta editar(Mascotas mascota);
	
	public Respuesta eliminar(Mascotas mascota);
	
	public Respuesta buscar(Mascotas mascota);
	
	public Respuesta mostrar();
	
	public Respuesta mascotasPersona(String persona);
	
	public Respuesta mascotasCiudad(String ciudad);
	
	public Respuesta mascotaGordita();
	
	public Respuesta mascotaSinDueño();
	
}