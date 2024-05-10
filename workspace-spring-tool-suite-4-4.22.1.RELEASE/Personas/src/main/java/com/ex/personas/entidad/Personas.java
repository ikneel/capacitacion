package com.ex.personas.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PERSONAS3")
public class Personas {
	
	@Id
	@Column(name = "CURP")
	private String curp;
	@Column(name = "NOMBRE")
	private String nombre;
	@Column(name = "APELLIDO_PATERNO")
	private String apellidoPaterno;
	@Column(name = "APELLIDO_MATERNO")
	private String apellidoMaterno;
	@Column(name = "FECHA_NACIMIENTO")
	private String fechaNacimiento;
	@Column(name = "EDAD")
	private Integer edad;
	@Column(name = "PESO")
	private Integer peso;
	@Column(name = "GENERO")
	private String genero;
	@Column(name = "CIUDAD")
	private String ciudad;
	@Column(name = "CODIGO_POSTAL")
	private String codigoPostal;
	
	public Personas() {}

	public Personas(String curp, String nombre, String apellidoPaterno, String apellidoMaterno, String fechaNacimiento,
			Integer edad, Integer peso, String genero, String ciudad, String codigoPostal) {
		this.curp = curp;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.fechaNacimiento = fechaNacimiento;
		this.edad = edad;
		this.peso = peso;
		this.genero = genero;
		this.ciudad = ciudad;
		this.codigoPostal = codigoPostal;
	}

	@Override
	public String toString() {
		return "Personas [curp=" + curp + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno
				+ ", apellidoMaterno=" + apellidoMaterno + ", fechaNacimiento=" + fechaNacimiento + ", edad=" + edad + ", peso=" + peso
				+ ", genero=" + genero + ", ciudad=" + ciudad + ", codigoPostal=" + codigoPostal + "]";
	}

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

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	
	
	
	

}