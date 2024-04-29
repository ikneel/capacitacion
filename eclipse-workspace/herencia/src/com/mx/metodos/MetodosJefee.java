package com.mx.metodos;

import com.mx.entidad.Jefe;

public interface MetodosJefee {
	public void guardar(Jefe jefe);
	
	public void editar(Jefe jefe, int indice);
	
	public void eliminar(int indice);
	
	public Jefe buscar(int indice);
	
	public void mostrar();
	
	
}