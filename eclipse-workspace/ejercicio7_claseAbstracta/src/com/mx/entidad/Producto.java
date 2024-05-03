package com.mx.entidad;

public abstract class Producto {
	//Atributos
	String codigoBarras;
	String nombre;
	String marca;
	double precio;
	int stock;
	
	//Constructores
	public Producto() {}
	public Producto(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public Producto(String codigoBarras, String nombre, String marca, double precio, int stock) {
		super();
		this.codigoBarras = codigoBarras;
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
		this.stock = stock;
	}
	
	//toString
	
	@Override
	public String toString() {
		return "Producto [codigoBarras=" + codigoBarras + ", nombre=" + nombre + ", marca=" + marca + ", precio="
				+ precio + ", stock=" + stock + "]";
	}


	//Encapsulamiento
	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public abstract double obtenerPrecio();
	
}