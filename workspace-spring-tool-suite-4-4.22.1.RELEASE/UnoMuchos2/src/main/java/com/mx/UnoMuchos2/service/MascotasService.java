package com.mx.UnoMuchos2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.UnoMuchos2.dao.MascotaDao;
import com.mx.UnoMuchos2.entidad.Mascotas;
import com.mx.UnoMuchos2.respuesta.Respuesta;
@Service
public class MascotasService implements MetodosMascota {
	@Autowired
	MascotaDao dao;
	@Override
	public Respuesta guardar(Mascotas mascota) {
		Respuesta rs = new Respuesta();
		if (dao.findAll().isEmpty()) {
			dao.save(mascota);
			rs.setMensaje("La mascota ha sido registrada");
			rs.setSucces(true);
			rs.setObj(mascota);
			return rs;
		}else {
			if(dao.existsById(mascota.getNumeroRegistro())) {
				rs.setMensaje("Este numero de registro ya esta asociado a otra mascota");
				rs.setSucces(false);
				rs.setObj(dao.findById(mascota.getNumeroRegistro()));
				return rs;
			}
			dao.save(mascota);
			rs.setMensaje("La mascota ha sido registrada");
			rs.setSucces(true);
			rs.setObj(mascota);
			return rs;
		}
	}

	@Override
	public Respuesta editar(Mascotas mascota) {
		Respuesta rs = new Respuesta();
		if(dao.existsById(mascota.getNumeroRegistro())) {
			dao.save(mascota);
			rs.setMensaje("La mascota ha sido registrada");
			rs.setSucces(true);
			rs.setObj(mascota);
			return rs;
		}else {
			rs.setMensaje("La mascota que tratas de editar no esta registrada");
			rs.setSucces(false);
			rs.setObj(mascota.getNumeroRegistro());
			return rs;
		}
	}

	@Override
	public Respuesta eliminar(Mascotas mascota) {
		Respuesta rs = new Respuesta();
		if(dao.existsById(mascota.getNumeroRegistro())) {
			rs.setObj(dao.findById(mascota.getNumeroRegistro()));
			dao.delete(mascota);
			rs.setMensaje("La mascota ha sido eliminada");
			rs.setSucces(true);
			return rs;
		}
		rs.setMensaje("La mascota que tratas de eliminar no existe");
		rs.setObj(mascota.getNumeroRegistro());
		rs.setSucces(false);
		return rs;
	}

	@Override
	public Respuesta buscar(Mascotas mascota) {
		Respuesta rs = new Respuesta();
		mascota = dao.findById(mascota.getNumeroRegistro()).orElse(null);
		if(mascota == null) {
			rs.setMensaje("La mascota que tratas de buscar no existes");
			rs.setSucces(false);
			rs.setObj(null);
			return rs;
		}else {
			rs.setMensaje("La mascota ha sido encontrada");
			rs.setSucces(true);
			rs.setObj(mascota);
			return rs;
		}
	}

	@Override
	public Respuesta mostrar() {
		Respuesta rs = new Respuesta();
		if(dao.findAll().isEmpty()) {
			rs.setMensaje("No hay mascotas registradas");
			rs.setSucces(false);
			rs.setObj(null);
			return rs;
		}else {
			rs.setMensaje("Se encontraron las siguientes mascotas");
			rs.setSucces(true);
			rs.setObj(dao.findAll());
			return rs;
		}
	}

	@Override
	public Respuesta mascotasPersona(String curpPersona) {
		Respuesta rs = new Respuesta();
		List<Mascotas> lista_aux = new ArrayList<>();
		
		for(Mascotas m : dao.findAll()) {
			if(m.getPersona() == null) {
				continue;
			}else {
				if(m.getPersona().getCurp().equalsIgnoreCase(curpPersona)) {
					lista_aux.add(m);
				}
			}
		}
		rs.setMensaje("Las mascotas de la persona con curp: " + curpPersona);
		rs.setSucces(true);
		rs.setObj(lista_aux);
		return rs;
	}

	@Override
	public Respuesta mascotasCiudad(String ciudad) {
		Respuesta rs = new Respuesta();
		List<Mascotas> lista_aux = new ArrayList<>();
		
		for(Mascotas m : dao.findAll()) {
			if(m.getPersona() == null) {
				continue;
			}else {
				if(m.getPersona().getCiudad().equalsIgnoreCase(ciudad)) {
					lista_aux.add(m);
				}
			}
		}
		rs.setMensaje("Las mascotas de la ciudad: " + ciudad);
		rs.setSucces(true);
		rs.setObj(lista_aux);
		return rs;
	}

	@Override
	public Respuesta mascotaGordita() {
		Respuesta rs = new Respuesta();
		Integer pesoPromedio = 0;
		Integer pesoTotal = 0;
		List<Mascotas> lista_aux = new ArrayList<>();
		
		for(Mascotas m : dao.findAll()) {
			pesoTotal += m.getPesoMascota();
		}
		
		pesoPromedio = pesoTotal / dao.findAll().size();
		
		for(Mascotas m :dao.findAll()) {
			if(m.getPesoMascota() > pesoPromedio) {
				lista_aux.add(m);
			}
		}
		
		rs.setMensaje("Las mascotas gorditas son las siguientes:");
		rs.setSucces(true);
		rs.setObj(lista_aux);
		return rs;
		
	}

	@Override
	public Respuesta mascotaSinDueño() {
		Respuesta rs = new Respuesta();
		List<Mascotas> lista_aux = new ArrayList<>();
		
		for(Mascotas m :  dao.findAll()) {
			if(m.getPersona() == null) {
				lista_aux.add(m);
			}
		}
		
		rs.setMensaje("Las mascotas sin dueño son:_");
		rs.setSucces(true);
		rs.setObj(lista_aux);
		return rs;
	}
}
