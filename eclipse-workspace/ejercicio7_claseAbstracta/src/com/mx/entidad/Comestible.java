package com.mx.entidad;

public class Comestible extends Producto{
	//Atributos
	String tipo;
	
	//Constructores
	public Comestible() {
		super();
	}
	
	public Comestible(String codigoBarras, String nombre, String marca, double precio, int stock, String tipo) {
		super(codigoBarras, nombre, marca, precio, stock);
		this.tipo = tipo;
	}
	
	//toString
	@Override
	public String toString() {
		return "Comestible [codigoBarras=" + codigoBarras + ", nombre=" + nombre + ", marca=" + marca + ", precio="
				+ precio + ", stock=" + stock + ", tipo=" + tipo + "]";
	}
	
	//Encapsulamiento
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public double obtenerPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}

}
