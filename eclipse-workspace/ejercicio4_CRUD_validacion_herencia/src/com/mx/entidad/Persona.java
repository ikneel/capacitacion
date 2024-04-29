package com.mx.entidad;

public class Persona {
	
	//Atributos
	
	String curp;
	String nombre;
	String Apellido;
	int edad;
	String Ciudad;
	String genero;
	
	//Constructor
	public Persona() {}

	public Persona(String curp, String nombre, String apellido, int edad, String ciudad, String genero) {
		super();
		this.curp = curp;
		this.nombre = nombre;
		Apellido = apellido;
		this.edad = edad;
		Ciudad = ciudad;
		this.genero = genero;
	}
	
	//toString
	@Override
	public String toString() {
		return "Persona [curp=" + curp + ", nombre=" + nombre + ", Apellido=" + Apellido + ", edad=" + edad
				+ ", Ciudad=" + Ciudad + ", genero=" + genero + "]";
	}
	
	//Encapsulamiento
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
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCiudad() {
		return Ciudad;
	}

	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	

}
