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
public class TipoCupon {
	
	@Id
	private Integer idTipoCupon;
	private String nombreTipoCupon;
	private String descripcionTipoCupon;
	private Integer estado;
	private String usuarioCreacion;
	private Date fechaCreacion;
	private String usuarioActualizacion;
	private Date fechaActualizacion;

}
