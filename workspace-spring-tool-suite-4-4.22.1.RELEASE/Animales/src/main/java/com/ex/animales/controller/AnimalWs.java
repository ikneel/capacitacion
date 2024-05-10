package com.ex.animales.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ex.animales.entidad.Animal;
import com.ex.animales.service.AnimalService;

@RestController
@RequestMapping("animales")
@CrossOrigin
public class AnimalWs {
	@Autowired
	AnimalService service;
	
	@GetMapping("listar")
	public List<Animal> mostrar(){
		List<Animal> lista = service.mostrar();
		return lista;
	}
	
	@PostMapping("guardar")
	public void guardar(@RequestBody Animal animal) {
		service.guardar(animal);
	}

	@PostMapping("editar")
	public void editar(@RequestBody Animal animal) {
		service.editar(animal);
	}
	

	@PostMapping("eliminar")
	public void eliminar(@RequestBody Animal animal) {
		service.eliminar(animal);
	}
	@PostMapping("buscar")
	public Animal buscar(@RequestBody Animal animal) {
		animal = service.buscar(animal);
		return animal;
	}
}
