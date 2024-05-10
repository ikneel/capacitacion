package com.ex.animales.service;

import java.util.List;

import com.ex.animales.entidad.Animal;

public interface MetodosAnimal {
	public void guardar(Animal animal);
	
	public void editar(Animal animal);
	
	public void eliminar(Animal animal);
	
	public Animal buscar(Animal animal);
	
	public List<Animal> mostrar();
}
