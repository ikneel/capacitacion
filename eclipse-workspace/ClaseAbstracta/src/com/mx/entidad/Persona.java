package com.mx.entidad;

public abstract class Persona {
	//Atributos
	String curp;
	String nombre;
	String apellido;
	int edad;
	double sueldo;
	
	//Constructores
	public Persona() {}
	
	public Persona(String curp, String nombre, String apellido, int edad, double sueldo) {
		super();
		this.curp = curp;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.sueldo = sueldo;
	}

	//toString
	@Override
	public String toString() {
		return "Persona [curp=" + curp + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", sueldo=" + sueldo + "]";
	}
	
	
	//Encapsulamineto
	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	//
	
	public abstract double obtenerSalario();
}
	
	