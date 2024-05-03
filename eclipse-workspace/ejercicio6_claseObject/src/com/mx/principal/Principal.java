package com.mx.principal;


import java.util.HashMap;
import java.util.Scanner;

import com.mx.entidad.Tienda;
import com.mx.entidad.Producto;
import com.mx.service.Implementaciones;

public class Principal {
	public static void main(String[] args) {
		//Atributos de la clase tienda
		int numtienda;
		String nombreTienda;
		String ciudad;
		String colonia;
		String calle;
		int numExterior;
		
		//Atributos de la clase producto
		String codigoBarras;
		String nombreProducto;
		String marca; 
		double precio;
		int stock;
		String tipo;
		
		Implementaciones imp = new Implementaciones();
		Tienda tienda = new Tienda();
		Producto producto = new Producto();
		int menu, submenu, menut, menup, indice;
		Scanner entrada;
		
		do {
			System.out.println("\n Menu Principal");
			System.out.println("1.- Menu Tienda");
			System.out.println("2.- Menu Producto");
			System.out.println("3.- Salir");
			try {
				entrada = new Scanner(System.in);
				menu = entrada.nextInt();
				switch(menu) {
				case 1:
					do {
						System.out.println("\n Menu Tienda");
						System.out.println("1.- Alta");
						System.out.println("2.- Editar");
						System.out.println("3.- Buscar");
						System.out.println("4.- Eliminar");
						System.out.println("5.- Mostrar todas las tiendas");
						System.out.println("6.- Listar a todas las tiendas");
						System.out.println("7.- Calcular ganancia de tienda");
						System.out.println("8.- Mostrar tiendas en una ciudad");
						System.out.println("9.- Tienda con mas ganancia");
						System.out.println("10.- Regresar al menu principal");
						entrada = new Scanner(System.in);
						menut = entrada.nextInt();
						switch(menut) {
						case 1:
							System.out.println("Ingresa el nombre de la tienda");
							entrada = new Scanner(System.in);
							nombreTienda = entrada.nextLine();
							
							System.out.println("Ingresa la ciudad donde se encuentra la tienda");
							entrada = new Scanner(System.in);
							ciudad = entrada.nextLine();
							
							System.out.println("Ingresa el numero de la tienda");
							entrada = new Scanner(System.in);
							numtienda = entrada.nextInt();
							
							System.out.println("Ingresa la colonia donde se encuentra la tienda");
							entrada = new Scanner(System.in);
							colonia = entrada.nextLine();
							
							System.out.println("Ingresa la calle donde se encuentra la tienda");
							entrada = new Scanner(System.in);
							calle = entrada.nextLine();
							
							System.out.println("Ingresa el numero exterior de la tienda");
							entrada = new Scanner(System.in);
							numExterior = entrada.nextInt();
							
							tienda = new Tienda(numtienda, nombreTienda, ciudad, colonia, calle, numExterior, new HashMap<String, Producto>());
							imp.guardar(tienda, "tienda");
							
							break;
						case 2:
							System.out.println("Ingresa el indice de la tienda a editar: ");
							entrada = new Scanner(System.in);
							indice = entrada.nextInt();
							tienda = (Tienda)imp.buscar(null, indice, "tienda");
							if (tienda == null) {
								System.out.println("La tienda que tratas de editar no existe");
							}else {
								System.out.println(tienda);
								do {
									System.out.println("\n Menu editar");
									System.out.println("1.- Nombre de la tienda");
									System.out.println("2.- Ciudad donde se ubica");
									System.out.println("3.- Colonia donde se ubica");
									System.out.println("4.- Calle donde se ubica");
									System.out.println("5.- Numero exterior donde se ubica");
									System.out.println("6.- Salir del menu editar");
									entrada = new Scanner(System.in);
									submenu = entrada.nextInt();
									switch(submenu) {
									case 1:
										System.out.println("Ingresa el nuevo nombre de la tienda:");
										entrada = new Scanner(System.in);
										nombreTienda = entrada.nextLine();
										tienda.setNombreTienda(nombreTienda);
										break;
									case 2:
										System.out.println("ingresa la nueva ciudad:");
										entrada = new Scanner(System.in);
										ciudad = entrada.nextLine();
										tienda.setCiudad(ciudad);
										break;
									case 3:
										System.out.println("ingresa la nueva colonia:");
										entrada = new Scanner(System.in);
										colonia = entrada.nextLine();
										tienda.setColonia(colonia);
										break;
									case 4:
										System.out.println("ingresa la nueva calle:");
										entrada = new Scanner(System.in);
										calle = entrada.nextLine();
										tienda.setCalle(calle);
										break;
									case 5:
										System.out.println("Ingresa el nuevo numero exterior de la tienda:");
										entrada = new Scanner(System.in);
										numExterior = entrada.nextInt();
										tienda.setNumExterior(numExterior);
										break;
									case 6:
										System.out.println("Saliendo del menu editar");
										break;
									default:
										System.out.println("operacion invalida, intente de nuevo");
										break;
									}
									imp.editar(tienda, indice, "persona");
								}while(submenu != 6);
							}
							break;
						case 3:
							System.out.println("ingresa el indice de la tienda a buscar");
							entrada = new Scanner(System.in);
							indice = entrada.nextInt();
							tienda = (Tienda)imp.buscar(null, indice, "tienda");
							if(tienda == null) {
								System.out.println("La tienda que tratas de buscar no existe");
							}else {
								System.out.println("La tienda ha sido encontrada: \n" + tienda);
							}
							break;
						case 4:
							System.out.println("Ingresa el indice de la tienda a eliminar");
							entrada = new Scanner(System.in);
							indice = entrada.nextInt();
							imp.eliminar(null, indice, "tienda");
							break;
						case 5:
							imp.mostrar("tienda");
							break;
						case 6:
							imp.listar("tienda");
							break;
						case 7:
							System.out.println("Ingrese el indice de la tienda de la que quiere saber su ganancia:");
							entrada = new Scanner(System.in);
							indice = entrada.nextInt();
									
							imp.calcularGanancia(indice);
							break;
						case 8:
							System.out.println("Ingrese la ciudad para mostrar sus tiendas");
							entrada = new Scanner(System.in);
							ciudad  = entrada.nextLine();
							imp.tiendasPorCiudad(ciudad);
							break;
						case 9:
							imp.tiendaMasGanancia();
							break;
						case 10:
							System.out.println("Regresando al menu principal");
							break;
						default:
							System.out.println("Opcion invalida, intenta de nuevo");
							break;
						
						}
					}while(menut != 10);
					break;
				case 2:
					do {
						System.out.println("\n Menu Producto");
						System.out.println("1.- Alta");
						System.out.println("2.- Editar");
						System.out.println("3.- Buscar");
						System.out.println("4.- Eliminar");
						System.out.println("5.- Mostrar todos los Productos");
						System.out.println("6.- Listar todos los Productos");
						System.out.println("7.- Asignar producto a tienda");
						System.out.println("8.- Eliminar producto de tienda");
						System.out.println("9.- Marca con mas productos");
						System.out.println("10.- Mostrar disponibilidad de producto en tiendas");
						System.out.println("11.- Mostrar producto con menos stock");
						System.out.println("12.- Promedio de precio de productos");
						System.out.println("13.- Regresar al menu principal");
						
						entrada = new Scanner(System.in);
						menup = entrada.nextInt();
						
						switch(menup) {
						case 1:
							System.out.println("Ingrese el codigo de barras del producto");
							entrada = new Scanner(System.in);
							codigoBarras = entrada.nextLine();
							
							System.out.println("Ingrese el nombre del producto");
							entrada = new Scanner(System.in);
							nombreProducto = entrada.nextLine();
							
							System.out.println("Ingrese la marca del producto");
							entrada = new Scanner(System.in);
							marca = entrada.nextLine();
							
							System.out.println("Ingrese el precio del producto");
							entrada = new Scanner(System.in);
							precio = entrada.nextDouble();
							
							System.out.println("Ingrese el stock del producto");
							entrada = new Scanner(System.in);
							stock = entrada.nextInt();
							
							System.out.println("Ingrese el tipo del producto");
							entrada = new Scanner(System.in);
							tipo = entrada.nextLine();
							
							producto =  new Producto(codigoBarras, nombreProducto, marca, precio, stock, tipo);
							imp.guardar(producto, "producto");
							break;
						case 2:
							System.out.println("Ingresa el codigo de barras del producto a editar");
							entrada = new Scanner(System.in);
							codigoBarras = entrada.nextLine();
							producto = new Producto(codigoBarras);
							producto = (Producto)imp.buscar(producto, 0, "producto");
							if (producto == null) {
								System.out.println("El producto que tratas de editar no existe");
							}else {
								System.out.println(producto);
								do {
									System.out.println("\n Menu editar");
									System.out.println("1.- Nombre del producto");
									System.out.println("2.- Marca");
									System.out.println("3.- Precio");
									System.out.println("4.- Stock");
									System.out.println("5.- Tipo");
									System.out.println("6.- Salir del menu editar");
									
									entrada = new Scanner(System.in);
									menup = entrada.nextInt();
									
									switch(menup) {
									case 1:
										System.out.println("Ingresa el nuevo nombre del producto:");
										entrada = new Scanner(System.in);
										nombreProducto = entrada.nextLine();
										producto.setNombreProducto(nombreProducto);
										break;
									case 2:
										System.out.println("Ingresa la nueva marca:");
										entrada = new Scanner(System.in);
										marca = entrada.nextLine();
										producto.setMarca(marca);
										break;
									case 3:
										System.out.println("Ingresa el nuevo precio:");
										entrada = new Scanner(System.in);
										precio = entrada.nextDouble();
										producto.setPrecio(precio);
										break;
									case 4:
										System.out.println("Ingresa el stock del producto");
										entrada = new Scanner(System.in);
										stock = entrada.nextInt();
										producto.setStock(stock);;
										break;
									case 5:
										System.out.println("Ingresa el tipo del producto:");
										entrada = new Scanner(System.in);
										tipo = entrada.nextLine();
										producto.setTipo(tipo);
										break;
									case 6:
										System.out.println("Saliendo del menu editar");
										break;
									default:
										System.out.println("Opcion invalida, intenta otra vez");
										break;
									
									}
									imp.editar(producto, 0, "producto");
								}while(menup != 6);
							}
							break;
						case 3:
							System.out.println("Ingrece el codigo de barras del producto");
							entrada = new Scanner(System.in);
							codigoBarras = entrada.nextLine();
							producto = new Producto(codigoBarras);
							producto = (Producto)imp.buscar(producto, 0, "producto");
							if(producto == null) {
								System.out.println("El producto que tratas de buscar no existe");
							}else {
								System.out.println("El producto ha sido encontrado: \n" + producto);
							}	
							break;
						case 4:
							System.out.println("Ingresa el codigo de barras del producto a eliminar");
							entrada = new Scanner(System.in);
							codigoBarras = entrada.nextLine();
							producto = new Producto(codigoBarras);
							imp.eliminar(producto, 0 , "producto");
							break;
							
						case 5:
							imp.mostrar("producto");
							break;
						case 6: 
							imp.listar("producto");
							break;
						case 7:
							System.out.println("Ingresa el codigo de barras del producto a asignar");
							entrada = new Scanner(System.in);
							codigoBarras = entrada.nextLine();
							producto = new Producto(codigoBarras);
							producto = (Producto)imp.buscar(producto, 0, "producto");
							if (producto == null) {
								System.out.println("El producto no existe");
								break;
							}else {
								System.out.println(producto);
							}
							System.out.println("Ingresa el indice de la tienda a asignar el producto:");
							entrada = new Scanner(System.in);
							indice = entrada.nextInt();
							tienda = (Tienda)imp.buscar(null, indice, "tienda");
							if(tienda == null) {
								System.out.println("La tienda no existe");
								break;
							}else {
								System.out.println(tienda);;
							}
							
							imp.asignarProducto(producto, indice);
							
							break;
						case 8:
							System.out.println("Ingresa el indice de la tienda de la que queires eliminar un producto");
							entrada = new Scanner(System.in);
							indice = entrada.nextInt();
							
							System.out.println("Ingresa el codigo de barras del producto a eliminar");
							entrada = new Scanner(System.in);
							codigoBarras = entrada.nextLine();
							producto = new Producto(codigoBarras);
							
							imp.eliminarProductoDeTienda(producto, indice);
							break;
						case 9:
							imp.marcaConMasProductos();
							break;
						case 10:
							System.out.println("Ingresa el nombre del producto");
							entrada = new Scanner(System.in);
							nombreProducto = entrada.nextLine();
							imp.disponibilidadTienda(nombreProducto);
							break;
						case 11:
							System.out.println("Ingresa el indice de la tienda de la que queiras conocer el producto con menos stock");
							entrada = new Scanner(System.in);
							indice = entrada.nextInt();
							imp.menosStock(indice);
							break;
						case 12:
							imp.promedio();
							break;
						case 13:
							System.out.println("Regresando al menu principal");
							break;
							
						default:
							System.out.println("Opcion invalida,  intente de nuevo");
							break;
						}
					}while(menup != 13);
					break;
				case 3:
					System.out.println("Adios");
					break;
				default:
					System.out.println("Opcion invalida, intente otra vez");
					break;	
				}
			}catch(Exception e) {
				System.out.println("Error " + e);
				menu = 4;
			}
		}while(menu != 3 );
		
		
	}
}
