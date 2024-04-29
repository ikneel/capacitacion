package com.mx.entidad;

public class Producto {
	
	//Atributos
	String codigoBarras;
	String nombreProducto;
	String marca; 
	double precio;
	int stock;
	String tipo;
	
	//Constructores
	public Producto() {}

	public Producto(String codigoBarras) {
		super();
		this.codigoBarras = codigoBarras;
	}

	public Producto(String codigoBarras, String nombreProducto, String marca, double precio, int stock, String tipo) {
		super();
		this.codigoBarras = codigoBarras;
		this.nombreProducto = nombreProducto;
		this.marca = marca;
		this.precio = precio;
		this.stock = stock;
		this.tipo = tipo;
	}

	//toString
	@Override
	public String toString() {
		return "Producto [codigoBarras=" + codigoBarras + ", nombreProducto=" + nombreProducto + ", marca=" + marca
				+ ", precio=" + precio + ", stock=" + stock + ", tipo=" + tipo + "]";
	}
	
	//Encapsulamiento
	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
	
	
	
	
}
