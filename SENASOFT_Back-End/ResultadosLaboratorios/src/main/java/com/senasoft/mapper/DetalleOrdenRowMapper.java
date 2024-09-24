package com.senasoft.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.senasoft.model.DetalleOrden;
import com.senasoft.model.Ordenes;


public class DetalleOrdenRowMapper implements RowMapper<DetalleOrden>{

	@Override
	public DetalleOrden mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		return DetalleOrden.builder().nombre_procedimiento(rs.getString("nombre")).build();
	}
}
