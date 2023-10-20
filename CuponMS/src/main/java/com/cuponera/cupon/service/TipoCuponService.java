package com.cuponera.cupon.service;

import java.util.List;

import com.cuponera.dto.TipoCupon;


public interface TipoCuponService {

	public TipoCupon obtenerTipoCupon(Integer idTipoCupon);
	
	public List<TipoCupon> obtenerListaTipoCupon();
}
