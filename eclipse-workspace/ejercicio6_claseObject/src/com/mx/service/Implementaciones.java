package com.mx.service;

import com.mx.entidad.Tienda;
import com.mx.entidad.Producto;
import com.mx.metodos.Metodos;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Implementaciones implements Metodos{
	List<Tienda> listaTiendas = new ArrayList<Tienda>();
	HashMap<String, Producto> hashProductos = new HashMap<String, Producto>();
	
	@Override
	public void guardar(Object object, String clase) {
		if(clase.equals("tienda")) {
			Tienda tienda = (Tienda) object;
			if(listaTiendas.isEmpty()) {
				listaTiendas.add(tienda);
			}else {
				int bandera = 0;
				for(Tienda t : listaTiendas) {
					if(tienda.getNumtienda() == t.getNumtienda() &&
					   tienda.getNombreTienda().equalsIgnoreCase(t.getNombreTienda())) {
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
		}else {
			Producto producto = (Producto)object;
			if(hashProductos.isEmpty()) {
				hashProductos.put(producto.getCodigoBarras(), producto);
				System.out.println("el producto ha sido registrado");
			}else {
				if(hashProductos.containsKey(producto.getCodigoBarras())) {
					System.out.println("Ese codigo de barras ya existe, intenta con otro");
				}else {
					boolean bandera = false;
					Producto producto_aux;
					for(String key : hashProductos.keySet()) {
						producto_aux = hashProductos.get(key);
						if(producto.getMarca().equalsIgnoreCase(producto_aux.getMarca()) && 
						   producto.getNombreProducto().equalsIgnoreCase(producto_aux.getNombreProducto())) {
							System.out.println("Ese producto ya esta registrado");
							bandera = true;
							break;
						}
					}
					if(bandera == false) {
						hashProductos.put(producto.getCodigoBarras(), producto);
						System.out.println("el producto fue registrado");
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
		}else {
			Producto producto = (Producto)object;
			hashProductos.put(producto.getCodigoBarras(), producto);
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
				System.out.println("LA persona que tratas de eliminar no existe");
			}
		}else {
			Producto producto = (Producto)object;
			if(hashProductos.containsKey(producto.getCodigoBarras())) {
				producto = hashProductos.get(producto.getCodigoBarras());
				hashProductos.remove(producto.getCodigoBarras());
				System.out.println("El producto ha sido eliminado \n" + producto);
			}else {
				System.out.println("El producto que tratas de eliminar no existe");
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
		}else {
			Producto producto = (Producto)object;
			if(hashProductos.containsKey(producto.getCodigoBarras())) {
				return hashProductos.get(producto.getCodigoBarras());
			}else {
				return null;
			}			
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
		}else {
			if(hashProductos.isEmpty()) {
				System.out.println("No hay productos que mostrar");
			}else {
				System.out.println("Se encontraron los siguientes productos: \n" + hashProductos);
			}
		}	
	}
	
	public void listar(String clase) {
		if(clase.equals("tienda")) {
			if(listaTiendas.isEmpty()) {
				System.out.println("No existen tiendas que listar");
			}else {
				for (Tienda t : listaTiendas) {
					System.out.println("[" + listaTiendas.indexOf(t) + "] => " + t.getNombreTienda() + " " + t.getCiudad());
				}
			}
		}else {
			if(hashProductos.isEmpty()) {
				System.out.println("no hay productos que listar");
			}else {
				Producto producto;
				for(String key : hashProductos.keySet()) {
					producto = hashProductos.get(key);
					System.out.println("[" + key + "] => " + producto.getMarca() + " " + producto.getNombreProducto());
				}
			}
		}
	}

}