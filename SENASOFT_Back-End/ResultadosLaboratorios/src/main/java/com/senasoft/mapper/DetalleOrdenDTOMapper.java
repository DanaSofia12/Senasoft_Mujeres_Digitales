package com.senasoft.mapper;

import com.senasoft.dto.DetalleOrdenDTO;
import com.senasoft.model.DetalleOrden;

public class DetalleOrdenDTOMapper {

	public static DetalleOrdenDTO toDetalleOrdenDTO(DetalleOrden detalleOrden) {
		
		if( detalleOrden == null) {
			return null;
		}else {
			return DetalleOrdenDTO.builder().name_procedure(detalleOrden.getNombre_procedimiento()).name_test(detalleOrden.getNombre_prueba()).name_cups(detalleOrden.getNombre_cups()).unit(detalleOrden.getUnidad()).method(detalleOrden.getMetodo()).build();
		}
	}
}
