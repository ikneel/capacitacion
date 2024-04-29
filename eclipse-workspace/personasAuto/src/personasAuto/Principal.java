package personasAuto;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class Principal {
	
	public static void main(String[] args) {
		
		//Atributos de la clase auto
		String matricula;
		String modelo;
		String marca;
		String color;
		double precio;
		
		//Atributos de la clase persona
		String nombre;
		String apellido;
		int edad;
		String ciudad;
		String genero;
		
		List<Persona> listaPersona = new ArrayList<Persona>();
		List<Auto> listaAuto = new ArrayList<Auto>();
		
		Persona persona = new Persona();
		Auto auto = new Auto();
		
		int menu, menua, menup, submenu, indice;
		Scanner entrada;
		
		do {
			System.out.println("\n Menu pricipal");
			System.out.println("1.- Menu de Autos");
			System.out.println("2.- Menu de Personas");
			System.out.println("3.- Salir");
			entrada = new Scanner (System.in);
			menu = entrada.nextInt();
			switch (menu) {
			
			case 1:
				do {
					System.out.println("\n Menu Autos");
					System.out.println("1.- Alta");
					System.out.println("2.- Editar");
					System.out.println("3.- Buscar");
					System.out.println("4.- Eliminar");
					System.out.println("5.- Mostrar todos los Autos");
					System.out.println("6.- Listar Autos por Indice");
					System.out.println("7.- Regresar al menu principal");
					entrada = new Scanner (System.in);
					menua = entrada.nextInt();
					switch (menua) {
					case 1:
						System.out.println("Ingresa la matricula: ");
						entrada = new Scanner(System.in);
						matricula = entrada.nextLine();
						
						System.out.println("Ingresa el modelo: ");
						entrada = new Scanner(System.in);
						modelo = entrada.nextLine();
						
						System.out.println("Ingresa la marca:");
						entrada = new Scanner(System.in);
						marca = entrada.nextLine();
						
						System.out.println("Ingresa el color: ");
						entrada = new Scanner(System.in);
						color = entrada.nextLine();
						
						System.out.println("Ingresa el precio: ");
						entrada = new Scanner(System.in);
						precio = entrada.nextDouble();
						
						auto = new Auto(matricula, marca, modelo, color, precio);
						
						if(listaAuto.isEmpty()) {
							listaAuto.add(auto);
							System.out.println("El auto ha sido registrado");
						}else {
							int bandera = 0;
							for (Auto a : listaAuto) {
								if(auto.getMatricula().equalsIgnoreCase(a.getMatricula())) {
									System.out.println("Este auto no se registro por que ya existe");
									bandera = 1;									
									break;		
								}
							}
							if(bandera == 0) {
								listaAuto.add(auto);
								System.out.println("El auto ha sido registrado");
							}
						}
						
						break;
						
					case 2:
						System.out.println("Ingrese el indice del auto a editar: ");
						entrada = new Scanner(System.in);
						indice = entrada.nextInt();
						if(indice < listaAuto.size()) {
							auto = listaAuto.get(indice);
							System.out.println("auto");
							do {
								System.out.println("\nMenu editar");
								System.out.println("1.- Modelo");
								System.out.println("2.- Marca");
								System.out.println("3.- Color");
								System.out.println("4.- Precio");
								System.out.println("5.- Salir del menu editar");
								
								entrada = new Scanner(System.in);
								submenu = entrada.nextInt();
								switch(submenu) {
								
								case 1:
									System.out.println("Ingresa el modelo nuevo: ");
									entrada = new Scanner(System.in);
									modelo = entrada.nextLine();
									auto.setModelo(modelo);
									break;
									
								case 2:
									System.out.println("Ingresa la marca nueva: ");
									entrada = new Scanner(System.in);
									marca = entrada.nextLine();
									auto.setMarca(marca);
									break;
								case 3:
									System.out.println("Ingresa el color nuevo: ");
									entrada = new Scanner(System.in);
									color = entrada.nextLine();
									auto.setColor(color);
									break;
								case 4:
									System.out.println("Ingresa el precio nuevo: ");
									entrada = new Scanner(System.in);
									precio = entrada.nextDouble();
									auto.setPrecio(precio);
									break;
								case 5:
									System.out.println("Regresando al menu principal ");
									break;
		
								}
							}while(submenu != 5);
						}else {
							System.out.println("El auto que tratas  de editar no existe");
						}
						break;
						
					case 3:
						System.out.println("Ingresa el indice del auto a buscar:");
						entrada = new Scanner (System.in);
						indice = entrada.nextInt();
						if(indice < listaAuto.size()) {
							auto = listaAuto.get(indice);
							System.out.println("El auto ha sido encontrado \n" + auto);
						}else {
							System.out.println("El auto que traatas de buscar no esta registrado");
						}
						break;
						
					case 4:
						System.out.println("Ingresa el indice del auto que quieres eliminar");
						entrada = new Scanner(System.in);
						indice = entrada.nextInt();
						if(indice >= listaAuto.size()) {
							System.out.println("El auto que tratas de eliminar no existe");
						}else {
							auto = listaAuto.get(indice);
							listaAuto.remove(indice);
							System.out.println("El auto ha sido eliminado");
						}
						break;
						
					case 5:
						if(listaAuto.size() == 0) {
							System.out.println("No existen autos registrados");
						}else {
							System.out.println("Se han encontrado los siguientes autos: /n" + listaAuto);
						}
						break;
						
					case 6:
						if(listaAuto.isEmpty()) {
							System.out.println("No exiten autos que listar");
						}else {
							for(Auto a : listaAuto) {
								System.out.println("[" + listaAuto.indexOf(a) + "] =>" + a.getMatricula()
								+ " " + a.getModelo() + " " + a.getMarca());
							}
						}
						
						break;
						
					case 7:
						System.out.println("Saliendo al menu principal");
						break;
						
					default:
						System.out.println("Opcion invalida, intente otravez");
						break;	
						
					}
				} while(menua != 7);
				break;
				
			case 2:
				do {
					System.out.println("\n Menu Personas");
					System.out.println("1.- Alta");
					System.out.println("2.- Editar");
					System.out.println("3.- Buscar");
					System.out.println("4.- Eliminar");
					System.out.println("5.- Mostrar todas las Personas");
					System.out.println("6.- Listar Persona por Indice");
					System.out.println("7.- Regresar al menu principal");
					entrada = new Scanner (System.in);
					menup = entrada.nextInt();
					switch (menup) {
					case 1:
						System.out.println("Ingresa el Nombre: ");
						entrada = new Scanner(System.in);
						nombre = entrada.nextLine();
						
						System.out.println("Ingresa el Apellido: ");
						entrada = new Scanner(System.in);
						apellido = entrada.nextLine();
						
						System.out.println("Ingresa la edad:");
						entrada = new Scanner(System.in);
						edad = entrada.nextInt();
						
						System.out.println("Ingresa el genero: ");
						entrada = new Scanner(System.in);
						genero = entrada.nextLine();
						
						System.out.println("Ingresa la ciudad: ");
						entrada = new Scanner(System.in);
						ciudad = entrada.nextLine();
						
						persona = new Persona(nombre, apellido, edad, genero, ciudad, new ArrayList<Auto>());
						
						if(listaPersona.isEmpty()) {
							listaPersona.add(persona);
							System.out.println("LA persona ha sido registrada");
						}else {
							boolean bandera = false;
							for (Persona p : listaPersona) {
								if(persona.getNombre().equalsIgnoreCase(p.getNombre())) {
									System.out.println("Esta persona no se registro por que ya existe");
									bandera = true;									
									break;		
								}
							}
							if(bandera == false) {
								listaPersona.add(persona);
								System.out.println("La persona ha sido registrado");
							}
						}						
						break;
						
					case 2:
						System.out.println("Ingrese el indice de la persona a editar: ");
						entrada = new Scanner(System.in);
						indice = entrada.nextInt();
						if(indice < listaPersona.size()) {
							persona = listaPersona.get(indice);
							System.out.println(persona);
							do {
								System.out.println("\nMenu editar");
								System.out.println("1.- Nombre");
								System.out.println("2.- Apellido");
								System.out.println("3.- Edad");
								System.out.println("4.- Genero");
								System.out.println("5.- Ciudad");
								System.out.println("6.- Salir del menu de edicion");
								
								entrada = new Scanner(System.in);
								submenu = entrada.nextInt();
								switch(submenu) {
								
								case 1:
									System.out.println("Ingresa el nuevo nombre: ");
									entrada = new Scanner(System.in);
									nombre = entrada.nextLine();
									persona.setNombre(nombre);
									break;
									
								case 2:
									System.out.println("Ingresa el nuevo apellido: ");
									entrada = new Scanner(System.in);
									apellido = entrada.nextLine();
									persona.setApellido(apellido);
									break;
								case 3:
									System.out.println("Ingresa la nueva edad: ");
									entrada = new Scanner(System.in);
									edad = entrada.nextInt();
									persona.setEdad(edad);
									break;
									
								case 4:
									System.out.println("Ingresa el genero nuevo: ");
									entrada = new Scanner(System.in);
									genero = entrada.nextLine();
									persona.setGenero(genero);
									break;
									
								case 5:
									System.out.println("Ingresa la ciudad nueva: ");
									entrada = new Scanner(System.in);
									ciudad = entrada.nextLine();
									persona.setCiudad(ciudad);
									break;
									
								case 6:
									System.out.println("Regresando al menu principal");
								
								default:
									System.out.println("Operacion invalida intente de nuevo");
								
								}
								listaPersona.set(indice, persona);
							}while(submenu != 6);
						}else {
							System.out.println("La persona que tratas  de editar no existe");
						}
						break;
						
					case 3:
						System.out.println("Ingresa el indice de la persona que quieres buscar:");
						entrada = new Scanner (System.in);
						indice = entrada.nextInt();
						if(indice < listaPersona.size()) {
							persona = listaPersona.get(indice);
							System.out.println("La persona ha sido encontrado \n" + persona);
						}else {
							System.out.println("El auto que traatas de buscar no esta registrado");
						}
						break;
						
					case 4:
						System.out.println("Ingresa el indice de la persona que quieres eliminar");
						entrada = new Scanner(System.in);
						indice = entrada.nextInt();
						if(indice < listaPersona.size()) {
							persona = listaPersona.get(indice);
							listaPersona.remove(indice);
							System.out.println("La siguiente persona fue eliminada \n" + persona);
						}else {
							System.out.println("La persona que tratas de eliminar no esta registrada");
						}
						break;
						
					case 5:
						if(listaPersona.isEmpty()) {
							System.out.println("No hay personas registrados");
						}else {
							System.out.println("Se han encontrado las siguientes personas: /n" + listaPersona);
						}
						break;
						
					case 6:
						if(listaPersona.isEmpty()) {
							System.out.println("No exiten personas que listar");
						}else {
							for(Persona p : listaPersona) {
								System.out.println("[" + listaPersona.indexOf(p) + "] =>" + p.getNombre()
								+ " " + p.getApellido());
							}
						}	
						break;
						
					case 7:
						System.out.println("Regresando al menu principal");
						break;
						
					default:
						System.out.println("Opcion invalida, intente otravez");
						break;	
						
					}
				} while(menup != 7);
				break;
			case 3:
				System.out.println("Saliendo....hecho");
				break;		
				
			default:
				System.out.println("Opcion invalida, intente de nuevo");
				break;
				
			}
			
		} while (menu != 3);
	}
	
}
