package com.mx.UnoMuchos.entidad;

import java.util.ArrayList;
import java.util.List;

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
@Table(name = "REDES")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Red {
	@Id
	private int id;
	private String nombre;
	private String pais;
	
	@OneToMany(mappedBy = "red", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	List<Usuarios> usuarios = new ArrayList<>();
	
	
}
