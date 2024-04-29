package com.mx.service;

import java.util.HashMap;

import com.mx.entidad.Mascota;
import com.mx.metodos.MetodosMascota;

public class ImplementacionMascotas implements MetodosMascota {
	
	HashMap<Integer, Mascota> hashMascotas = new HashMap<Integer, Mascota>();
	@Override
	public void guardar(Mascota mascota) {
		if(hashMascotas.isEmpty()) {
			hashMascotas.put(mascota.getNumeroRegistro(), mascota);
			System.out.println("La mascota ha sido registrada");
		}else {
			if(hashMascotas.containsKey(mascota.getNumeroRegistro())) {
				System.out.println("Este numero de registro ya existe, intente con otro");
			}else {
				boolean bandera = false; 
				Mascota mascota_aux;
				for(int key : hashMascotas.keySet()) {
					mascota_aux = hashMascotas.get(key);
					if(mascota.getNombre().equalsIgnoreCase(mascota_aux.getNombre()) &&
					   mascota.getEspecie().equalsIgnoreCase(mascota_aux.getEspecie())) {
						if(mascota.getRaza().equalsIgnoreCase(mascota_aux.getRaza())) {
							System.out.println("Esta mascota no se puede registrar por que ya existe");
							bandera = true;
							break;
						}				
					}
				}
				if (bandera == false) {
					hashMascotas.put(mascota.getNumeroRegistro(), mascota);
					System.out.println("La mascota ha sido registrada");
				}
			}
		}
		
	}

	@Override
	public void editar(Mascota mascota) {
		hashMascotas.put(mascota.getNumeroRegistro(), mascota);
		
		
	}

	@Override
	public void eliminar(Mascota mascota) {
		if(hashMascotas.containsKey(mascota.getNumeroRegistro())){
			mascota = hashMascotas.get(mascota.getNumeroRegistro());
			hashMascotas.remove(mascota.getNumeroRegistro());
			System.out.println("La mascota ha sido eliminada\n" + mascota );
		}
		else {
			System.out.println("La mascota que tratas de eliminar no existe");
		}
		
	}

	@Override
	public Mascota buscar(Mascota mascota) {
		if (hashMascotas.containsKey(mascota.getNumeroRegistro())){
			mascota = hashMascotas.get(mascota.getNumeroRegistro());
			return mascota;
		}
		return null;
	}

	@Override
	public void mostrar() {
		if(hashMascotas.isEmpty()) {
			System.out.println("No hay mascotas que mostrar");
		}else {
			System.out.println("Se han encontrado las siguienes mascotas: \n" + hashMascotas);
		}
	}
	
	public void listar() {
		if(hashMascotas.isEmpty()) {
			System.out.println("No hay mascotas que mostrar");
		}else {
			Mascota mascota;
			for (int key : hashMascotas.keySet()) {
				mascota = hashMascotas.get(key);
				System.out.println("[" + key + "]" + mascota.getNombre() + " " + mascota.getEspecie());
			}
		}
	}
}
