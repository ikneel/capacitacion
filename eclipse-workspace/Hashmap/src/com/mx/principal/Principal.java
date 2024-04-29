package com.mx.principal;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import com.mx.entidad.Mascota;
import com.mx.entidad.Persona;
import com.mx.service.ImplementacionPersonas;
import com.mx.service.ImplementacionMascotas;

import com.mx.entidad.Mascota;

public class Principal {
	public static void main(String[] args) {
		//Atributos clase Persona

		//Atributos clase Mascota
		int numeroRegistro;
		String nombrem;
		String especie;
		String raza;
		String generom;
		int edadm;
		
		//Atributos clase Persona
		String nombrep;
		String apellido;
		int edadp;
		String ciudad;
		String generop;
		
		ImplementacionMascotas impMascota = new ImplementacionMascotas();
		ImplementacionPersonas impPersonas = new ImplementacionPersonas();
		
		Mascota mascota = new Mascota();
		Persona persona = new Persona();
		
		int menu, menum, menup, submenu, indice;
		
		Scanner entrada;
		
		do {
			System.out.println("----Menu principal----");
			System.out.println("1.- Menu Personas");
			System.out.println("2.- Menu Mascotas");
			System.out.println("3.- Salir");
			entrada = new Scanner(System.in);
			menu = entrada.nextInt();
			switch(menu) {
			case 1:
				break;
			case 2:
				do {
					System.out.println("Menu mascotas");
					System.out.println("1");
					System.out.println("2");
					System.out.println("3");
					System.out.println("4");
					System.out.println("5");
					System.out.println("6");
					System.out.println("7");
					
					entrada = new Scanner(System.in);
					menum = entrada.nextInt();
					switch(menum) {
					case 1:
						System.out.println("Ingrese el numero de registro de la mascota");
						entrada = new Scanner(System.in);
						numeroRegistro = entrada.nextInt();
						
						System.out.println("Ingrese el nombre de la mascota");
						entrada = new Scanner(System.in);
						nombrem = entrada.nextLine();
						
						System.out.println("Ingrese la especie de la mascota");
						entrada = new Scanner(System.in);
						especie = entrada.nextLine();
						
						System.out.println("Ingrese la raza de la mascota");
						entrada = new Scanner(System.in);
						raza = entrada.nextLine();
						
						System.out.println("Ingrese el genero de la mascota");
						entrada = new Scanner(System.in);
						generom = entrada.nextLine();
						
						System.out.println("Ingrese la edad de la mascota");
						entrada = new Scanner(System.in);
						edadm = entrada.nextInt();
						
						mascota = new Mascota(numeroRegistro, nombrem, especie, raza, generom	, edadm);
						impMascota.guardar(mascota);
						
						break;
					case 2:
						System.out.println("Ingresa el numero de registro de la mascota a editar");
						entrada = new Scanner(System.in);
						numeroRegistro = entrada.nextInt();
						mascota = new Mascota(numeroRegistro);
						mascota = impMascota.buscar(mascota);
						if (mascota == null) {
							System.out.println("La mascota no esta registrada");
						}else {
							System.out.println("Mascota");
							do {
								System.out.println("Menu editar");
								System.out.println("1");
								System.out.println("2");
								System.out.println("3");
								System.out.println("4");
								System.out.println("5");
								System.out.println("6");
								entrada = new Scanner(System.in);
								submenu = entrada.nextInt();
								switch(submenu) {
								case 1:
									System.out.println("Ingresa el nuevo nombre");
									entrada = new Scanner(System.in);
									nombrem = entrada.nextLine();
									mascota.setNombre(nombrem);
									break;
								case 2:
									System.out.println("Ingresa la nueva especie");
									entrada = new Scanner(System.in);
									especie = entrada.nextLine();
									mascota.setEspecie(especie);
									break;
								case 3:
									System.out.println("Ingresa la nueva raza");
									entrada = new Scanner(System.in);
									raza = entrada.nextLine();
									mascota.setRaza(raza);
									break;
								case 4:
									System.out.println("Ingresa el nuevo genero");
									entrada = new Scanner(System.in);
									generom = entrada.nextLine();
									mascota.setGenero(generom);
									break;
								case 5:
									System.out.println("Ingresa la edad nueva");
									entrada = new Scanner(System.in);
									edadm = entrada.nextInt();
									mascota.setEdad(edadm);
									break;
								case 6:
									System.out.println("Saliendo.... hecho");
									break;
								default:
									break;
									
								}
								
							}while(submenu != 6);
						}
						
						break;
					case 3:
						System.out.println("Ingrese el numero de registro de la mascota a buscar");
						entrada = new Scanner(System.in);
						numeroRegistro = entrada.nextInt();
						mascota = new Mascota(numeroRegistro);
						mascota = impMascota.buscar(mascota);
						if (mascota == null) {
							System.out.println("La mascota que tratas de  buscar no existe");
						}else {
							System.out.println("La mascota ha sido encontrada" + mascota);
						}
						break;
					case 4:
						System.out.println("Ingrese el numero de registro de la mascota a eliminar");
						entrada = new Scanner(System.in);
						numeroRegistro = entrada.nextInt();
						
						mascota = new Mascota(numeroRegistro, null, null, null, null, 0);
						
						impMascota.eliminar(mascota);
						
						break;
					case 5:
						impMascota.mostrar();
						break;
					case 6:
						impMascota.listar();
						break;
					case 7:
						System.out.println("Saliendo al menu principal");
						break;
					default:
						System.out.println("Operacion invalida intente otra vez");
						break;
						
					}
				}while(menum != 7);
				break;
			case 3:
				System.out.println("Adios perro");
				break;
			default:
				System.out.println("Opcion invalida, intente otravez");
				break;
			
			}
			
		}while(menu != 3);
		
	}
}
