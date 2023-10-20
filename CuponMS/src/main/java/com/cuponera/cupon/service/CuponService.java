package com.cuponera.cupon.service;

import java.util.List;

import com.cuponera.dto.Cupon;

public interface CuponService {

	public Integer getCount(Integer estadoCupon);

	public List<Cupon> getListaCupon(Integer estadoCupon, Integer page, Integer size, Boolean enablePagination);

}