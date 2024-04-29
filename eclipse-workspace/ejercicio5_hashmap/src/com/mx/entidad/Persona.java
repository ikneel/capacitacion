package com.mx.entidad;

import java.util.List;

public class Persona {
	
	//Atributos
	String nombre;
	String apellido;
	int edad;
	String ciudad;
	String tipoPersona;
	String sexo;
	List<Cuenta> cuentas;
	
	//Constructores
	public Persona() {}
	
	public Persona(String nombre, String apellido, int edad, String ciudad, String tipoPersona, String sexo,
			List<Cuenta> cuentas) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.ciudad = ciudad;
		this.tipoPersona = tipoPersona;
		this.sexo = sexo;
		this.cuentas = cuentas;
	}
	
	//toString
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", ciudad=" + ciudad
				+ ", tipoPersona=" + tipoPersona + ", sexo=" + sexo + "]";
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

	public String getTipoPersona() {
		return tipoPersona;
	}

	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public List<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(List<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}
	
	
	
	
	
	
	
}