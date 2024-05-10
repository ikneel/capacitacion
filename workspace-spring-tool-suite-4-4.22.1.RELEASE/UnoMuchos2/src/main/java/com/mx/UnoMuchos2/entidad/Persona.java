package com.mx.UnoMuchos2.entidad;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PERSONAS2")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Persona {
	@Id
	private String curp;
	private String nombrePersona;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private Integer edad;
	private Integer peso;
	private String genero;
	private String ciudad;
	private String telefono;
	
	@OneToMany(mappedBy = "persona", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JsonIgnore
	List<Mascotas> mascotas = new ArrayList<>();
}
