package com.mx.service;

import java.util.ArrayList;
import java.util.List;

import com.mx.entidad.Jefe;
import com.mx.metodos.MetodosJefee;

public class ImplementacionJefe implements MetodosJefee {

	List<Jefe> listaJefe = new ArrayList<>();

	@Override
	public void guardar(Jefe jefe) {
		
		if(listaJefe.isEmpty()) {
			listaJefe.add(jefe);
			System.out.println("El jefe ha sido registrado");
		}else {
			boolean bandera = false;
			for(Jefe j : listaJefe) {
				if(jefe.getNombre().equalsIgnoreCase(j.getNombre())
						&& jefe.getApellido().equalsIgnoreCase(j.getApellido())) {
					System.out.println("No se registro por que ya existe");
					bandera = true;
					break;
				}
			}
			if(bandera == false) {
				listaJefe.add(jefe);
				System.out.println("El jefe ha sido registrado");
			}
		}
		
	}

	@Override
	public void editar(Jefe jefe, int indice) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int indice) {	
		if(indice < listaJefe.size()) {
			Jefe jefe = listaJefe.get(indice);
			listaJefe.remove(indice);
			System.out.println("El jefe [" + jefe + "] fue eliminado");
		}else {
			System.out.println("El jefe que tratas de eliminar no esta registrado");
		}	
	}

	@Override
	public Jefe buscar(int indice) {
		if(indice < listaJefe.size()) {
			Jefe jefe = listaJefe.get(indice);
			return jefe;
		}
		
		return null;
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		
	}
	
	public void listar() {
		if(listaJefe.isEmpty()) {
			System.out.println("No hay jefes que listar");
		}else {
			for (Jefe j :  listaJefe) {
				System.out.println("[" + listaJefe.indexOf(j) + "]" + " " + j.getNombre() + " " + j.getApellido());
			}
		}
	}

	

}