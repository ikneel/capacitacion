package com.mx.entidad;

import java.util.List;

public class Tienda {
	//Atriibutos
	int numTienda;
	String nomTienda;
	String ciudad;
	String colonia;
	int numExterior;
	
	List<Comestible> comestibles;
	List<Ropa> ropa;
	
	public Tienda() {}
	public Tienda(int numTienda, String nomTienda, String ciudad, String colonia, int numExterior,
			List<Comestible> comestibles, List<Ropa> ropa) {
		super();
		this.numTienda = numTienda;
		this.nomTienda = nomTienda;
		this.ciudad = ciudad;
		this.colonia = colonia;
		this.numExterior = numExterior;
		this.comestibles = comestibles;
		this.ropa = ropa;
	}
	@Override
	public String toString() {
		return "Tienda [numTienda=" + numTienda + ", nomTienda=" + nomTienda + ", ciudad=" + ciudad + ", colonia="
				+ colonia + ", numExterior=" + numExterior + ", comestibles=" + comestibles + ", ropa=" + ropa"]";
	}
	public int getNumTienda() {
		return numTienda;
	}
	public void setNumTienda(int numTienda) {
		this.numTienda = numTienda;
	}
	public String getNomTienda() {
		return nomTienda;
	}
	public void setNomTienda(String nomTienda) {
		this.nomTienda = nomTienda;
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
	public int getNumExterior() {
		return numExterior;
	}
	public void setNumExterior(int numExterior) {
		this.numExterior = numExterior;
	}
	public List<Comestible> getComestibles() {
		return comestibles;
	}
	public void setComestibles(List<Comestible> comestibles) {
		this.comestibles = comestibles;
	}
	public List<Ropa> getRopa() {
		return ropa;
	}
	public void setRopa(List<Ropa> ropa) {
		this.ropa = ropa;
	}
}
