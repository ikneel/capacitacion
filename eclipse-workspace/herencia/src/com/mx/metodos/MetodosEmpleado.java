package com.mx.metodos;

import com.mx.entidad.Empleado;

public interface MetodosEmpleado {
	
	public void guardar(Empleado empleado);
	public void editar(Empleado empleado, int indice);
	public void eliminar(int indice);
	public Empleado buscar(int indice);
	public void mostrar();

}
