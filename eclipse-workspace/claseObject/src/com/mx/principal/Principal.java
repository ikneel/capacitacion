package com.mx.principal;

import java.util.ArrayList;
import java.util.Scanner;

import com.mx.entidad.Celular;
import com.mx.entidad.Persona;
import com.mx.service.Implementacion;

public class Principal {

	public static void main(String[] args) {
		
		//Atributos de la clase celular
		String imei;
		String modelo;
		String marca;
		int ram;
		int almacenamiento;
		
		//Atributos de la clase persona
		String nombre;
		String apellido;
		int edad;
		String ciudad;
		String genero;
		
		Implementacion imp = new Implementacion();
		Celular celular = new Celular();
		Persona persona = new Persona();
		int  menu, submenu, menuc, menup, indice;
		Scanner entrada;
		
		do {
			System.out.println("\n Menu Principal");
			System.out.println("1.- Menu Personas");
			System.out.println("2.- Menu Celulares");
			System.out.println("3.- Salir");
			try {
				entrada = new Scanner(System.in);
				menu = entrada.nextInt();
				switch(menu) {
				case 1:
					do {
						System.out.println("\n Menu personas");
						System.out.println("1.- Alta");
						System.out.println("2.- Editar");
						System.out.println("3.- Buscar");
						System.out.println("4.- Eliminar");
						System.out.println("5.- Mostrar todas las personas");
						System.out.println("6.- Listar a todas las personas");
						System.out.println("7.- Regresar al menu principal");
						entrada = new Scanner(System.in);
						menup = entrada.nextInt();
						switch(menup) {
						case 1:
							System.out.println("Ingresa el nombre de la persona");
							entrada = new Scanner(System.in);
							nombre = entrada.nextLine();
							
							System.out.println("Ingresa el apellido de la persona");
							entrada = new Scanner(System.in);
							apellido = entrada.nextLine();
							
							System.out.println("Ingresa la edad de la persona");
							entrada = new Scanner(System.in);
							edad = entrada.nextInt();
							
							System.out.println("Ingresa la ciudad de la persona");
							entrada = new Scanner(System.in);
							ciudad = entrada.nextLine();
							
							System.out.println("Ingresa el sexo de la persona");
							entrada = new Scanner(System.in);
							genero = entrada.nextLine();
							persona = new Persona(nombre, apellido, edad, ciudad, genero, new ArrayList<Celular>());
							imp.guardar(persona, "persona");
							
							break;
						case 2:
							System.out.println("Ingresa el indice de la persona a editar: ");
							entrada = new Scanner(System.in);
							indice = entrada.nextInt();
							persona = (Persona)imp.buscar(null, indice, "persona");
							if (persona == null) {
								System.out.println("La persona a la que tratas de editar no existe");
							}else {
								System.out.println(persona);
								do {
									System.out.println("\n Menu editar");
									System.out.println("1.- Nombre");
									System.out.println("2.- Apellido");
									System.out.println("3.- Edad");
									System.out.println("4.- Ciudad");
									System.out.println("5.- Genero");
									System.out.println("6.- Salir del menu editar");
									entrada = new Scanner(System.in);
									submenu = entrada.nextInt();
									switch(submenu) {
									case 1:
										System.out.println("ingresa el nuevo nombre:");
										entrada = new Scanner(System.in);
										nombre = entrada.nextLine();
										persona.setNombre(nombre);
										break;
									case 2:
										System.out.println("ingresa el nuevo apellido:");
										entrada = new Scanner(System.in);
										apellido = entrada.nextLine();
										persona.setApellido(apellido);
										break;
									case 3:
										System.out.println("ingresa la edad nueva:");
										entrada = new Scanner(System.in);
										edad = entrada.nextInt();
										persona.setEdad(edad);
										break;
									case 4:
										System.out.println("ingresa la nueva ciudad:");
										entrada = new Scanner(System.in);
										ciudad = entrada.nextLine();
										persona.setCiudad(ciudad);
										break;
									case 5:
										System.out.println("ingresa el nuevo sexo de la persona:");
										entrada = new Scanner(System.in);
										genero = entrada.nextLine();
										persona.setGenero(genero);
										break;
									case 6:
										System.out.println("Saliendo del menu editar");
										break;
									default:
										System.out.println("operacion invalida, intente de nuevo");
										break;
									}
									imp.editar(persona, indice, "persona");
								}while(submenu != 6);
							}
							break;
						case 3:
							System.out.println("ingresa el indice de la persona a buscar");
							entrada = new Scanner(System.in);
							indice = entrada.nextInt();
							persona = (Persona)imp.buscar(null, indice, "persona");
							if(persona == null) {
								System.out.println("La persona que tratas de buscar no existe");
							}else {
								System.out.println("La persona ha sido encontrada: \n" + persona);
							}
							break;
						case 4:
							System.out.println("Ingresa el indice de la persona a eliminar");
							entrada = new Scanner(System.in);
							indice = entrada.nextInt();
							imp.eliminar(null, indice, "persona");
							break;
						case 5:
							imp.mostrar("persona");
							break;
						case 6:
							imp.listar("persona");
							break;
						case 7:
							System.out.println("regresando al menu principal");
							break;
						default:
							System.out.println("Opcion invalida, intenta de nuevo");
							break;
						
						}
					}while(menup != 7);
					break;
				case 2:
					do {
						System.out.println("\n Menu celulares");
						System.out.println("1.- Alta");
						System.out.println("2.- Editar");
						System.out.println("3.- Buscar");
						System.out.println("4.- Eliminar");
						System.out.println("5.- Mostrar todos los celilares");
						System.out.println("6.- Listar todos los celulares");
						System.out.println("7.- Regresar al menu principal");
						
						entrada = new Scanner(System.in);
						menuc = entrada.nextInt();
						
						switch(menuc) {
						case 1:
							System.out.println("Ingrese el imei del celular");
							entrada = new Scanner(System.in);
							imei = entrada.nextLine();
							
							System.out.println("Ingrese el modelo del celular");
							entrada = new Scanner(System.in);
							modelo = entrada.nextLine();
							
							System.out.println("Ingrese la marca del celular");
							entrada = new Scanner(System.in);
							marca = entrada.nextLine();
							
							System.out.println("Ingrese la RAM del celular");
							entrada = new Scanner(System.in);
							ram = entrada.nextInt();
							
							System.out.println("Ingrese el almacenamiento del celular");
							entrada = new Scanner(System.in);
							almacenamiento = entrada.nextInt();
							
							celular = new Celular(imei, modelo, marca, ram, almacenamiento);
							imp.guardar(celular, "celular");
							break;
						case 2:
							System.out.println("Ingresa el imei del celular a editar");
							entrada = new Scanner(System.in);
							imei = entrada.nextLine();
							celular = new Celular(imei, null, null, 0, 0);
							celular = (Celular)imp.buscar(celular, 0, "celular");
							if (celular == null) {
								System.out.println("El celular que tratas de editar no existe");
							}else {
								System.out.println(celular);
								do {
									System.out.println("\n Menu editar");
									System.out.println("1.- Modelo");
									System.out.println("2.- Marca");
									System.out.println("3.- RAM");
									System.out.println("4.- Almacenamineto");
									System.out.println("5.- Salir del menu editar");
									
									entrada = new Scanner(System.in);
									menuc = entrada.nextInt();
									
									switch(menuc) {
									case 1:
										System.out.println("Ingresa el modelo nuevo:");
										entrada = new Scanner(System.in);
										modelo = entrada.nextLine();
										celular.setModelo(modelo);
										break;
									case 2:
										System.out.println("Ingresa la nueva marca:");
										entrada = new Scanner(System.in);
										marca = entrada.nextLine();
										celular.setMarca(marca);
										break;
									case 3:
										System.out.println("Ingresa la nueva RAM:");
										entrada = new Scanner(System.in);
										ram = entrada.nextInt();
										celular.setRam(ram);
										break;
									case 4:
										System.out.println("Ingresa el almacenamiento nuevo:");
										entrada = new Scanner(System.in);
										almacenamiento = entrada.nextInt();
										celular.setAlmacenamiento(almacenamiento);
										break;
									case 5:
										System.out.println("Saliendo del menu editar");
										break;
									default:
										System.out.println("Opcion invalida, intenta otra vez");
										break;
									
									}
									imp.editar(celular, 0, "celular");
								}while(menuc != 5);
							}
							break;
						case 3:
							System.out.println("Ingrece el IMEI del celular");
							entrada = new Scanner(System.in);
							imei = entrada.nextLine();
							celular = new Celular(imei, null, null, 0, 0);
							celular = (Celular)imp.buscar(celular, 0, "celular");
							if(celular == null) {
								System.out.println("El celular que tratas de buscar no existe");
							}else {
								System.out.println("el celular ha sido encontrado: \n" + celular);
							}	
							break;
						case 4:
							System.out.println("Ingresa el IMEI del celular a eliminar");
							entrada = new Scanner(System.in);
							imei = entrada.nextLine();
							celular = new Celular(imei, null, null, 0, 0);
							imp.eliminar(celular, 0 , "celular");
							break;
							
						case 5:
							imp.mostrar("celular");
							break;
						case 6:
							imp.listar("celular");
							break;
						case 7:
							System.out.println("Regresando al menu principal");
							break;
							
						default:
							System.out.println("Opcion invalida,  intente de nuevo");
							break;
						}
					}while(menuc != 7);
					break;
				case 3:
					System.out.println("Adios");
					break;
				default:
					break;	
				}
			}catch(Exception e) {
				System.out.println("Error " + e);
				menu = 4;
			}
		}while(menu != 3 );
	}
	
}
