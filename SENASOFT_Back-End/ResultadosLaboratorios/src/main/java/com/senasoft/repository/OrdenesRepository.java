package com.senasoft.repository;

import java.util.List;

import com.senasoft.model.Ordenes;

public interface OrdenesRepository {

	List<Ordenes> getOrdenesByPatient(Integer id);

}
