package com.senasoft.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.senasoft.model.Paciente;


public class PacienteRowMapper implements RowMapper<Paciente>{
	
	@Override
	public 	Paciente mapRow(ResultSet rs, int RowNum) throws SQLException{
		
		return Paciente.builder().id(rs.getInt("id")).nombretipo(rs.getString("tipoid_nombre")).numeroid(rs.getString("numeroid")).apellido1(rs.getString("apellido1")).apellido2(rs.getString("apellido2")).nombre1(rs.getString("nombre1")).nombre2(rs.getString("nombre2")).fechanac(rs.getDate("fechanac")).nombresexo(rs.getString("sexobiologico_nombre")).direccion(rs.getString("direccion")).tel_movil(rs.getString("tel_movil")).email(rs.getString("email")).build();
	}
	

}
