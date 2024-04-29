package com.mx.entidad;

public class Empleado extends Persona {
	
	//Atributos
	String carrera;

	//Constructor
	public Empleado() {
		super();
	}

	public Empleado(String nombre, String apellido, int edad, String genero, String carrera) {
		super(nombre, apellido, edad, genero);
		this.carrera = carrera;
	}
	
	//toString
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", genero=" + genero
				+ ", carrera=" + carrera + "]\n";
	}
	
	//Encapsulamiento
	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	
	
	
	
	
	
}
