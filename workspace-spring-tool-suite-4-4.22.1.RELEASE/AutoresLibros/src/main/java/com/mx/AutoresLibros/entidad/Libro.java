package com.mx.AutoresLibros.entidad;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "LIBROS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Libro {
	@Id
	private String isbn;
	private String titulo;
	private Integer paginas;
	private Integer anio;
	private String genero;
	private double precio;
	private String idioma;
	
	@ManyToMany(mappedBy = "libros", fetch = FetchType.EAGER)
	List<Autor> autores = new ArrayList<>();
}
