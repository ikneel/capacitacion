package com.mx.metodos;

import com.mx.entidad.Persona;

public interface MetodosPersonas {
	
	public void guardar(Persona persona);
	
	public void editar(Persona persona , int indice);
	
	public void eliminar(int indice);
	
	public Persona buscar(int indice);
	
	public void mostrar();
	
}
