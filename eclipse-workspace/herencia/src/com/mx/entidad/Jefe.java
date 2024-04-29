package com.mx.entidad;

import java.util.List;

public class Jefe extends Persona {
	
	//Atributos
	String area;
	List<Empleado> empleados;
	
	//Constructor
	public Jefe() {
		super();
	}
	public Jefe(String nombre, String apellido, int edad, String genero, String area, List<Empleado> empleados) {
		super(nombre, apellido, edad, genero);
		this.area = area;
		this.empleados = empleados;
	}
	
	//toString
	@Override
	public String toString() {
		return "Jefe [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", genero=" + genero + ", area="
				+ area + ", empleados=" + empleados + "]";
	}
	
	//Encapsulamiento
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public List<Empleado> getEmpleados() {
		return empleados;
	}
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

}
