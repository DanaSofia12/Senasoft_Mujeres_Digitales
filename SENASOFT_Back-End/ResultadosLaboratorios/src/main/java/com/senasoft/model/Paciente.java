package com.senasoft.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Paciente {
	
	private Integer id;
	private String nombretipo;
	private String numeroid;
	private String apellido1;
	private String apellido2;
	private String nombre1;
	private String nombre2;
	private Date fechanac;
	private String nombresexo;
	private String direccion;
	private String tel_movil;
	private String email;

}
