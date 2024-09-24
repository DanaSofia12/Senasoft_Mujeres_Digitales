package com.senasoft.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DetalleOrden {
	
	private String nombre_procedimiento;
	private String nombre_prueba;
	private String nombre_cups;
	private String unidad;
	private String metodo;

}
