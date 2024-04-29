package com.mx.entidad;

import java.util.List;

public class Medico extends Persona{
	//Atributos
	String especialidad;
	int numConsultorio;
	List<Paciente> pacientes;
	
	//Constructor
	public Medico() {
		super();
	}

	public Medico(String curp, String nombre, String apellido, int edad, String ciudad, String genero,
			String especialidad, int numConsultorio, List<Paciente> pacientes) {
		super(curp, nombre, apellido, edad, ciudad, genero);
		this.especialidad = especialidad;
		this.numConsultorio = numConsultorio;
		this.pacientes = pacientes;
	}

	//toString
	@Override
	public String toString() {
		return "Medico [curp=" + curp + ", nombre=" + nombre + ", Apellido=" + Apellido + ", edad=" + edad + ", Ciudad="
				+ Ciudad + ", genero=" + genero + ", especialidad=" + especialidad + ", numConsultorio="
				+ numConsultorio + ", pacientes=" + pacientes + "]";
	}
	
	//Encapsulamiento;
	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public int getNumConsultorio() {
		return numConsultorio;
	}

	public void setNumConsultorio(int numConsultorio) {
		this.numConsultorio = numConsultorio;
	}

	public List<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(List<Paciente> pacientes) {
		this.pacientes = pacientes;
	}
	
	
	
}
