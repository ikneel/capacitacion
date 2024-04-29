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
				System.out.println("La persona que tratas de eliminar no existe");
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
	
	public void asignarProducto(Object object, int indice) {
		Tienda tienda = listaTiendas.get(indice);
		
		Producto producto = (Producto)object;
		
		producto = hashProductos.get(producto.getCodigoBarras());
		
		tienda.getProductos().put(producto.getCodigoBarras(), producto);
		System.out.println("Producto asignado a tienda");
		System.out.println(tienda);
	}
	
	public void eliminarProductoDeTienda(Object object, int indice) {
		Tienda tienda = listaTiendas.get(indice);
		
		Producto producto = (Producto)object;
		
		tienda.getProductos().remove(producto.getCodigoBarras());
		
		System.out.println("Producto eliminado de la tienda");
		System.out.println(tienda);
	}
	
	public void marcaConMasProductos() {
		String marcaMasProductos = "";
		int productos = 0;
		
		Producto producto, producto2;
		
		for(String key : hashProductos.keySet()) {
			int contador = 0;
			producto = hashProductos.get(key);
			for(String key2 : hashProductos.keySet()) {
				producto2 = hashProductos.get(key2);
				if(producto.getMarca().equalsIgnoreCase(producto2.getMarca())) {
					contador++;
				}		
			}
			if(contador > productos) {
				productos = contador;
				marcaMasProductos = producto.getMarca();
			}	
		}
		System.out.println("La marca: " + marcaMasProductos + " es la que tiene mas productos con : " + productos + " productos");
	}
	
	public void disponibilidadTienda(String producto) {
		boolean disponibilidad = false;
		System.out.println("Producto disponible en las siguientes tiendas: \n");
		Producto producto1;
		for(Tienda t : listaTiendas) {
			for(String key : t.getProductos().keySet()) {
				producto1 = t.getProductos().get(key);
				if(producto.equalsIgnoreCase(producto1.getNombreProducto())) {
					disponibilidad = true;
				}
			}
			if (disponibilidad == true) {
				System.out.println(t.getNombreTienda() + ", Num tieda: " + t.getNumtienda() + "\n");
			}
			disponibilidad = false;
		}
	}

	public void menosStock(int indice) {
		int stock;
		String productoMenosStock;
		Producto producto, producto2;
		
		Tienda tienda1 = listaTiendas.get(indice);
		
		
		for(String key : tienda1.getProductos().keySet()) {
			producto = tienda1.getProductos().get(key);
			stock = producto.getStock();
			productoMenosStock = producto.getNombreProducto();
			for (String key2 :tienda1.getProductos().keySet()) {
				producto2 = tienda1.getProductos().get(key2);
				if(producto2.getStock() < stock) {
					stock = producto2.getStock();
					productoMenosStock = producto2.getNombreProducto();
				}
			}
			System.out.println("La tienda: " + tienda1.getNombreTienda() + " tiene un producto con stock minimo de: " + stock + " de " + productoMenosStock);	
			break;					
		}
	}
	
	public void promedio() {
		double sumPrecios = 0;
		int productos = 0 ;
		Producto producto;
		double promedio;
		
		for (String key : hashProductos.keySet()) {
			producto = hashProductos.get(key);
			sumPrecios += producto.getPrecio();
			productos++;
		}
		promedio = sumPrecios / productos;
		System.out.println("El primedio del costo de los " + productos + " productos es de " + promedio);
	}
	
	public void calcularGanancia(int indice) {
		double ganancia = 0;
		Tienda tienda = listaTiendas.get(indice);
		
		Producto producto;
		for (String key : tienda.getProductos().keySet()) {
			producto = tienda.getProductos().get(key);
			ganancia += (producto.getPrecio() * producto.getStock());
			System.out.println("Producto: " + producto.getNombreProducto() + "\nPrecio: " + producto.getPrecio() + "\nStock: " + producto.getStock() + "\nTotal = " + 
			producto.getPrecio() * producto.getStock() + "\n ------------");
		}
		System.out.println("La ganancia total que percibira la tienda es de: " + ganancia);
	}
	
	public void tiendasPorCiudad(String ciudad) {
		System.out.println("Las tiendas en la ciudad:  " + ciudad + " son: \n");
		for(Tienda t : listaTiendas) {
			if(ciudad.equalsIgnoreCase(t.getCiudad())) {
				System.out.println("Num. Tienda: " + t.getNumtienda() + "\nNombre: " + t.getNombreTienda());
			}
		}
	}
	
	public void tiendaMasGanancia() {
		double ganancia;
		double gananciamasalta = 0;
		Producto producto;
		Tienda tienda = null;
		for(Tienda t : listaTiendas) {
			ganancia = 0;
			for(String key : t.getProductos().keySet()) {
				producto = t.getProductos().get(key);
				ganancia += (producto.getPrecio() * producto.getStock());
			}
			System.out.println("Ganancia total de la tienda con indice [" + listaTiendas.indexOf(t) + "] = " + ganancia );
			if (ganancia > gananciamasalta) {
				gananciamasalta = ganancia;
				tienda = t;
			
			}
		}
		System.out.println("La ganancia mas alta es de: " + gananciamasalta + " corresponde a la tienda:\n"
				+ "Nombre de la tienda: " + tienda.getNombreTienda() + "\n Ciudad: " + tienda.getCiudad() + "\nNumero de la tienda: " + tienda.getNumtienda());
	}
}
