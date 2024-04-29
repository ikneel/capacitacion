package com.mx.metodos;

public interface Metodos {
	
	public void guardar(Object object, String clase);
	
	public void editar(Object object, int indice, String clase );
	
	public void eliminar(Object object, int indice, String clase );
	
	public Object buscar(Object object, int indice, String clase );
	
	public void mostrar(String clase);
}
