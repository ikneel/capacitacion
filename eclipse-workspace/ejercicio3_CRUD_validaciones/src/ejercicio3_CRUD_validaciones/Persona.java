package ejercicio3_CRUD_validaciones;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Persona {

	//Atributos
	String curp;
	String nombre;
	String apellido;
	int edad;
	String ciudad;
	String genero;
	List<Compra> compras;
	
	//Constructores
	public Persona() {}
	
	public Persona(String curp, String nombre, String apellido, int edad, String ciudad, String genero,
			List<Compra> compras) {
		super();
		this.curp = curp;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.ciudad = ciudad;
		this.genero = genero;
		this.compras = compras;
	}
	
	//toString
	@Override
	public String toString() {
		return "Persona [curp=" + curp + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", ciudad=" + ciudad + ", genero=" + genero + ", compras=" + compras + "]";
	}
	
	//Encapsulamiento

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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public List<Compra> getCompras() {
		return compras;
	}

	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}
	
	
	
	
	
	
	
	
	
}
