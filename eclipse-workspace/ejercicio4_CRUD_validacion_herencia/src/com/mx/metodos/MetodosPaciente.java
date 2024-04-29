package com.mx.metodos;

import com.mx.entidad.Paciente;

public interface MetodosPaciente {
	
	public void guardar(Paciente paciente);
	
	public void editar(Paciente paciente, int indice);
	
	public void eliminar(int indice);
	
	public Paciente buscar(int indice);
	
	public void mostrar();
	
	public void listar();
	
}
