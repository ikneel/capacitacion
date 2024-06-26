package com.mx.principal;

import java.util.ArrayList;
import java.util.Scanner;

import com.mx.entidad.Empleado;
import com.mx.entidad.Jefe;
import com.mx.service.ImplementacionEmpleados;
import com.mx.service.ImplementacionJefe;

public class Principal {
	public static void main(String[] args) {
		
		//Atributos de la clase persona
		String nombre;
		String apellido;
		int edad;
		String genero;
		
		//Atributos de la clase empleado
		String carrera;
		
		//Atributos de la clase jefe
		String area;
		
		ImplementacionEmpleados impEmpleado = new ImplementacionEmpleados();
		ImplementacionJefe impJefe = new ImplementacionJefe();
		
		Empleado empleado = new Empleado();
		Jefe jefe = new Jefe();
		
		int menu, submenu, menuj, menue, indice;
		Scanner entrada;
		
		do {
			
			System.out.println("\n Menu Principal");
			System.out.println("1.- Menu de empleados");
			System.out.println("2.- Menu de Jefes");
			System.out.println("3.- Salir");
			
			try {
				entrada = new Scanner(System.in);
				menu = entrada.nextInt();
				switch(menu) {
				case 1:
					break;  
				case 2:
					do {
						System.out.println("menu");
						System.out.println("1");
						System.out.println("2");
						System.out.println("3");
						System.out.println("4");
						System.out.println("5");
						System.out.println("6");
						System.out.println("7");
						entrada = new Scanner(System.in);
						menuj = entrada.nextInt();
						switch(menuj) {
						case 1:
							System.out.println("Ingresa el nombre del jefe: ");
							entrada = new Scanner(System.in);
							nombre = entrada.nextLine();
							
							System.out.println("Ingresa el apellido del jefe: ");
							entrada = new Scanner(System.in);
							apellido = entrada.nextLine();
							
							System.out.println("Ingresa la edad del jefe: ");
							entrada = new Scanner(System.in);
							edad = entrada.nextInt();
							
							System.out.println("Ingresa el genero del jefe: ");
							entrada = new Scanner(System.in);
							genero = entrada.nextLine();  	 	
							
							System.out.println("Ingresa el area del jefe: ");
							entrada = new Scanner(System.in);
							area = entrada.nextLine();
							
							jefe = new Jefe(nombre, apellido, edad, genero, area, new ArrayList<Empleado>());
							impJefe.guardar(jefe);
							break;
						case 2:
							System.out.println("Ingresa el oindice del jefe a editar");
							entrada = new Scanner(System.in);
							indice = entrada.nextInt();
							jefe = impJefe.buscar(indice);
							if(jefe == null) {
								System.out.println("El jefe que trata de buscar no existe");
							}else {
								System.out.println("Jefe");
								do {
									System.out.println("Menu de edicion");
									System.out.println("1.- Nombre");
									System.out.println("2.- Apellido");
									System.out.println("3.- Edad");
									System.out.println("4.- Genero");
									System.out.println("5.- Area");
									System.out.println("6.- Salir del menu editar");
									entrada = new Scanner(System.in);
									submenu = entrada.nextInt();
									switch(submenu) {
									case 1:
										System.out.println("Ingresa el nombre nuevo del jefe");
										entrada = new Scanner(System.in);
										nombre = entrada.nextLine();
										jefe.setNombre(nombre);
										break;
									case 2:
										System.out.println("Ingresa el apellido nuevo del jefe");
										entrada = new Scanner(System.in);
										apellido = entrada.nextLine();
										jefe.setApellido(apellido);
										break;
									case 3:
										System.out.println("Ingresa la edad nueva del jefe");
										entrada = new Scanner(System.in);
										edad = entrada.nextInt();
										jefe.setEdad(edad);
										break;
									case 4:
										System.out.println("Ingresa el genero nuevo del jefe");
										entrada = new Scanner(System.in);
										genero = entrada.nextLine();
										jefe.setGenero(genero);
										break;
									case 5:
										System.out.println("Ingresa la nueva area del jefe");
										entrada = new Scanner(System.in);
										area = entrada.nextLine();
										jefe.setArea(area);
										break;
									case 6:
										System.out.println("Saliendo... hecho");
										break;
									default:
										break;
										
									}
								}while(submenu != 6); 
							}
							break;
						case 3:
							System.out.println("Ingresa el indice del jefe a buscar:");
							entrada = new Scanner(System.in);
							indice = entrada.nextInt();
							jefe = impJefe.buscar(indice);
							if (jefe == null) {
								System.out.println("El indice del jefe que tratas de buscar no existe");
							}else {
								System.out.println("El jefe ha sido encontrado: \n" + jefe);
							}
							break;
						case 4:
							System.out.println("Ingresa el indice del jefe que quieres eliminar");
							entrada = new Scanner(System.in);
							indice = entrada.nextInt();
							impJefe.eliminar(indice);
							break;
						case 5:
							break;
						case 6:
							impJefe.listar();
							break;
						case 7:
							System.out.println("Adios");
							break;
							
						}
					}while(menuj != 6);
					
				 
					break;
				case 3:
					System.out.println("Saliendo... Hecho");
					break;
				default:
					System.out.println("Opcion invalida, intenta otra vez");
					break;
				}
				
				
				}catch (Exception e) {
					System.out.println("Error" + e);
					menu = 4;
				}
		}while (menu != 3);
	}
}
