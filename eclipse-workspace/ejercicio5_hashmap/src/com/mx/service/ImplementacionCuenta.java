package com.mx.service;

import java.util.HashMap;

import com.mx.entidad.Cuenta;
import com.mx.metodos.MetodosCuenta;

public class ImplementacionCuenta implements MetodosCuenta {
	
	HashMap<Integer, Cuenta> hashcuentas = new HashMap<Integer, Cuenta>();

	@Override
	public void guardar(Cuenta cuenta) {
		
		if (hashcuentas.isEmpty()) {
			hashcuentas.put(cuenta.getNumero(), cuenta);
			System.out.println("La cuenta fue registrada");
		}else {
			if(hashcuentas.containsKey(cuenta.getNumero())) {
				System.out.println("El numero de cuenta ya existe");
			}else {
				hashcuentas.put(cuenta.getNumero(), cuenta);
				System.out.println("La cuenta ha sido registrada");
			}			
		}
		
	}

	@Override
	public void editar(Cuenta cuenta) {
		hashcuentas.put(cuenta.getNumero(), cuenta);
	}

	@Override
	public void eliminar(Cuenta cuenta) {
		if(hashcuentas.containsKey(cuenta.getNumero())) {
			cuenta = hashcuentas.get(cuenta.getNumero());
			hashcuentas.remove(cuenta.getNumero());
			System.out.println("La cuenta " + cuenta +" ha sido eliminada ");
			
		}else {
			System.out.println("La cuenta que deseas eliminar no existe");
		}
	}

	@Override
	public Cuenta buscar(Cuenta Cuenta) {
		if(hashcuentas.containsKey(Cuenta.getNumero())) {
				
		}
		return null;
	}

	@Override
	public void mostrar() {

	}

}
