package com.mx.service;

import java.util.List;
import java.util.ArrayList;

import com.mx.entidad.Persona;
import com.mx.metodos.MetodosPersona;

public class ImplementacionPersona implements MetodosPersona {
		
	List<Persona> listaPersonas = new ArrayList<Persona>();
	
	@Override
	public void guardar(Persona persona) {
		if(listaPersonas.isEmpty()) {
			listaPersonas.add(persona);
			System.out.println("La persona ha sido agregada");
		}else {
			int bandera = 0;
			for (Persona p : listaPersonas) {
				if(persona.getNombre().equalsIgnoreCase(p.getNombre()) &&
					persona.getApellido().equalsIgnoreCase(p.getApellido())) {
					System.out.println("La persona ya esta registrada");
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
		if (indice < listaPersonas.size()) {
			Persona persona = listaPersonas.get(indice);
			listaPersonas.remove(indice);
			System.out.println("La persona -- " + persona + " -- fue eliminada");
		}else {
			System.out.println("La persona que tratas de eliminar no existe");
		}		
	}

	@Override
	public Persona buscar(int indice) {	
		if (indice < listaPersonas.size()) {
			Persona persona = listaPersonas.get(indice);
			return persona;
		}else {
			return null;
		}
	}

	@Override
	public void mostrar() {
		if (listaPersonas.isEmpty()) {
			System.out.println("No hay personas que mostrar");
		}else {
			System.out.println("Se han encontrado las siguientes personas: \n" + listaPersonas);
		}
	}
	
	public void listar() {
		if (listaPersonas.isEmpty()) {
			System.out.println("No hay personas que listar");
		}else {
			for(Persona p : listaPersonas) {
				System.out.println("[" + listaPersonas.indexOf(p) + "] => " + p.getNombre() + " " + p.getApellido());
			}
		}
	}
	
	public void listargenero(String genero) {
		if (listaPersonas.isEmpty()) {
			System.out.println("No hay personas que listar");
		}else {
			for(Persona p : listaPersonas) {
				if(genero.equalsIgnoreCase(p.getSexo())) {
					System.out.println("[" + listaPersonas.indexOf(p) + "] => " + p.getNombre() + " " + p.getApellido());
				}
			}
		}
	}

}