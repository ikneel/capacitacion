package com.mx.entidad;

public class Cuenta {
	
	//Atributos
	int numero;
	double saldo;
	double adeudo;
	String tipoCuenta;
	String Banco;
	
	//Constructores
	public Cuenta() {}

	public Cuenta(int numero) {
		super();
		this.numero = numero;
	}

	public Cuenta(int numero, double saldo, double adeudo, String tipoCuenta, String banco) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.adeudo = adeudo;
		this.tipoCuenta = tipoCuenta;
		Banco = banco;
	}

	//toString
	@Override
	public String toString() {
		return "Cuenta [numero=" + numero + ", saldo=" + saldo + ", adeudo=" + adeudo + ", tipoCuenta=" + tipoCuenta
				+ ", Banco=" + Banco + "]";
	}

	//Encapsulamiento
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getAdeudo() {
		return adeudo;
	}

	public void setAdeudo(double adeudo) {
		this.adeudo = adeudo;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public String getBanco() {
		return Banco;
	}

	public void setBanco(String banco) {
		Banco = banco;
	}
	
	
}
