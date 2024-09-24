package com.senasoft.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DetalleOrdenDTO {
	
	private String name_procedure;
	private String name_test;
	private String name_cups;
	private String unit;
	private String method;

}
