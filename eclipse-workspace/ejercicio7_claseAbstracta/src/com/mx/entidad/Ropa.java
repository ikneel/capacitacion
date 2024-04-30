package com.mx.entidad;

public class Ropa extends Producto {
	//Atributos
	String talla;
	String color;
	
	//Constructor
	public Ropa() {
		super();
	}
	
	public Ropa(String codigoBarras, String nombre, String marca, double precio, int stock, String talla,
			String color) {
		super(codigoBarras, nombre, marca, precio, stock);
		this.talla = talla;
		this.color = color;
	}
	
	//toString
	@Override
	public String toString() {
		return "Ropa [codigoBarras=" + codigoBarras + ", nombre=" + nombre + ", marca=" + marca + ", precio=" + precio
				+ ", stock=" + stock + ", talla=" + talla + ", color=" + color + "]";
	}

	//Encapsulamiento
	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public double obtenerPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}
}
