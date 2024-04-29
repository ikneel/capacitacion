package ejercicio3_CRUD_validaciones;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		//Atributos de la clase persona
		String curp;
		String nombrep;
		String apellido;
		int edad;
		String ciudad;
		String genero;
		List<Compra> compras;
		
		//Atributos de la clase compra
		String folio;
		String nombrec;
		String descripcion;
		double precio;
		String paisOrigen;
		String categoria;
		
		List<Persona> listaPersona = new ArrayList<Persona>();
		List<Compra> listaCompra = new ArrayList<Compra>();
		
		Persona persona = new Persona();
		Compra compra = new Compra();
		
		int menu, menup, menuc, submenu, indice, indice2;
		Scanner entrada;
		
		do {
			System.out.println(" ----Menu Principal---- ");
			System.out.println("1.- Menu de Personas");
			System.out.println("2.- Menu de Compras");
			System.out.println("3.- Salir");
			entrada = new Scanner(System.in);
			menu = entrada.nextInt();
			
			switch(menu) {
			
			case 1:
				do {	
					System.out.println("Menu de Personas");
					System.out.println("1.- Alta");
					System.out.println("2.- Editar");
					System.out.println("3.- Buscar");
					System.out.println("4.- Eliminar");
					System.out.println("5.- Mostrar todas las Personas");
					System.out.println("6.- Listar las Persona por Indice");
					System.out.println("7.- Mostrar compras de una persona");
					System.out.println("8.- Regresar al menu principal");
					
					entrada = new Scanner(System.in);
					menup = entrada.nextInt();
					
					switch(menup) {
					case 1:
						System.out.println("Ingresa el CURP: ");
						entrada = new Scanner(System.in);
						curp = entrada.nextLine();
						
						System.out.println("Ingresa el Nombre: ");
						entrada = new Scanner(System.in);
						nombrep = entrada.nextLine();
						
						System.out.println("Ingresa el apellido:");
						entrada = new Scanner(System.in);
						apellido = entrada.nextLine();
						
						System.out.println("Ingresa la edad: ");
						entrada = new Scanner(System.in);
						edad = entrada.nextInt();
						if(edad <= 18) {
							System.out.println("No se pueden registrar personas menores de edad");
							break;
						}
						
						System.out.println("Ingresa la ciudad: ");
						entrada = new Scanner(System.in);
						ciudad = entrada.nextLine();
						
						System.out.println("Ingresa el genero: ");
						entrada = new Scanner(System.in);
						genero = entrada.nextLine();
						
						persona = new Persona(curp, nombrep, apellido, edad, ciudad, genero, new ArrayList<Compra>());
						
						if(listaPersona.isEmpty()) {
							listaPersona.add(persona);
							System.out.println("La persona ha sido registrada");
						}else {
							boolean bandera = false;
							for (Persona p : listaPersona) {
								if(persona.getNombre().equalsIgnoreCase(p.getNombre()) && persona.getApellido().equalsIgnoreCase(p.getApellido())){
									System.out.println("Esta persona no se registro por que ya existe");
									bandera = true;									
									break;		
								}
							}
							if(bandera == false) {
								listaPersona.add(persona);
								System.out.println("La persona ha sido registrada");
							}
						}
						break;
					case 2:
						break;
					case 3:
						System.out.println("Ingresa el nombre de la persona");
						entrada = new Scanner(System.in);
						nombrep = entrada.nextLine();
						System.out.println("Ingresa el apellido de la persona");
						entrada = new Scanner(System.in);
						apellido = entrada.nextLine();
						
						boolean bandera = false;
						indice = 0;
						for (Persona p : listaPersona) {
							if(nombrep.equalsIgnoreCase(p.getNombre()) && apellido.equalsIgnoreCase(p.getApellido())) {
								indice = listaPersona.indexOf(p);
								bandera = true;
								break;
							}
						}
						if(bandera == true) {
							System.out.println("La persona fue encontrada: \n" + listaPersona.get(indice));
						}else {
							System.out.println("La persona no esta registrada");
						}
						
						
						break;
					case 4:
						break;
					case 5:
						break;
					case 6:
						break;
					case 7:
						System.out.println("Ingresa el indice de la persona para mostrar sus compras");
						entrada = new Scanner(System.in);
						indice = entrada.nextInt();
						persona = listaPersona.get(indice);
						System.out.println("Las compras de la persona " + indice + " son: \n" + persona.getCompras());
						break;
					case 8:
						System.out.println("Saliendo al menu principal");
						break;
					default:
						System.out.println("Operacion invalida, intente otra vez");
						break;
					}
				}while(menup != 8);
				break;
				
			case 2:
				do {	
					System.out.println("Menu de Compras");
					System.out.println("1.- Alta");
					System.out.println("2.- Editar");
					System.out.println("3.- Buscar");
					System.out.println("4.- Eliminar");
					System.out.println("5.- Mostrar todas las Compras");
					System.out.println("6.- Listar Compras por Indice");
					System.out.println("7.- Asignar compra a persona");
					System.out.println("8.- Regresar al menu principal");
					
					entrada = new Scanner(System.in);
					menuc = entrada.nextInt();
					
					switch(menuc) {
					case 1:
						System.out.println("Ingresa el Folio: ");
						entrada = new Scanner(System.in);
						folio = entrada.nextLine();
						
						System.out.println("Ingresa el Nombre: ");
						entrada = new Scanner(System.in);
						nombrec = entrada.nextLine();
						
						System.out.println("Ingresa la descricion:");
						entrada = new Scanner(System.in);
						descripcion = entrada.nextLine();
						
						System.out.println("Ingresa el precio: ");
						entrada = new Scanner(System.in);
						precio = entrada.nextInt();
	
						System.out.println("Ingresa el pais de Origen: ");
						entrada = new Scanner(System.in);
						paisOrigen = entrada.nextLine();
						
						System.out.println("Ingresa la categoria: ");
						entrada = new Scanner(System.in);
						categoria = entrada.nextLine();
						
						compra = new Compra(folio, nombrec, descripcion, precio, paisOrigen, categoria);
						
						if(listaCompra.isEmpty()) {
							listaCompra.add(compra);
							System.out.println("La compra ha sido registrada");
						}else {
							boolean bandera = false;
							for (Compra c : listaCompra) {
								if(compra.getFolio().equalsIgnoreCase(c.getFolio())){
									System.out.println("Esta compra no se registro por que ya existe");
									bandera = true;									
									break;		
								}
							}
							if(bandera == false) {
								listaCompra.add(compra);
								System.out.println("La compra ha sido registrada");
							}
						}
						break;
					case 2:
						
						break;
					case 3:
						System.out.println("Ingresa el folio de la compra: ");
						entrada = new Scanner(System.in);
						folio = entrada.nextLine();
						boolean bandera = false;
						for(Compra c : listaCompra) {
							if(folio.equalsIgnoreCase(c.getFolio())) {
								indice = listaCompra.indexOf(c);
								System.out.println("La2 compra fue encontrada: \n" + c);
								bandera = true;
								break;
							}
						}
						if(bandera == false) {}
						System.out.println("La compra con ese folio no existe");
						break;
					case 4:
						break;
					case 5:
						break;
					case 6:
						break;
					case 7:
						System.out.println("ingresa el indice de la compra a asignar:");
						entrada = new Scanner(System.in);
						indice = entrada.nextInt();
						
						System.out.println("ingresa el indice de la persona a la que se asignara:");
						entrada = new Scanner(System.in);
						indice2 = entrada.nextInt();
						
						persona = listaPersona.get(indice2);
						compra = listaCompra.get(indice);
						
						
						persona.getCompras().add(compra);
								
						
						System.out.println(listaPersona);
						System.out.println(listaCompra);
						break;
					case 8:
						System.out.println("Saliendo al menu principal");
						break;
					default:
						System.out.println("Operacion invalida, intente otra vez");
						break;
					}
				}while(menuc != 8);
				break;
				
			case 3:
				System.out.println("Saliendo... hecho");
				break;
			
			}
			
		}while(menu != 3);
	}
}
