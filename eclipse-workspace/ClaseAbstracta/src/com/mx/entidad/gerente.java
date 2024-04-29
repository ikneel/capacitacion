package com.mx.entidad;

import java.util.List;

public class gerente extends Persona{
	//Atributos
	String area;
	List<Empleado> empleado;
	
	public gerente(){
		super();
	}

	public gerente(String curp, String nombre, String apellido, int edad, double sueldo, String area,
			List<Empleado> empleado) {
		super(curp, nombre, apellido, edad, sueldo);
		this.area = area;
		this.empleado = empleado;
	}

	@Override
	public String toString() {
		return "gerente [curp=" + curp + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", sueldo=" + sueldo + ", area=" + area + "]";
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public List<Empleado> getEmpleado() {
		return empleado;
	}

	public void setEmpleado(List<Empleado> empleado) {
		this.empleado = empleado;
	}
	
	public double obtenerSalario() {
		double salario = sueldo - (sueldo * 0.25);
		return salario;
	}
	

}
