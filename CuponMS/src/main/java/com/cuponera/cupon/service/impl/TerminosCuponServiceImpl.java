package com.cuponera.cupon.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuponera.cupon.repository.TerminosCuponRepository;
import com.cuponera.cupon.service.TerminosCuponService;
import com.cuponera.dto.TerminosCupon;

@Service
public class TerminosCuponServiceImpl implements TerminosCuponService{

	@Autowired
	private TerminosCuponRepository terminosCuponRepository;

	@Override
	public TerminosCupon obtenerCupon(Integer idTerminosCupon) {
		return terminosCuponRepository.findByIdTerminosCupon(idTerminosCupon);
	}

	@Override
	public List<TerminosCupon> obtenerListaTerminosCupon() {
		return (List<TerminosCupon>) terminosCuponRepository.findAll();
	}

	
}
