package com.mx.entidad;

import java.util.List;

public class Persona {
	//Atributos
	String nombre;
	String apellido;
	int edad;
	String ciudad;
	String genero;
	List<Celular> celulares;
	
	//Constructores
	public Persona() {}
	
	public Persona(String nombre, String apellido, int edad, String ciudad, String genero, List<Celular> celulares) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.ciudad = ciudad;
		this.genero = genero;
		this.celulares = celulares;
	}
	
	//toString
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", ciudad=" + ciudad
				+ ", genero=" + genero + ", celulares=" + celulares + "]";
	}
	
	//Encapsulamiento
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

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public List<Celular> getCelulares() {
		return celulares;
	}

	public void setCelulares(List<Celular> celulares) {
		this.celulares = celulares;
	}
		
	
	
}
