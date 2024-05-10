package com.ex.animales.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ex.animales.entidad.Animal;

@Repository
public interface AnimalDao extends CrudRepository<Animal, Integer> {

}
