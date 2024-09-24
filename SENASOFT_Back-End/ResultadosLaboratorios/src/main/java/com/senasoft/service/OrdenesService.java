package com.senasoft.service;

import java.util.List;

import com.senasoft.dto.OrdenesDTO;

public interface OrdenesService {

	List<OrdenesDTO> getOrdenesByPatient(Integer id);

}
