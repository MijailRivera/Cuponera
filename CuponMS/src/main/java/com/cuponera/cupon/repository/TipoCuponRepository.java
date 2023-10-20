package com.cuponera.cupon.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cuponera.dto.TipoCupon;



@Repository
public interface TipoCuponRepository extends CrudRepository<TipoCupon, Integer>{

	public TipoCupon findByIdTipoCupon(Integer idTipoCupon);
}
