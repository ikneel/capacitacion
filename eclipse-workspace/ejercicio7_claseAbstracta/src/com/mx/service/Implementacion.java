package com.mx.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.mx.entidad.Comestible;
import com.mx.entidad.Producto;
import com.mx.entidad.Ropa;
import com.mx.entidad.Tienda;
import com.mx.metodos.Metodos;

public class Implementacion implements Metodos {
	
	List<Tienda> listaTiendas = new ArrayList<Tienda>();
	HashMap<String, Ropa> hashRopa = new HashMap<String, Ropa>();
	HashMap<String, Comestible> hashComestibles = new HashMap<String, Comestible>();
	
	@Override
	public void guardar(Object object, String clase) {
		if(clase.equals("tienda")) {
			Tienda tienda = (Tienda) object;
			if(listaTiendas.isEmpty()) {
				listaTiendas.add(tienda);
			}else {
				int bandera = 0;
				for(Tienda t : listaTiendas) {
					if(tienda.getNumTienda() == t.getNumTienda() &&
					   tienda.getNomTienda().equalsIgnoreCase(t.getNomTienda())) {
						if(tienda.getCiudad().equalsIgnoreCase(t.getCiudad())) {
							System.out.println("Esta tienda no puede registrarse por que ya existe");
							bandera = 1;
							break;
						}
					}
				}
				if (bandera == 0) {
					listaTiendas.add(tienda);
					System.out.println("La tienda ha sido registrada");
				}
			}
		}else if(clase.equals("ropa")){
			Ropa ropa = (Ropa)object;
			if(hashRopa.isEmpty()) {
				hashRopa.put(ropa.getCodigoBarras(), ropa);
				System.out.println("el producto ha sido registrado");
			}else {
				if(hashRopa.containsKey(ropa.getCodigoBarras())) {
					System.out.println("Ese codigo de barras ya existe, intenta con otro");
				}else {
					boolean bandera = false;
					Ropa ropa_aux;
					for(String key : hashRopa.keySet()) {
						ropa_aux = hashRopa.get(key);
						if(ropa.getMarca().equalsIgnoreCase(ropa_aux.getMarca()) && 
						   ropa.getNombre().equalsIgnoreCase(ropa_aux.getNombre())) {
							System.out.println("Esta prenda ya esta registrado");
							bandera = true;
							break;
						}
					}
					if(bandera == false) {
						hashRopa.put(ropa.getCodigoBarras(), ropa);
						System.out.println("el producto fue registrado");
					}
				}
			}	
		}
		else if(clase.equals("comestible")){
			Comestible comestible = (Comestible)object;
			if(hashComestibles.isEmpty()) {
				hashComestibles.put(comestible.getCodigoBarras(), comestible);
				System.out.println("El comestible ha sido registrado");
			}else {
				if(hashComestibles.containsKey(comestible.getCodigoBarras())) {
					System.out.println("Ese codigo de barras ya existe, intenta con otro");
				}else {
					boolean bandera = false;
					Comestible comestible_aux;
					for(String key : hashComestibles.keySet()) {
						comestible_aux = hashComestibles.get(key);
						if(comestible.getMarca().equalsIgnoreCase(comestible_aux.getMarca()) && 
						   comestible.getNombre().equalsIgnoreCase(comestible_aux.getNombre())) {
							System.out.println("Este comestible ya esta registrado");
							bandera = true;
							break;
						}
					}
					if(bandera == false) {
						hashComestibles.put(comestible.getCodigoBarras(), comestible);
						System.out.println("El comestible fue registrado");
					}
				}
			}		
		}
	}

	@Override
	public void editar(Object object, int indice, String clase) {
		if(clase.equals("tienda")) {
			Tienda tienda = (Tienda)object;
			listaTiendas.set(indice, tienda);
		}else if(clase.equals("ropa")){
			Ropa ropa = (Ropa)object;
			hashRopa.put(ropa.getCodigoBarras(), ropa);
		}else if(clase.equals("comestible")){
			Comestible comestible = (Comestible)object;
			hashComestibles.put(comestible.getCodigoBarras(), comestible);
		}
		
	}

	@Override
	public void eliminar(Object object, int indice, String clase) {
		if (clase.equals("tienda")) {
			if(indice < listaTiendas.size()) {
				Tienda tienda = listaTiendas.get(indice);
				listaTiendas.remove(indice);
				System.out.println("La tienda ha sido eliminada \n" + tienda);
			}else {
				System.out.println("La persona que tratas de eliminar no existe");
			}
		}else if(clase.contentEquals("ropa")) {
			Ropa ropa = (Ropa)object;
			if(hashRopa.containsKey(ropa.getCodigoBarras())) {
				ropa = hashRopa.get(ropa.getCodigoBarras());
				hashRopa.remove(ropa.getCodigoBarras());
				System.out.println("La prenda ha sido eliminado \n" + ropa);
			}else {
				System.out.println("La prenda que tratas de eliminar no existe");
			}
		}else if(clase.contentEquals("comestible")) {
			Comestible comestible= (Comestible)object;
			if(hashComestibles.containsKey(comestible.getCodigoBarras())) {
				comestible = hashComestibles.get(comestible.getCodigoBarras());
				hashComestibles.remove(comestible.getCodigoBarras());
				System.out.println("El comestible ha sido eliminado \n" + comestible);
			}else {
				System.out.println("El comestible que tratas de eliminar no existe");
			}
		}
		
	}

	@Override
	public Object buscar(Object object, int indice, String clase) {
		if(clase.equals("tienda")) {
			if(indice < listaTiendas.size()) {
				Tienda tienda = listaTiendas.get(indice);
				return tienda;
			}else {
				return null;
			}
		}else if(clase.equals("ropa")) {
			Ropa ropa = (Ropa)object;
			if(hashRopa.containsKey(ropa.getCodigoBarras())) {
				return hashRopa.get(ropa.getCodigoBarras());
			}else {
				return null;
			}			
		}else if(clase.equals("comestible")) {
			Comestible comestible = (Comestible)object;
			if(hashComestibles.containsKey(comestible.getCodigoBarras())) {
				return hashRopa.get(comestible.getCodigoBarras());
			}else {
				return null;
			}			
		}else {
			return null;
		}
	}

	@Override
	public void mostrar(String clase) {
		if (clase.equals("tienda")) {
			if(listaTiendas.isEmpty()) {
				System.out.println("No existen tiendas que mostrar");
			}else {
				System.out.println("Se han encontrado a las siguientes tiendas: \n" + listaTiendas);
			}
		}else if(clase.equals("ropa")){
			if(hashRopa.isEmpty()) {
				System.out.println("No hay prendas que mostrar");
			}else {
				System.out.println("Se encontraron las siguientes prendas: \n" + hashRopa);
			}
		}
		else if(clase.equals("comestible")){
			if(hashRopa.isEmpty()) {
				System.out.println("No hay comestibles que mostrar");
			}else {
				System.out.println("Se encontraron los siguientes comestibles: \n" + hashRopa);
			}
		}
	}
	
	public void listar(String clase) {
		if(clase.equals("tienda")) {
			if(listaTiendas.isEmpty()) {
				System.out.println("No existen tiendas que listar");
			}else {
				for (Tienda t : listaTiendas) {
					System.out.println("[" + listaTiendas.indexOf(t) + "] => " + t.getNomTienda() + " " + t.getCiudad());
				}
			}
		}else if(clase.equals("ropa")){
			if(hashRopa.isEmpty()) {
				System.out.println("No hay ropa que listar");
			}else {
				Ropa ropa;
				for(String key : hashRopa.keySet()) {
					ropa = hashRopa.get(key);
					System.out.println("[" + key + "] => " + ropa.getMarca() + " " + ropa.getNombre());
				}
			}
		}else if(clase.equals("comestible")){
			if(hashRopa.isEmpty()) {
				System.out.println("No hay consumibles que listar");
			}else {
				Comestible comestible;
				for(String key : hashComestibles.keySet()) {
					comestible = hashComestibles.get(key);
					System.out.println("[" + key + "] => " + comestible.getMarca() + " " + comestible.getNombre());
				}
			}
		}
		
	}

}
