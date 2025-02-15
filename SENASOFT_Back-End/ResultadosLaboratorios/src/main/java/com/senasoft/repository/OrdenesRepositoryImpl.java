package com.senasoft.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.senasoft.mapper.OrdenesRowMapper;
import com.senasoft.model.Ordenes;

@Repository
public class OrdenesRepositoryImpl implements OrdenesRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Ordenes> getOrdenesByPatient(Integer id) {
		try {
		StringBuilder query = new StringBuilder();
		query.append("SELECT o.id, o.id_documento, o.orden, o.fecha")
				.append(" FROM lab_m_orden o ")
				.append(" INNER JOIN fac_m_tarjetero t ON o.id_historia = t.id ")
				.append(" INNER JOIN gen_m_persona p ON t.id_persona = p.id ")				
				.append(" WHERE p.id = ?");
		return jdbcTemplate.query(query.toString(), new OrdenesRowMapper(), id);
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
		
	}


}
