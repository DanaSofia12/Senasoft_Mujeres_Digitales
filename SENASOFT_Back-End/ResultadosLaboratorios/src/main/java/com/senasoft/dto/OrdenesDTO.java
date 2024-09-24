package com.senasoft.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class OrdenesDTO {
	
	private Integer id;
	private Integer id_document;
	private BigDecimal order;
	private LocalDateTime date;

}
