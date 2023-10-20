package com.cuponera.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.Setter;

@Table
@Entity
@Getter
@Setter
public class Catalogo {

	@Id
	private Integer idCatalogo;

	private String nomCatalogo;
	private String descCatalogo;
	private Integer estadoCatalogo;
	private String usuarioCreacion;
	private Date fechaCreacion;
	private String usuarioActualizacion;
	private Date fechaActualizacion;

	@JsonManagedReference
	@OneToMany(targetEntity = com.cuponera.dto.CuponCatalogo.class, mappedBy = "catalogo", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<CuponCatalogo> cuponCatalogos;
}
