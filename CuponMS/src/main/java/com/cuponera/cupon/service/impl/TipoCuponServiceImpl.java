package com.cuponera.cupon.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuponera.cupon.repository.TipoCuponRepository;
import com.cuponera.cupon.service.TipoCuponService;
import com.cuponera.dto.TipoCupon;

@Service
public class TipoCuponServiceImpl implements TipoCuponService {

	@Autowired
	private TipoCuponRepository tipoCuponRepository;

	@Override
	public TipoCupon obtenerTipoCupon(Integer idTipoCupon) {
		return tipoCuponRepository.findByIdTipoCupon(idTipoCupon);
	}
	
	@Override
	public List<TipoCupon> obtenerListaTipoCupon() {
		List<TipoCupon> listTipoCupon = null;
		
		listTipoCupon = (List<TipoCupon>)tipoCuponRepository.findAll();

		return listTipoCupon;
	}

}
