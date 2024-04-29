package com.mx.service;

import com.mx.entidad.Persona;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.mx.entidad.Celular;
import com.mx.metodos.Metodos;

public class Implementacion implements Metodos{
	
	List<Persona> listaPersonas = new ArrayList<Persona>();
	HashMap<String, Celular> hashCelulares = new HashMap<String, Celular>();
	@Override
	public void guardar(Object object, String clase) {
		if(clase.equals("persona")) {
			Persona persona = (Persona) object;
			if(listaPersonas.isEmpty()) {
				listaPersonas.add(persona);
			}else {
				int bandera = 0;
				for(Persona p : listaPersonas) {
					if(persona.getNombre().equalsIgnoreCase(p.getNombre()) &&
					   persona.getApellido().equalsIgnoreCase(p.getApellido())	) {
						System.out.println("La paersona ha registrar ya existe");
						bandera = 1;
						break;
					}
				}
				if (bandera == 0) {
					listaPersonas.add(persona);
					System.out.println("La persona ha sido registrada");
				}
			}
		}else {
			Celular celular = (Celular)object;
			if(hashCelulares.isEmpty()) {
				hashCelulares.put(celular.getImei(), celular);
				System.out.println("El celular ha sido registrado");
			}else {
				if(hashCelulares.containsKey(celular.getImei())) {
					System.out.println("Este Imei ya existe, intenta con otro");
				}else {
					boolean bandera = false;
					Celular celular_aux;
					for(String key : hashCelulares.keySet()) {
						celular_aux = hashCelulares.get(key);
						if(celular.getMarca().equalsIgnoreCase(celular_aux.getMarca()) &&
						   celular.getModelo().equalsIgnoreCase(celular_aux.getModelo())) {
							System.out.println("Este celular ya existe");
							bandera = true;
							break;
						}
					}
					if(bandera == false) {
						hashCelulares.put(celular.getImei(), celular);
						System.out.println("El celular fue registrado");
					}
				}
			}
		}
	}

	@Override
	public void editar(Object object, int indice, String clase) {
		if(clase.equals("persona")) {
			Persona persona = (Persona)object;
			listaPersonas.set(indice, persona);
		}else {
			Celular celular = (Celular)object;
			hashCelulares.put(celular.getImei(), celular);
		}
	}

	@Override
	public void eliminar(Object object, int indice, String clase) {
		if (clase.equals("celular")) {
			if(indice < listaPersonas.size()) {
				Persona persona = listaPersonas.get(indice);
				listaPersonas.remove(indice);
				System.out.println("La persona ha sido eliminada \n" + persona);
			}else {
				System.out.println("LA persona que tratas de eliminar no existe");
			}
		}else {
			Celular celular = (Celular)object;
			if(hashCelulares.containsKey(celular.getImei())) {
				celular = hashCelulares.get(celular.getImei());
				hashCelulares.remove(celular.getImei());
				System.out.println("El celular ha sido eliminado \n" + celular);
			}else {
				System.out.println("El celular que tratas de eliminar no existe");
			}
		}
		
	}

	@Override
	public Object buscar(Object object, int indice, String clase) {
		if(clase.equals("persona")) {
			if(indice < listaPersonas.size()) {
				Persona persona = listaPersonas.get(indice);
				return persona;
			}else {
				return null;
			}
		}else {
			Celular celular = (Celular)object;
			if(hashCelulares.containsKey(celular.getImei())) {
				return hashCelulares.get(celular.getImei());
			}else {
				return null;
			}			
		}
	}

	@Override
	public void mostrar(String clase) {
		if (clase.equals("persona")) {
			if(listaPersonas.isEmpty()) {
				System.out.println("No existen personas que mostrar");
			}else {
				System.out.println("Se han encontrado a las sigueitnes personas : \n" + listaPersonas);
			}
		}else {
			if(hashCelulares.isEmpty()) {
				System.out.println("No hay celulares que mostrar");
			}else {
				System.out.println("Se encontraron los siguientes celulares: \n" + hashCelulares);
			}
		}	
	}
	
	public void listar(String clase) {
		if(clase.equals("persona")) {
			if(listaPersonas.isEmpty()) {
				System.out.println("No existen persona que mostrar");
			}else {
				for (Persona p : listaPersonas) {
					System.out.println("[" + listaPersonas.indexOf(p) + "] => " + p.getNombre() + " " + p.getApellido());
				}
			}
		}else {
			if(hashCelulares.isEmpty()) {
				System.out.println("no hay celulares que mostrar");
			}else {
				Celular celular;
				for(String key : hashCelulares.keySet()) {
					celular = hashCelulares.get(key);
					System.out.println("[" + key + "] => " + celular.getModelo() + " " + celular.getMarca());
				}
			}
		}
	}
}
