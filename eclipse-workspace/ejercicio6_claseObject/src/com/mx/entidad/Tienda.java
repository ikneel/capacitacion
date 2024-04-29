package com.mx.entidad;

import java.util.List;

public class Tienda {
	//Atributos
	int numtienda;
	String nombreTienda;
	String ciudad;
	String colonia;
	String calle;
	int numExterior;
	List<Producto> productos;
	
	//Constructores
	public Tienda() {}

	public Tienda(int numtienda, String nombreTienda, String ciudad, String colonia, String calle, int numExterior,
			List<Producto> productos) {
		super();
		this.numtienda = numtienda;
		this.nombreTienda = nombreTienda;
		this.ciudad = ciudad;
		this.colonia = colonia;
		this.calle = calle;
		this.numExterior = numExterior;
		this.productos = productos;
	}
	
	//toString
	@Override
	public String toString() {
		return "Tienda [numtienda=" + numtienda + ", nombreTienda=" + nombreTienda + ", ciudad=" + ciudad + ", colonia="
				+ colonia + ", calle=" + calle + ", numExterior=" + numExterior + "]";
	}
	
	//Encapsulamiento
	public int getNumtienda() {
		return numtienda;
	}

	public void setNumtienda(int numtienda) {
		this.numtienda = numtienda;
	}

	public String getNombreTienda() {
		return nombreTienda;
	}

	public void setNombreTienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumExterior() {
		return numExterior;
	}

	public void setNumExterior(int numExterior) {
		this.numExterior = numExterior;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	
}