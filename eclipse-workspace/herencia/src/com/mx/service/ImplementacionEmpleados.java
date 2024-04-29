package com.mx.service;
import java.util.ArrayList;
import java.util.List;

import com.mx.entidad.Empleado;
import com.mx.entidad.Jefe;
import com.mx.metodos.MetodosEmpleado;

public class ImplementacionEmpleados implements MetodosEmpleado{

	List<Empleado> listaEmpleado = new ArrayList<Empleado>();
	
	@Override
	public void guardar(Empleado empleado) {
		if(listaEmpleado.isEmpty()) {
			listaEmpleado.add(empleado);
			System.out.println("El empleado ha sido registrado");
		}else {
			int bandera = 0;
			for(Empleado e : listaEmpleado) {
				if(empleado.getNombre().equalsIgnoreCase(e.getNombre()) &&
						empleado.getApellido().equalsIgnoreCase(e.getApellido())) {
					System.out.println("El empleado no se registro por que ya existe");
					bandera = 1;
					break;
				}
			}
			if (bandera != 1) {
				listaEmpleado.add(empleado);
				System.out.println("El empleado ha sido registrado");
			}
		}
	}

	@Override
	public void editar(Empleado empleado, int indice) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(int indice) {
		if (listaEmpleado.size() >= indice) {
			Empleado empleado = listaEmpleado.get(indice);
			listaEmpleado.remove(indice);
			System.out.println("El empleado ha sido eliminado\n" + empleado);
		}else {
			System.out.println("El empleado que deses eliminar no existe");
		}
	}

	@Override
	public Empleado buscar(int indice) {
		if(indice < listaEmpleado.size()) {
			Empleado empleado = listaEmpleado.get(indice);
			return empleado;
		}else {
			return null;
		}
	}

	@Override
	public void mostrar() {
		if(listaEmpleado.isEmpty()) {
			System.out.println("No hay empleado registrados que mostrar");
		}else {
			System.out.println("Se han encontrado los siguietnes empleados\n" + listaEmpleado);
		}
	}
	
	public void editar() {
		if(listaEmpleado.isEmpty()) {
			System.out.println("No hay empleado que listar");
		}else {
			for (Empleado e : listaEmpleado) {
				System.out.println("[" + listaEmpleado.indexOf(e) + "]" + " " + e.getNombre() + " " + e.getApellido());
			}
		}
	}

}
