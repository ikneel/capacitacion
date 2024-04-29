package com.mx.entidad;

public class Celular {
	
	//Atributos
	String imei;
	String modelo;
	String marca;
	int ram;
	int almacenamiento;
	
	//Constructores
	
	public Celular() {}

	public Celular(String imei, String modelo, String marca, int ram, int almacenamiento) {
		super();
		this.imei = imei;
		this.modelo = modelo;
		this.marca = marca;
		this.ram = ram;
		this.almacenamiento = almacenamiento;
	}
	
	//toString
	@Override
	public String toString() {
		return "Celular [imei=" + imei + ", modelo=" + modelo + ", marca=" + marca + ", ram=" + ram
				+ ", almacenamiento=" + almacenamiento + "]";
	}
	
	//Encpsulamineto
	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}
	
	
	
}
