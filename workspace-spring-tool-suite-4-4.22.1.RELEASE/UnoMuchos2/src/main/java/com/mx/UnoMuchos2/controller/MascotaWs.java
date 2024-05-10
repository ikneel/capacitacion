package com.mx.UnoMuchos2.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.UnoMuchos2.entidad.Mascotas;
import com.mx.UnoMuchos2.respuesta.Respuesta;
import com.mx.UnoMuchos2.service.MascotasService;


@RestController
@RequestMapping("mascotas")
@CrossOrigin
public class MascotaWs {
	@Autowired
	MascotasService service;
	
	@GetMapping("listar")
	public Respuesta mostrar() {
		return service.mostrar();
	}
	
	@PostMapping("guardar")
	public Respuesta guardar(@RequestBody Mascotas mascota) {
		return service.guardar(mascota);
	}
	
	@PostMapping("editar")
	public Respuesta editar(@RequestBody Mascotas mascota) {
		return service.editar(mascota);
	}
	
	@PostMapping("eliminar")
	public Respuesta eliminar(@RequestBody Mascotas mascota) {
		return service.eliminar(mascota);
	}
	
	@PostMapping("buscar")
	public Respuesta buscar(@RequestBody Mascotas mascota) {
		return service.buscar(mascota);
	}
	
	@PostMapping("mascotasPersonas")
	public Respuesta mascotasPersonas(@RequestBody Map<String, String> requestBody) {
		String curpPersona = requestBody.get("curpPersona");
		return service.mascotasPersona(curpPersona);
	}
	
	@PostMapping("mascotasCiudad")
	public Respuesta mascotasCiudad(@RequestBody Map<String, String> requestBody) {
		String ciudad = requestBody.get("ciudad");
		return service.mascotasCiudad(ciudad);
	}
	
	@GetMapping("mascotaGordita")
	public Respuesta mascotaGordita() {
		return service.mascotaGordita();
	}
	
	@GetMapping("mascotaSinDueño")
	public Respuesta mascotaSinDueño() {
		return service.mascotaSinDueño();
	}
}
