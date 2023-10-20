package com.cuponera.cupon.service;

import java.util.List;

import com.cuponera.dto.TerminosCupon;

public interface TerminosCuponService {
	public TerminosCupon obtenerCupon(Integer idTerminosCupon);
	
	public List<TerminosCupon> obtenerListaTerminosCupon();
}
