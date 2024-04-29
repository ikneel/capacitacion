package fristCrud;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class principal {
	public static void main(String[] args) {
		//Atributos de la clase auto
		String matricula;
		String modelo;
		String marca;
		String color;
		double precio;
		
		List<Auto> lista = new ArrayList<Auto>();
		Auto auto = new Auto();
		int indice, menu;
		Scanner entrada;
		
		do {
			
			System.out.println("\n Menu de Autos:");
			System.out.println("1.- Alata");
			System.out.println("2.- Editar");
			System.out.println("3.- Buscar");
			System.out.println("4.- Eliminar");
			System.out.println("5.- Mostrar todos los Autos");
			System.out.println("6.- Listar todos los Autos");
			System.out.println("7.- Salir");
			entrada = new Scanner(System.in);
			menu = entrada.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println("Ingresa la matricula: ");
				entrada = new Scanner (System.in);
				matricula = entrada.nextLine();
				
				System.out.println("Ingresa el modelo: ");
				entrada = new Scanner (System.in);
				modelo = entrada.nextLine();
				
				System.out.println("Ingresa la marca: ");
				entrada = new Scanner (System.in);
				marca = entrada.nextLine();
				
				System.out.println("Ingresa el color: ");
				entrada = new Scanner (System.in);
				color = entrada.nextLine();
				
				System.out.println("Ingresa el precio: ");
				entrada = new Scanner (System.in);
				precio = entrada.nextDouble();
				
				auto = new Auto(matricula, modelo, marca, color, precio);
				lista.add(auto); 
				
				break;
			case 2:
				System.out.println("Ingresa el indice del auto a editar");
				entrada = new Scanner(System.in);
				indice = entrada.nextInt();
				auto = lista.get(indice);
				
				System.out.println("Ingresa la matricula: ");
				entrada = new Scanner (System.in);
				matricula = entrada.nextLine();
				auto.setMatricula(matricula);
				
				System.out.println("Ingresa el modelo: ");
				entrada = new Scanner (System.in);
				modelo = entrada.nextLine();
				auto.setModelo(modelo);
				
				System.out.println("Ingresa la marca: ");
				entrada = new Scanner (System.in);
				marca = entrada.nextLine();
				auto.setMarca(marca);
				
				System.out.println("Ingresa el color: ");
				entrada = new Scanner (System.in);
				color = entrada.nextLine();
				auto.setColor(color);
				
				System.out.println("Ingresa el precio: ");
				entrada = new Scanner (System.in);
				precio = entrada.nextDouble();
				auto.setPrecio(precio);
				
				lista.set(indice, auto);
								
				break;
			case 3:
				System.out.println("Ingresa el indice del auto a buscar: ");
				entrada = new Scanner(System.in);
				indice = entrada.nextInt();
				auto = lista.get(indice);
				System.out.println("El auto fue encontrado \n" + auto);
				break;
			case 4:
				System.out.println("Ingresa el indice del auto que desa eliminar: ");
				entrada = new Scanner(System.in);
				indice = entrada.nextInt();
				auto = lista.get(indice);
				lista.remove(indice);
				System.out.println("El auto a sido eliminado \n"  + auto);				
				break;
			case 5:
				System.out.println("Mostrando todos los autos: \n" + lista);
				break;
			case 6:
				for(int i = 0; i < lista.size(); i++) {
					System.out.printf("\n[%d] =>3" + lista.get(i).getModelo() + " " + lista.get(i).getMarca(), i);
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