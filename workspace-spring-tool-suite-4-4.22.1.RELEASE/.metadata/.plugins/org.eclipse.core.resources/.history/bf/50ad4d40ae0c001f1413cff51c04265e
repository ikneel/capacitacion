package com.ex.animales.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="ANIMALES")

public class Animal {
	
	@Id
	@Column(name = "ID_ANIMAL")
	private int idAnimal;
	@Column(name = "NOMBRE_ANIMAL")
	private String nombreAnimal;
	private String especie;
	private Integer edad;
	private String sexo;
	
	public Animal() {}

	public Animal(int idAnimal, String nombreAnimal, String especie, Integer edad, String sexo) {
		this.idAnimal = idAnimal;
		this.nombreAnimal = nombreAnimal;
		this.especie = especie;
		this.edad = edad;
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Animal [idAnimal=" + idAnimal + ", nombreAnimal=" + nombreAnimal + ", especie=" + especie + ", edad="
				+ edad + ", sexo=" + sexo + "]";
	}

	public int getIdAnimal() {
		return idAnimal;
	}

	public void setIdAnimal(int idAnimal) {
		this.idAnimal = idAnimal;
	}

	public String getNombreAnimal() {
		return nombreAnimal;
	}

	public void setNombreAnimal(String nombreAnimal) {
		this.nombreAnimal = nombreAnimal;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	
}
