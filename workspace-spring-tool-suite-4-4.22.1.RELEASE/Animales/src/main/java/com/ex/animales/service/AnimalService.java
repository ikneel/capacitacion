package com.ex.animales.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex.animales.dao.AnimalDao;
import com.ex.animales.entidad.Animal;

@Service
public class AnimalService  implements MetodosAnimal{
	@Autowired
	AnimalDao dao;
	
	
	@Override
	public void guardar(Animal animal) { 
		dao.save(animal);
		
	}

	@Override
	public void editar(Animal animal) {
		dao.save(animal);
	}

	@Override
	public void eliminar(Animal animal) {
		dao.delete(animal);;
	}

	@Override
	public Animal buscar(Animal animal) {
		animal = dao.findById(animal.getIdAnimal()).orElse(null);
		return animal;
	}

	@Override
	public List<Animal> mostrar() {
		List<Animal> lista = (List<Animal>) dao.findAll();
		return lista;
	}

}