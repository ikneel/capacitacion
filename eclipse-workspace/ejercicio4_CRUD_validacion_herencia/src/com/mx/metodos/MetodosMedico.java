package com.mx.metodos;

import com.mx.entidad.Medico;
import com.mx.entidad.Paciente;
public interface MetodosMedico {
	
	public void guardar(Medico medico);
	
	public void editar(Medico medico, int indice);
	
	public void eliminar(int indice);
	
	public Medico buscar(int indice);
	
	public void mostrar();
	
	public void listar();
	
	public void cambiarPaciente(Medico medico, int indice1, Paciente paciente, int indice2 );

}
