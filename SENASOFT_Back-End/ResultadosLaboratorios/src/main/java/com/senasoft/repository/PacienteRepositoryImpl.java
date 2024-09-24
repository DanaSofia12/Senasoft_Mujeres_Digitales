package com.senasoft.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.senasoft.mapper.PacienteRowMapper;
import com.senasoft.model.Paciente;

@Repository
public class PacienteRepositoryImpl implements PacienteRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public Paciente getPacienteById(Integer id) {

		try {
		StringBuilder query = new StringBuilder();
		query.append("SELECT p.id, p.numeroid, p.apellido1, p.apellido2, p.nombre1, p.nombre2,")
				.append(" p.fechanac, p.direccion, p.tel_movil, p.email, " )
				.append(" l1.nombre AS tipoid_nombre, l2.nombre AS sexobiologico_nombre ")
				.append(" FROM gen_m_persona p")
				.append(" INNER JOIN gen_p_listaopcion l1 ON p.id_tipoid = l1.id ")
				.append(" INNER JOIN gen_p_listaopcion l2 ON p.id_sexobiologico = l2.id ")
				.append(" WHERE p.id = ?");
		return jdbcTemplate.queryForObject(query.toString(), new PacienteRowMapper(), id);
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
		
	}

}
