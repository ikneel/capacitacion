package com.mx.entidad;

public class Mascota {
	//Atributos
	int numeroRegistro;
	String nombre;
	String especie;
	String raza;
	String genero;
	int edad;
	
	//Constructores
	public Mascota() {}
	
	public Mascota(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	public Mascota(int numeroRegistro, String nombre, String especie, String raza, String genero, int edad) {
		super();
		this.numeroRegistro = numeroRegistro;
		this.nombre = nombre;
		this.especie = especie;
		this.raza = raza;
		this.genero = genero;
		this.edad = edad;
	}

	//toString
	@Override
	public String toString() {
		return "Mascota [numeroRegistro=" + numeroRegistro + ", nombre=" + nombre + ", especie=" + especie + ", raza="
				+ raza + ", genero=" + genero + ", edad=" + edad + "]";
	}

	//ENcapsulamiento
	public int getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	
}
