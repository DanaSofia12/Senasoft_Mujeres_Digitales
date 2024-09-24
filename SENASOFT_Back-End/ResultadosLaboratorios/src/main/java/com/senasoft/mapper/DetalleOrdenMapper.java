package com.senasoft.mapper;

import com.senasoft.dto.DetalleOrdenDTO;
import com.senasoft.model.DetalleOrden;

public class DetalleOrdenMapper {
	
	public static DetalleOrden toDetalleOrden(DetalleOrdenDTO detalleOrdenDTO) {
		
		if (detalleOrdenDTO == null) {
			return null;
		} else {
			return DetalleOrden.builder().nombre_procedimiento(detalleOrdenDTO.getName_procedure()).nombre_prueba(detalleOrdenDTO.getName_test()).nombre_cups(detalleOrdenDTO.getName_cups()).unidad(detalleOrdenDTO.getUnit()).metodo(detalleOrdenDTO.getMethod()).build();
		}
		
	}

}
