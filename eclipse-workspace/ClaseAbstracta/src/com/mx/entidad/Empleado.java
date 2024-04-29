package com.mx.entidad;

public class Empleado extends Persona {
	//Atributos
	String carrera;
	
	public Empleado() {
		super();
	}

	public Empleado(String curp, String nombre, String apellido, int edad, double sueldo, String carrera) {
		super(curp, nombre, apellido, edad, sueldo);
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "Empleado [curp=" + curp + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", sueldo=" + sueldo + ", carrera=" + carrera + "]";
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	public double obtenerSalario() {
		return 0;
	}
}
