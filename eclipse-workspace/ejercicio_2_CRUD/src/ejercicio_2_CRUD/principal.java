package ejercicio_2_CRUD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class principal {
	
	public static void main(String[] args) {
		//Atributos de la clase alumno
		String matricula;
		String nombre;
		String apellido;
		String genero;
		String colonia;
		int edad;
		double promedio;

		List<Alumno> lista = new ArrayList<Alumno>();
		Alumno alumno = new Alumno();
		int indice, menu, menue;
		Scanner entrada;
	
		do {
			
			System.out.println("\n Menu de Opciones:");
			System.out.println("1.- Registrar Alumno");
			System.out.println("2.- Editar Registro");
			System.out.println("3.- Buscar Alumno");
			System.out.println("4.- Eliminar Registro");
			System.out.println("5.- Mostrar todos los Alumnos");
			System.out.println("6.- Listar todos los Alumnos");
			System.out.println("7.- Salir");
			entrada = new Scanner(System.in);
			menu = entrada.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println("Ingresa la matricula: ");
				entrada = new Scanner (System.in);
				matricula = entrada.nextLine();
				
				System.out.println("Ingresa el nombre: ");
				entrada = new Scanner (System.in);
				nombre = entrada.nextLine();
				
				System.out.println("Ingresa el apellido: ");
				entrada = new Scanner (System.in);
				apellido = entrada.nextLine();
				
				System.out.println("Ingresa el genero: ");
				entrada = new Scanner (System.in);
				genero = entrada.nextLine();
				
				System.out.println("Ingresa la colonia: ");
				entrada = new Scanner (System.in);
				colonia = entrada.nextLine();				
				
				System.out.println("Ingresa la edad: ");
				entrada = new Scanner (System.in);
				edad = entrada.nextInt();
			
				System.out.println("Ingresa el promedio: ");
				entrada = new Scanner (System.in);
				promedio = entrada.nextDouble();		
				
				alumno = new Alumno(matricula, nombre, apellido, genero, colonia , edad, promedio);
				lista.add(alumno); 
				
				break;
			case 2:
				
				System.out.println("Ingresa el indice del alumno que quieres editar");
				entrada = new Scanner(System.in);
				indice = entrada.nextInt();
				alumno = lista.get(indice);
				System.out.println("---Menu de edicion de registro---");
				System.out.println("Selecciona que deseas editar :");
				System.out.println("1.- Matricula");
				System.out.println("2.- Nombre");
				System.out.println("3.- Apellido");
				System.out.println("4.- Genero");
				System.out.println("5.- Colonia");
				System.out.println("6.- Edad");
				System.out.println("7.- Promedio");
				System.out.println("8.- Cancelar");
				
				menue = entrada.nextInt();
				
				switch(menue) {
				
				case 1:
					System.out.println("Ingresa la nueva matricula: ");
					entrada = new Scanner (System.in);
					matricula = entrada.nextLine();
					alumno.setMatricula(matricula);
					break;
					
				case 2:
					System.out.println("Ingresa el nuevo nombre: ");
					entrada = new Scanner (System.in);
					nombre = entrada.nextLine();
					alumno.setNombre(nombre);
					break;

				case 3:
					System.out.println("Ingresa el nuevo apellido: ");
					entrada = new Scanner (System.in);
					apellido = entrada.nextLine();
					alumno.setApellido(apellido);
					break;
					
				case 4:
					System.out.println("Ingresa el nuevo genero: ");
					entrada = new Scanner (System.in);
					genero = entrada.nextLine();
					alumno.setGenero(genero);
					break;
					
				case 5:
					System.out.println("Ingresa la nueva Colonia: ");
					entrada = new Scanner (System.in);
					colonia = entrada.nextLine();
					alumno.setMatricula(colonia);
					break;
					
				case 6:
					System.out.println("Ingresa la nueva edad: ");
					entrada = new Scanner (System.in);
					edad = entrada.nextInt();
					alumno.setEdad(edad);
					break;
					
				case 7:
					System.out.println("Ingresa el nuevo promedio: ");
					entrada = new Scanner (System.in);
					promedio = entrada.nextDouble();
					alumno.setPromedio(promedio);
					break;
					
				case 8:
					System.out.println("Cancelado");
					break;
					
				default: 
					System.out.println("Opcion Invalida, intenta de nuevo");
				}				
				break;
			case 3:
				System.out.println("Ingresa el indice del alumno a buscar: ");
				entrada = new Scanner(System.in);
				indice = entrada.nextInt();
				alumno = lista.get(indice);
				System.out.println("El auto fue encontrado \n" + alumno);
				break;
			case 4:
				System.out.println("Ingresa el indice del auto que desa eliminar: ");
				entrada = new Scanner(System.in);
				indice = entrada.nextInt();
				alumno = lista.get(indice);
				lista.remove(indice);
				System.out.println("El auto a sido eliminado \n"  + alumno);				
				break;
			case 5:
				System.out.println("Mostrando todos los autos: \n" + lista);
				break;
			case 6:
				for(int i = 0; i < lista.size(); i++) {
					System.out.printf("\n[%d] =>" + lista.get(i).getNombre() + " " + lista.get(i).getApellido(), i);
				}
				break;
			case 7:
				System.out.println("Saliendo.... Hecho");
				break;
				
			default: 
				System.out.println("Opcion Invalida, intenta de nuevo");
			}
		}
		while (menu != 7);		

	}
}
