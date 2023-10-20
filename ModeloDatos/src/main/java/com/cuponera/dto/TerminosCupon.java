package com.cuponera.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Table
@Entity
@Getter
@Setter
public class TerminosCupon {
	
	@Id
	private Integer idTerminosCupon;
	private String listaTerminos;
	private Integer estado;
	private String usuarioCreacion;
	private Date fechaCreacion;
	private String usuarioActualizacion;
	private Date fechaActualizacion;
}
