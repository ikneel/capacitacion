package com.mx.UnoMuchos2.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.UnoMuchos2.entidad.Persona;
import com.mx.UnoMuchos2.respuesta.Respuesta;
import com.mx.UnoMuchos2.service.PersonaService;

@RestController
@RequestMapping("personas")
@CrossOrigin
public class PersonaWs {
	@Autowired
	PersonaService service;
	
	@GetMapping("listar")
	public Respuesta mostrar() {
		return service.mostrar();
	}
	
	@PostMapping("guardar")
	public Respuesta guardar(@RequestBody Persona persona) {
		return service.guardar(persona);
	}
	
	@PostMapping("editar")
	public Respuesta editar(@RequestBody Persona persona) {
		return service.editar(persona);
	}
	
	@PostMapping("eliminar")
	public Respuesta eliminar(@RequestBody Persona persona) {
		return service.eliminar(persona);
	}
	
	@PostMapping("buscar")
	public Respuesta buscar(@RequestBody Persona persona) {
		return service.buscar(persona);
	}
	
	@PostMapping("mostrarGenero")
	public Respuesta mostrarGenero(@RequestBody Map<String, String> requestBody) {
		String genero = requestBody.get("genero");
		return service.mostrarGenero(genero);
	}
	
	@GetMapping("mostrarViejitos")
	public Respuesta mostrarViejitos() {
		return service.mostrarViejitos();
	}
	
	@GetMapping("personasSinMascota")
	public Respuesta personasSinMascota() {
		return service.personaSinMascota();
	}
}