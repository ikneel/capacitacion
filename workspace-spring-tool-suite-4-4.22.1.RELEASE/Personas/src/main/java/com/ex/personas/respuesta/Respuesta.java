package com.ex.personas.respuesta;

public class Respuesta {
	private String mensaje;
	private boolean succes;
	private Object obj;
	
	public Respuesta() {
		
	}

	public Respuesta(String mensaje, boolean succes, Object obj) {
		this.mensaje = mensaje;
		this.succes = succes;
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "Respuesta [mensaje=" + mensaje + ", succes=" + succes + ", obj=" + obj + "]";
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public boolean isSucces() {
		return succes;
	}

	public void setSucces(boolean succes) {
		this.succes = succes;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	
	
}
