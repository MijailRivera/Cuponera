package com.cuponera.cupon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cuponera.dto.TerminosCupon;

@Repository
public interface TerminosCuponRepository  extends JpaRepository<TerminosCupon, Integer>{

	public TerminosCupon findByIdTerminosCupon(Integer idTerminosCupon); 

}
