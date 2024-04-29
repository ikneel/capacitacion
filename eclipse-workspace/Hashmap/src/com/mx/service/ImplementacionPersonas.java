package com.mx.service;

import java.util.ArrayList;
import java.util.List;

import com.mx.entidad.Persona;
import com.mx.metodos.MetodosPersonas;

public class ImplementacionPersonas implements MetodosPersonas {
	List<Persona> listaPersonas = new ArrayList<Persona>();
	
	@Override
	public void guardar(Persona persona) {
		if (listaPersonas.isEmpty()) {
			listaPersonas.add(persona);
			System.out.println("La persona ha sido registrada");
		}else {
			int bandera = 0;
			for (Persona p : listaPersonas) {
				if(persona.getNombre().equalsIgnoreCase(p.getNombre()) &&
					persona.getApellido().equalsIgnoreCase(p.getApellido())) {
					System.out.println("La perosna ya esta registrada");
					bandera = 1;
					break;
				}
			}
			if(bandera == 0) {
				listaPersonas.add(persona);
				System.out.println("La persona ha sido registrada");
			}
		}
		
	}

	@Override
	public void editar(Persona persona, int indice) {
		listaPersonas.set(indice, persona);
	}

	@Override
	public void eliminar(int indice) {
		if(indice < listaPersonas.size()) {
			Persona persona = listaPersonas.get(indice);
		}
	}

	@Override
	public Persona buscar(int indice) {
		if(indice < listaPersonas.size()) {
			Persona persona = listaPersonas.get(indice);
			return persona;
		}else {
			return null;
		}
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		
	}

}
