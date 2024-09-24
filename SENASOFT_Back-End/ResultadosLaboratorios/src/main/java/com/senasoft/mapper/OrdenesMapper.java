package com.senasoft.mapper;


import com.senasoft.dto.OrdenesDTO;
import com.senasoft.model.Ordenes;


public class OrdenesMapper {
	
	public static Ordenes toOrdenes(OrdenesDTO ordenesDTO) {
		
		if (ordenesDTO == null) {
			return null;
		} else {
			return Ordenes.builder().id(ordenesDTO.getId()).id_documento(ordenesDTO.getId_document()).fecha(ordenesDTO.getDate()).build();
		}
		
	}

}
