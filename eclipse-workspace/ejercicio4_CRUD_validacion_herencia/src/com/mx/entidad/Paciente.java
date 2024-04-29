package com.mx.entidad;

public class Paciente extends Persona{
	
	//Atributos
	int numero_Seguro;
	String padecimiento;
	double peso;
	String tipoSangre;
	
	//Constructor
	public Paciente() {
		super();
	}

	public Paciente(String curp, String nombre, String apellido, int edad, String ciudad, String genero,
			int numero_Seguro, String padecimiento, double peso, String tipoSangre) {
		super(curp, nombre, apellido, edad, ciudad, genero);
		this.numero_Seguro = numero_Seguro;
		this.padecimiento = padecimiento;
		this.peso = peso;
		this.tipoSangre = tipoSangre;
	}

	//toString
	@Override
	public String toString() {
		return "Paciente [curp=" + curp + ", nombre=" + nombre + ", Apellido=" + Apellido + ", edad=" + edad
				+ ", Ciudad=" + Ciudad + ", genero=" + genero + ", numero_Seguro=" + numero_Seguro + ", padecimiento="
				+ padecimiento + ", peso=" + peso + ", tipoSangre=" + tipoSangre + "]";
	}
	
	//Encapsulamiento
	public int getNumero_Seguro() {
		return numero_Seguro;
	}

	public void setNumero_Seguro(int numero_Seguro) {
		this.numero_Seguro = numero_Seguro;
	}

	public String getPadecimiento() {
		return padecimiento;
	}

	public void setPadecimiento(String padecimiento) {
		this.padecimiento = padecimiento;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getTipoSangre() {
		return tipoSangre;
	}

	public void setTipoSangre(String tipoSangre) {
		this.tipoSangre = tipoSangre;
	}
}