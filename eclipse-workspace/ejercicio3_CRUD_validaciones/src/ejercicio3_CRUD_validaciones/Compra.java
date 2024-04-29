package ejercicio3_CRUD_validaciones;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	//Atributos
	String folio;
	String nombre;
	String descripcion;
	double precio;
	String paisOrigen;
	String categoria;
	
	//Constructores
	public Compra() {}
	
	public Compra(String folio, String nombre, String descripcion, double precio, String paisOrigen, String categoria) {
		super();
		this.folio = folio;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.paisOrigen = paisOrigen;
		this.categoria = categoria;
	}

	//toString
	@Override
	public String toString() {
		return "Compra [folio=" + folio + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio
				+ ", paisOrigen=" + paisOrigen + ", categoria=" + categoria + "]";
	}

	//Encapsulamiento
	public String getFolio() {
		return folio;
	}

	public void setFolio(String folio) {
		this.folio = folio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
}
