package com.senasoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senasoft.dto.PacienteDTO;
import com.senasoft.response.ResponseHandler;
import com.senasoft.service.PacienteService;
import com.senasoft.utils.Utilities;


@RestController
@RequestMapping("/paciente")
@CrossOrigin(origins = {"*"})
public class PacienteController {
	
	@Autowired
	PacienteService pacienteService;
	
	
	@GetMapping("/consultar/{id}")
	private ResponseEntity<Object> getPacienteById(@PathVariable Integer id){
		PacienteDTO pacienteDTO = pacienteService.getPacienteById(id);
		return pacienteDTO != null
				? ResponseHandler.generateResponseSuccess(Utilities.MESSAGE_PROFILE_ALL_FOUND_, HttpStatus.OK, pacienteDTO)
						:ResponseHandler.generateResponseSuccess(Utilities.MESSAGE_NO_FOUND, HttpStatus.OK, null);
	}

}
