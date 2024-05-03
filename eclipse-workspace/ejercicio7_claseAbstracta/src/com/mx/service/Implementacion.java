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
	List<String> llaves = new ArrayList<>();
	List<Tienda> listaTiendas = new ArrayList<>();
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
			System.out.println(comestible.getCodigoBarras());
			System.out.println(hashComestibles);
			if(hashComestibles.containsKey(comestible.getCodigoBarras())) {
				return hashComestibles.get(comestible.getCodigoBarras());
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
	
	public void asignarProducto(Object object, int indice, String clase) {
		Tienda tienda = listaTiendas.get(indice);
		if(clase.equals("ropa")){

			Ropa ropa = (Ropa)object;
			
			ropa = hashRopa.get(ropa.getCodigoBarras());
			
			tienda.getRopa().put(ropa.getCodigoBarras(), ropa);
			System.out.println("Producto asignado a tienda");
			System.out.println(tienda);
			
		}else {
			Comestible comestible = (Comestible)object;
			
			comestible = hashComestibles.get(comestible.getCodigoBarras());
			
			tienda.getComestibles().put(comestible.getCodigoBarras(), comestible);
			System.out.println("Producto asignado a tienda");
			System.out.println(tienda);
		}
	}
	
	public void eliminarProductoDeTienda(Object object, int indice, String clase) {
		Tienda tienda = listaTiendas.get(indice);
		
		if(clase.equals("ropa")) {
			Ropa ropa = (Ropa)object;
			
			tienda.getRopa().remove(ropa.getCodigoBarras());
			
			System.out.println("Producto eliminado de la tienda");
			System.out.println(tienda);
		}else {
			Comestible comestible = (Comestible)object;
			
			tienda.getComestibles().remove(comestible.getCodigoBarras());
		}
	}
	
	public void gananciaenTiendaRoC(int indice) {
		Tienda tienda = new Tienda();
		Ropa ropa = new Ropa();
		Comestible comestible = new Comestible();
		tienda = listaTiendas.get(indice);
		
		double gananciaRopa = 0;
		double gananciaComestibles = 0;
		
		for(String key : tienda.getRopa().keySet()) {
			ropa = tienda.getRopa().get(key);
			
			gananciaRopa += (ropa.obtenerPrecio() * ropa.getStock());
		}
		for(String key : tienda.getComestibles().keySet()) {
			comestible = tienda.getComestibles().get(key);
			gananciaComestibles += (comestible.obtenerPrecio() * comestible.getStock() ); 
		}
		
		if(gananciaRopa > gananciaComestibles) {
			System.out.println("Lo que le genera mas ganancias a la tienda [" + indice  + "] " + "es la ropa, con una ganancia de: " +  gananciaRopa
					+ " a los comestibles con una ganacia de: " + gananciaComestibles);
		}else {
			System.out.println("Lo que le genera mas ganancias a la tienda [" + indice  + "] " + "son los comestibles, con una ganancia de: " +  gananciaComestibles 
					+ " a la ropa que tiene una ganancia de: " + gananciaRopa);
		}
	}
	
	public void masGanancia() {
		double masganancia = 0;
		String tiendamasganancia = "";
		double ganancia;
		Ropa ropa = new Ropa();
		Comestible comestible = new Comestible();
		for(Tienda t : listaTiendas) {
			ganancia = 0;
			tiendamasganancia = t.getNomTienda();
			for(String key : t.getRopa().keySet()) {
				ropa = t.getRopa().get(key);
				ganancia += (ropa.obtenerPrecio() * ropa.getStock());
			}
			for(String key : t.getComestibles().keySet()) {
				comestible = t.getComestibles().get(key);
				ganancia += (comestible.obtenerPrecio() * comestible.getStock());
			}
			System.out.println("La ganancia de la tienda [" + listaTiendas.indexOf(t) + "] es de: " + ganancia);
			if(ganancia > masganancia) {
				masganancia = ganancia;
				tiendamasganancia = t.getNomTienda();
			}
		}
		
		System.out.println("La tienda: " + tiendamasganancia + " es la que tiene mas ganancia, con una ganancia de " + masganancia);
	
		
	}
	
	public void calcularGanancia(int indice) {
		double ganancia = 0;
		Tienda tienda = new Tienda();
		Ropa ropa = new Ropa();
		Comestible comestible = new Comestible(); 
		tienda = listaTiendas.get(indice);
		
		System.out.println("-------Ganancia Ropa------- \n");
		
		for(String key : tienda.getRopa().keySet()) {
			ropa = tienda.getRopa().get(key);
			System.out.println("Prenda: " + ropa.getNombre());
			System.out.println("\n Precio original: " + ropa.getPrecio() + "| Precio con IVA: " + ropa.obtenerPrecio());
			System.out.println("\n Stock: " + ropa.getStock() + "\n ---------------- \n");
			System.out.println("Total: " + ropa.obtenerPrecio() * ropa.getStock() + "\n ---------------------------");
			ganancia += (ropa.obtenerPrecio() * ropa.getStock());
		}
		for(String key : tienda.getComestibles().keySet()) {
			comestible = tienda.getComestibles().get(key);
			System.out.println("Comestible: " + comestible.getNombre());
			System.out.println("\n Precio original: " + comestible.getPrecio() + "| Precio con IVA: " + comestible.obtenerPrecio());
			System.out.println("\n Stock: " + comestible.getStock() + "\n ---------------- \n");
			System.out.println("Total: " + comestible.obtenerPrecio() * comestible.getStock() + "\n ---------------------------");
			ganancia += (comestible.obtenerPrecio() * comestible.getStock());
		}
		System.out.println("La ganancia total de la tienda sera de: " + ganancia);
	}
	
	public void disponibilidadProducto(String producto, String clase) {
		boolean disponibilidad = false;
		System.out.println("Producto disponible en las siguientes tiendas: \n");
		Ropa ropa;
		Comestible comestible;
		
		if(producto.equals("ropa")) {	
			for(Tienda t : listaTiendas) {
				for(String key : t.getRopa().keySet()) {
					ropa = t.getRopa().get(key);
					if(producto.equalsIgnoreCase(ropa.getNombre())) {
						disponibilidad = true;
					}
				}
				if (disponibilidad == true) {
					System.out.println(t.getNomTienda() + ", Num tieda: " + t.getNumTienda() + "\n");
				}
				disponibilidad = false;
			}	
		}else {
			for(Tienda t : listaTiendas) {
				for(String key : t.getComestibles().keySet()) {
					comestible = t.getComestibles().get(key);
					if(producto.equalsIgnoreCase(comestible.getNombre())) {
						disponibilidad = true;
					}
				}
				if (disponibilidad == true) {
					System.out.println(t.getNomTienda() + ", Num tieda: " + t.getNumTienda() + "\n");
				}
				disponibilidad = false;
			}
		}
		
	}
	
	public void tiendamenosStock() {
		int stock;
		int menosStock = 3000;
		String tiendaMenosStock = "";
		String tienda;
		Ropa ropa;
		Comestible comestible;
		
		for(Tienda t : listaTiendas) {
			stock = 0;
			tienda = t.getNomTienda();
			for(String key : t.getRopa().keySet()) {
				ropa = t.getRopa().get(key);
				stock += ropa.getStock();
			}
			for(String key : t.getComestibles().keySet()) {
				comestible = t.getComestibles().get(key);
				stock += comestible.getStock();
			}
			if(stock < menosStock) {
				menosStock = stock;
				tiendaMenosStock = tienda;
			}
			System.out.println("La tienda [" + t.getNomTienda() + "] tiene un stock de [" + stock + "]");
			
		}
		System.out.println("La tienda con menos stock es: " + tiendaMenosStock + "con un stock de \n" + menosStock);
	}
	
	public void prendaMasCara() {
		
		Ropa ropa;
		String prendaCara = "";
		double prendaMasCara = 0;
		
		
		for(String key : hashRopa.keySet()) {
			ropa = hashRopa.get(key);
			if(ropa.obtenerPrecio() > prendaMasCara) {
				prendaMasCara = ropa.obtenerPrecio();
				prendaCara = ropa.getNombre();
			}
		}
		
		System.out.println("La prenda mas cara dentro del registro de ropa es:\n" + prendaCara + " = " + prendaMasCara);
	}
	
	public void comestibleMasBarato() {
		Comestible comestible;
		String comestibleMasBarato = " ";
		double precioComestible = 45000;
		
		for(String key : hashComestibles.keySet()) {
			comestible = hashComestibles.get(key);
			if (comestible.obtenerPrecio() < precioComestible) {
				precioComestible = comestible.obtenerPrecio();
				comestibleMasBarato = comestible.getNombre();
			}
		}
		System.out.println("EL comestible mas barato dentro de comestibles es: \n" + comestibleMasBarato + " = " + precioComestible);
		
	}	
	
	public void prendasColor(String color) {
		
		Ropa ropa;
		
		System.out.println("Las prendas de color [" + color +"] que estan registradas son: \n");
		
		for(String key : hashRopa.keySet()) {
			ropa = hashRopa.get(key);
			if(ropa.getColor().equals(color)) {
				System.out.println("Penda: " + ropa.getNombre() + "\nMarca: " + ropa.getMarca());
			}
		}
		
	}

}
