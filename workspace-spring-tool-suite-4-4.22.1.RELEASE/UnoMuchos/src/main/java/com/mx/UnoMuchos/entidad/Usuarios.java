package com.mx.UnoMuchos.entidad;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "USUARIOS")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Usuarios {
	
	private String email;
	private String username;
	private int edad;
	private String pais;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_RED")
	Red red;

}
