package com.cuponera.dto;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Getter;
import lombok.Setter;

@Table
@Entity
@Getter
@Setter
public class CuponCatalogo {
	@Id	
	private Integer idCuponCatalogo;
	
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "idCupon")
	@JsonBackReference
	private Cupon cupon;

	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "idCatalogo")
	@JsonBackReference
	private Catalogo catalogo;
	
	private Integer estadoCuponCatalogo;	
	private String usuarioCreacion;
	private Date fechaCreacion;
	private String usuarioActualizacion;
	private Date fechaActualizacion;
	
}
