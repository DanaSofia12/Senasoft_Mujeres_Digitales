package com.senasoft.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PacienteDTO {
	
	private Integer id;
	private String nametype;
	private String numberid;
	private String surname1;
	private String surname2;
	private String name1;
	private String name2;
	private Date datebirth;
	private String namesex;
	private String adress;
	private String cel_movil;
	private String email;

}
