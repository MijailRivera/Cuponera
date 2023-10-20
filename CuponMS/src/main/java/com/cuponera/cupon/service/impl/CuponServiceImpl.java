package com.cuponera.cupon.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cuponera.cupon.repository.CuponRepository;
import com.cuponera.cupon.service.CuponService;
import com.cuponera.dto.Cupon;

@Service
public class CuponServiceImpl implements CuponService{
	
	@Autowired
	public CuponRepository cuponRepository;

	public Integer getCount(Integer estadoCupon){
		if(estadoCupon.equals(0) || estadoCupon.equals(1)) {
			return (int) cuponRepository.countByEstado(estadoCupon);
		}else{
			return (int) cuponRepository.count();
		}
	}

	public List<Cupon> getListaCupon(Integer estadoCupon, Integer page, Integer size, Boolean enablePagination){
		Page<Cupon> pageCupon;
		if(estadoCupon.equals(0) || estadoCupon.equals(1)) {
			System.out.println("getListaCupon");
//			pageCupon = cuponRepository.findByEstado(estadoCupon, enablePagination ? PageRequest.of(page, size): Pageable.unpaged());
//			pageCupon = cuponRepository.findAllCupon_IdCatalogo(1, enablePagination ? PageRequest.of(page, size): Pageable.unpaged());
			pageCupon = cuponRepository.findAllCupon_IdCatalogo2(1, enablePagination ? PageRequest.of(page, size): Pageable.unpaged());
		}else{
			pageCupon = cuponRepository.findAll( enablePagination ? PageRequest.of(page, size): Pageable.unpaged());
		}
		return pageCupon.getContent();
	}

}