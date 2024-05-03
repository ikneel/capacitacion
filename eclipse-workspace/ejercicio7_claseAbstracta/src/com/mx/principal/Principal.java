package com.mx.principal;

import java.util.HashMap;
import java.util.Scanner;

import com.mx.entidad.Comestible;
import com.mx.entidad.Ropa;
import com.mx.entidad.Tienda;
import com.mx.service.Implementacion;

public class Principal {
	
	public static void main(String [] args) {
		
		//Atributos de la clase Tienda
		int numTienda;
		String nomTienda;
		String ciudad;
		String colonia;
		int numExterior;
		
		//Atributos de la clase Producto
		
		String codigoBarras;
		String nombre;
		String marca;
		double precio;
		int stock;
		
		//Atributos de la clase Ropa
		
		String talla;
		String color;
		
		//Atributos de la clase Comestible
		
		String tipo;
		
		Implementacion imp = new Implementacion();
		
		Tienda tienda = new Tienda();
		Ropa ropa = new Ropa();
		Comestible comestible = new Comestible();
		int menu, submenu, menut, menur, menuc, indice;
		Scanner entrada;
		
		Tienda tienda1 = new Tienda(3, "Genesis", "Edo mex", "Cuautitlan", 10, new HashMap<String, Comestible>(), new HashMap<String, Ropa>());
		Tienda tienda2 = new Tienda(5, "sis", "Edo mex", "Tultepec", 20, new HashMap<String, Comestible>(), new HashMap<String, Ropa>());
		Tienda tienda3 = new Tienda(6, "Gene", "CDMX", "Benito juarez", 15, new HashMap<String, Comestible>(), new HashMap<String, Ropa>());
		
		
		Ropa ropa1 =  new Ropa("tito", "Camisa", "Verska", 400, 15, "M", "Blanca");
		Ropa ropa2 =  new Ropa("toti", "Pantalon", "Vans",800, 20, "S", "Negro");
		Ropa ropa3 =  new Ropa("titi", "Vestido", "Verska", 600, 10, "S", "Negro");
		
		
		Comestible comestible1 =  new Comestible("rtx", "Crema", "Alpura", 19, 20, "Lacteo");
		Comestible comestible2 =  new Comestible("rtx2", "Tortillas", "Tia rosa", 30 , 15, "Harinas");
		Comestible comestible3 =  new Comestible("rtx3", "Leche", "Alpura", 25, 10, "Lacteo");
		
		imp.guardar(tienda1, "tienda");
		imp.guardar(tienda2, "tienda");
		imp.guardar(tienda3, "tienda");
		
		imp.guardar(ropa1, "ropa");
		imp.guardar(ropa2, "ropa");
		imp.guardar(ropa3, "ropa");
		
		imp.guardar(comestible1, "comestible");
		imp.guardar(comestible2, "comestible");
		imp.guardar(comestible3, "comestible");
	
		
		do {
			System.out.println("\n Menu Principal");
			System.out.println("1.- Menu Tienda");
			System.out.println("2.- Menu Ropa");
			System.out.println("3.- Menu Comestible");
			System.out.println("4.- Salir");
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
						System.out.println("7.- Mostrar mas ganancia en tienda");
						System.out.println("8.- Mostrar la tienda con mas ganancia");
						System.out.println("9.- Calcular ganancia de un tienda");
						System.out.println("10.- Buscar disponibildad de producto en tienda");
						System.out.println("11.- Mostrar tienda con menos stock");
						System.out.println("12.- Regresar al menu principal");
						entrada = new Scanner(System.in);
						menut = entrada.nextInt();
						switch(menut) {
						case 1:
							System.out.println("Ingresa el nombre de la tienda");
							entrada = new Scanner(System.in);
							nomTienda = entrada.nextLine();
							
							System.out.println("Ingresa la ciudad donde se encuentra la tienda");
							entrada = new Scanner(System.in);
							ciudad = entrada.nextLine();
							
							System.out.println("Ingresa el numero de la tienda");
							entrada = new Scanner(System.in);
							numTienda = entrada.nextInt();
							
							System.out.println("Ingresa la colonia donde se encuentra la tienda");
							entrada = new Scanner(System.in);
							colonia = entrada.nextLine();
							
							System.out.println("Ingresa el numero exterior de la tienda");
							entrada = new Scanner(System.in);
							numExterior = entrada.nextInt();
							
							tienda = new Tienda(numTienda, nomTienda, ciudad, colonia, numExterior, new HashMap<String, Comestible>(), new HashMap<String, Ropa>());
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
									System.out.println("4.- Numero exterior donde se ubica");
									System.out.println("5.- Salir del menu editar");
									entrada = new Scanner(System.in);
									submenu = entrada.nextInt();
									switch(submenu) {
									case 1:
										System.out.println("Ingresa el nuevo nombre de la tienda:");
										entrada = new Scanner(System.in);
										nomTienda = entrada.nextLine();
										tienda.setNomTienda(nomTienda);;
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
										System.out.println("Ingresa el nuevo numero exterior de la tienda:");
										entrada = new Scanner(System.in);
										numExterior = entrada.nextInt();
										tienda.setNumExterior(numExterior);
										break;
									case 5:
										System.out.println("Saliendo del menu editar");
										break;
									default:
										System.out.println("operacion invalida, intente de nuevo");
										break;
									}
									imp.editar(tienda, indice, "persona");
								}while(submenu != 5);
							}
							break;
						case 3:
							System.out.println("Ingresa el indice de la tienda a buscar");
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
							System.out.println("Ingrese el indice de la tienda de la que quiere saber si su ganancia mas alta es por producto o ropa:");
							entrada = new Scanner(System.in);
							indice = entrada.nextInt();
									
							imp.gananciaenTiendaRoC(indice);;
							break;
						case 8:						
							imp.masGanancia();;
							break;
						case 9:
							System.out.println("Ingresa el indice de la tienda para conocer su ganancia");
							entrada = new Scanner(System.in);
							indice = entrada.nextInt();
							imp.calcularGanancia(indice);;
							break;
						case 10:
							System.out.println("Ingresa el nombre del producto a buscar");
							entrada = new Scanner(System.in);
							nombre = entrada.nextLine();
							System.out.println("Ingresa el tipo de producto a buscar (ropa o comestible)");
							entrada = new Scanner(System.in);
							tipo = entrada.nextLine();
							
							imp.disponibilidadProducto(nombre, tipo);
							break;
						case 11:
							imp.tiendamenosStock();
							break;
						case 12:
							System.out.println("Regresando al menu principal");
							break;
						default:
							System.out.println("Opcion invalida, intenta de nuevo");
							break;
						
						}
					}while(menut != 12);
					break;
				case 2:
					do {
						System.out.println("\n Menu Ropa");
						System.out.println("1.- Alta");
						System.out.println("2.- Editar");
						System.out.println("3.- Buscar");
						System.out.println("4.- Eliminar");
						System.out.println("5.- Mostrar toda la ropa");
						System.out.println("6.- Listar toda la ropa");
						System.out.println("7.- Asignar ropa a tienda");
						System.out.println("8.- Eliminar producto de tienda");
						System.out.println("9.- Mostrar la prenda mas cara");
						System.out.println("10.- Mostrar las prendas de un color");
						System.out.println("11.- Regresar al menu principal");
						
						entrada = new Scanner(System.in);
						menur = entrada.nextInt();
						
						switch(menur) {
						case 1:
							System.out.println("Ingrese el codigo de barras del producto");
							entrada = new Scanner(System.in);
							codigoBarras = entrada.nextLine();
							
							System.out.println("Ingrese el nombre del producto");
							entrada = new Scanner(System.in);
							nombre = entrada.nextLine();
							
							System.out.println("Ingrese la marca del producto");
							entrada = new Scanner(System.in);
							marca = entrada.nextLine();
							
							System.out.println("Ingrese el precio del producto");
							entrada = new Scanner(System.in);
							precio = entrada.nextDouble();
							
							
							System.out.println("Ingrese el stock del producto");
							entrada = new Scanner(System.in);
							stock = entrada.nextInt();
							
							System.out.println("Ingrese el talla del producto");
							entrada = new Scanner(System.in);
							talla = entrada.nextLine();
							
							System.out.println("Ingrese el color del producto");
							entrada = new Scanner(System.in);
							color = entrada.nextLine();
							ropa =  new Ropa(codigoBarras, nombre, marca, precio, stock, talla, color);
							imp.guardar(ropa, "ropa");
							break;
						case 2:
							System.out.println("Ingresa el codigo de barras de la prenda a editar");
							entrada = new Scanner(System.in);
							codigoBarras = entrada.nextLine();
							ropa = new Ropa(codigoBarras);
							ropa = (Ropa)imp.buscar(ropa, 0, "producto");
							if (ropa == null) {
								System.out.println("La prenda que tratas de editar no existe");
							}else {
								System.out.println(ropa);
								do {
									System.out.println("\n Menu editar");
									System.out.println("1.- Nombre de la prenda");
									System.out.println("2.- Marca");
									System.out.println("3.- Precio");
									System.out.println("4.- Stock");
									System.out.println("5.- Talla");
									System.out.println("6.- Color");
									System.out.println("7.- Salir del menu editar");
									
									entrada = new Scanner(System.in);
									menur = entrada.nextInt();
									
									switch(menur) {
									case 1:
										System.out.println("Ingresa el nuevo nombre del producto:");
										entrada = new Scanner(System.in);
										nombre = entrada.nextLine();
										ropa.setNombre(nombre);
										break;
									case 2:
										System.out.println("Ingresa la nueva marca:");
										entrada = new Scanner(System.in);
										marca = entrada.nextLine();
										ropa.setMarca(marca);
										break;
									case 3:
										System.out.println("Ingresa el nuevo precio:");
										entrada = new Scanner(System.in);
										precio = entrada.nextDouble();
										ropa.setPrecio(precio);
										break;
									case 4:
										System.out.println("Ingresa el stock del producto");
										entrada = new Scanner(System.in);
										stock = entrada.nextInt();
										ropa.setStock(stock);;
										break;
									case 5:
										System.out.println("Ingresa la talla de la prenda:");
										entrada = new Scanner(System.in);
										talla = entrada.nextLine();
										ropa.setTalla(talla);
										break;
									case 6:
										System.out.println("Ingresa el color de la prenda:");
										entrada = new Scanner(System.in);
										color = entrada.nextLine();
										ropa.setColor(color);
										break;
									case 7:
										System.out.println("Saliendo del menu editar");
										break;
									default:
										System.out.println("Opcion invalida, intenta otra vez");
										break;
									
									}
									imp.editar(ropa, 0, "ropa");
								}while(menur != 7);
							}
							break;
						case 3:
							System.out.println("Ingrece el codigo de barras del producto");
							entrada = new Scanner(System.in);
							codigoBarras = entrada.nextLine();
							ropa = new Ropa(codigoBarras);
							ropa = (Ropa)imp.buscar(ropa, 0, "ropa");
							if(ropa == null) {
								System.out.println("La prenda que tratas de buscar no existe");
							}else {
								System.out.println("La prenda ha sido encontrado: \n" + ropa);
							}	
							break;
						case 4:
							System.out.println("Ingresa el codigo de barras del producto a eliminar");
							entrada = new Scanner(System.in);
							codigoBarras = entrada.nextLine();
							ropa = new Ropa(codigoBarras);
							imp.eliminar(ropa, 0 , "ropa");
							break;
							
						case 5:
							imp.mostrar("ropa");
							break;
						case 6: 
							imp.listar("ropa");
							break;
						case 7:
							System.out.println("Ingresa el codigo de barras del producto a asignar");
							entrada = new Scanner(System.in);
							codigoBarras = entrada.nextLine();
							ropa = new Ropa(codigoBarras);
							ropa = (Ropa)imp.buscar(ropa, 0, "ropa");
							if (ropa == null) {
								System.out.println("El producto no existe");
								break;
							}else {
								System.out.println(ropa);
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
							
							imp.asignarProducto(ropa, indice, "ropa");
							
							break;
						case 8:
							System.out.println("Ingresa el indice de la tienda de la que queires eliminar una prenda");
							entrada = new Scanner(System.in);
							indice = entrada.nextInt();
							
							System.out.println("Ingresa el codigo de barras de la prenda a eliminar");
							entrada = new Scanner(System.in);
							codigoBarras = entrada.nextLine();
							ropa = new Ropa(codigoBarras);
							
							imp.eliminarProductoDeTienda(ropa, indice, "ropa");
							break;
						case 9:
							imp.prendaMasCara();
							break;
						case 10:
							System.out.println("Ingresa el color para ver las prendas de ese color");
							entrada = new Scanner(System.in);
							color = entrada.nextLine();
							imp.prendasColor(color);
							break;
						case 11:
							System.out.println("Regresando al menu principal");
							break;
							
						default:
							System.out.println("Opcion invalida,  intente de nuevo");
							break;
						}
					}while(menur != 11);
					break;
				case 3:
					do {
						System.out.println("\n Menu Comestible");
						System.out.println("1.- Alta");
						System.out.println("2.- Editar");
						System.out.println("3.- Buscar");
						System.out.println("4.- Eliminar");
						System.out.println("5.- Mostrar todos los comestibles");
						System.out.println("6.- Listar todos los comestibles");
						System.out.println("7.- Asignar comestible a tienda");
						System.out.println("8.- Eliminar producto de tienda");
						System.out.println("9.- Mostrar el comestible mas barato");
						System.out.println("10.- Regresar al menu principal");
						
						entrada = new Scanner(System.in);
						menuc = entrada.nextInt();
						
						switch(menuc) {
						case 1:
							System.out.println("Ingrese el codigo de barras del producto");
							entrada = new Scanner(System.in);
							codigoBarras = entrada.nextLine();
							
							System.out.println("Ingrese el nombre del producto");
							entrada = new Scanner(System.in);
							nombre = entrada.nextLine();
							
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
							
							comestible =  new Comestible(codigoBarras, nombre, marca, precio, stock, tipo);
							imp.guardar(comestible, "comestible");
							break;
						case 2:
							System.out.println("Ingresa el codigo de barras del comestible a editar");
							entrada = new Scanner(System.in);
							codigoBarras = entrada.nextLine();
							comestible = new Comestible(codigoBarras);
							comestible = (Comestible)imp.buscar(comestible, 0, "comestible");
							if (comestible == null) {
								System.out.println("El comestible que tratas de editar no existe");
							}else {
								System.out.println(ropa);
								do {
									System.out.println("\n Menu editar");
									System.out.println("1.- Nombre del comestible");
									System.out.println("2.- Marca");
									System.out.println("3.- Precio");
									System.out.println("4.- Stock");
									System.out.println("5.- Tipo");
									System.out.println("6.- Salir del menu editar");
									
									entrada = new Scanner(System.in);
									submenu = entrada.nextInt();
									
									switch(submenu) {
									case 1:
										System.out.println("Ingresa el nuevo nombre del producto:");
										entrada = new Scanner(System.in);
										nombre = entrada.nextLine();
										comestible.setNombre(nombre);
										break;
									case 2:
										System.out.println("Ingresa la nueva marca:");
										entrada = new Scanner(System.in);
										marca = entrada.nextLine();
										comestible.setMarca(marca);
										break;
									case 3:
										System.out.println("Ingresa el nuevo precio:");
										entrada = new Scanner(System.in);
										precio = entrada.nextDouble();
										comestible.setPrecio(precio);
										break;
									case 4:
										System.out.println("Ingresa el stock del producto");
										entrada = new Scanner(System.in);
										stock = entrada.nextInt();
										comestible.setStock(stock);;
										break;
									case 5:
										System.out.println("Ingresa el tipo del comestible:");
										entrada = new Scanner(System.in);
										talla = entrada.nextLine();
										comestible.setTipo(talla);
										break;
									case 6:
										System.out.println("Saliendo del menu editar");
										break;
									default:
										System.out.println("Opcion invalida, intenta otra vez");
										break;
									
									}
									imp.editar(comestible, 0, "comestible");
								}while(submenu != 6);
							}
							break;
						case 3:
							System.out.println("Ingrece el codigo de barras del producto");
							entrada = new Scanner(System.in);
							codigoBarras = entrada.nextLine();
							comestible = new Comestible(codigoBarras);
							comestible = (Comestible)imp.buscar(comestible, 0, "comestible");
							if(comestible == null) {
								System.out.println("El comestible que tratas de buscar no existe");
							}else {
								System.out.println("El comestible ha sido encontrado: \n" + comestible);
							}	
							break;
						case 4:
							System.out.println("Ingresa el codigo de barras del producto a eliminar");
							entrada = new Scanner(System.in);
							codigoBarras = entrada.nextLine();
							comestible = new Comestible(codigoBarras);
							imp.eliminar(comestible, 0 , "comestible");
							break;
							
						case 5:
							imp.mostrar("comestible");
							break;
						case 6: 
							imp.listar("comestible");
							break;
						case 7:
							System.out.println("Ingresa el codigo de barras del producto a asignar");
							entrada = new Scanner(System.in);
							codigoBarras = entrada.nextLine();
							comestible = new Comestible(codigoBarras);
							comestible = (Comestible)imp.buscar(comestible, 0, "comestible");
							if (comestible == null) {
								System.out.println("El producto no existe");
								break;
							}else {
								System.out.println(comestible);
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
							
							imp.asignarProducto(comestible, indice, "comestible");
							
							break;
						case 8:
							System.out.println("Ingresa el indice de la tienda de la que queires eliminar un comestible");
							entrada = new Scanner(System.in);
							indice = entrada.nextInt();
							
							System.out.println("Ingresa el codigo de barras del comestible a eliminar");
							entrada = new Scanner(System.in);
							codigoBarras = entrada.nextLine();
							comestible = new Comestible(codigoBarras);
							
							imp.eliminarProductoDeTienda(comestible, indice, "comestible");
							break;
						case 9:
							imp.comestibleMasBarato();
							break;
						case 10:
							System.out.println("Regresando al menu principal");
							break;
							
						default:
							System.out.println("Opcion invalida,  intente de nuevo");
							break;
						}
					}while(menuc != 10);
					break;
					
				case 4:
					System.out.println("Adios");
				default:
					System.out.println("Opcion invalida, intente otra vez");
					break;	
				}
			}catch(Exception e) {
				System.out.println("Error " + e);
				menu = 5;
			}
		}while(menu != 4 );
		
	}
}
