package com.senasoft.mapper;

import com.senasoft.dto.PacienteDTO;
import com.senasoft.model.Paciente;

public class PacienteMapper {

	public static Paciente toPaciente(PacienteDTO pacienteDTO) {
		
		if (pacienteDTO == null) {
			return null;
		} else {
			return Paciente.builder().id(pacienteDTO.getId()).nombretipo(pacienteDTO.getNametype()).numeroid(pacienteDTO.getNumberid()).apellido1(pacienteDTO.getSurname1()).apellido2(pacienteDTO.getSurname2()).nombre1(pacienteDTO.getName1()).nombre2(pacienteDTO.getName2()).fechanac(pacienteDTO.getDatebirth()).nombresexo(pacienteDTO.getNamesex()).direccion(pacienteDTO.getAdress()).tel_movil(pacienteDTO.getCel_movil()).email(pacienteDTO.getEmail()).build();
		}
		
	}
}
