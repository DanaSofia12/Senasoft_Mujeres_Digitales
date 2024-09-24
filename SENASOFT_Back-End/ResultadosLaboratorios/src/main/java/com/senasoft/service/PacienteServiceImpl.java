package com.senasoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senasoft.dto.PacienteDTO;
import com.senasoft.mapper.PacienteDTOMapper;
import com.senasoft.repository.PacienteRepository;


@Service
public class PacienteServiceImpl implements PacienteService{
	
	@Autowired
	PacienteRepository pacienteRepository;

	@Override
	public PacienteDTO getPacienteById(Integer id) {

		return PacienteDTOMapper.toPacienteDTO(pacienteRepository.getPacienteById(id));
	}
	

}
