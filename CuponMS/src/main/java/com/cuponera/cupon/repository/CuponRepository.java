package com.cuponera.cupon.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cuponera.dto.Cupon;

@Repository
public interface CuponRepository extends JpaRepository<Cupon, Integer>{
	
	public long countByEstado(Integer estado);

	public Cupon findByIdCupon(Integer idCupon);

	public Page<Cupon> findByEstado(Integer estado, Pageable pageable);

	@Query("   Select cup From Cupon cup "
			+ "     INNER JOIN  CuponCatalogo cat on cup.idCupon = cat.cupon.idCupon "
			+ "          where cat.catalogo.idCatalogo = :idCat")
	public Page<Cupon> findAllCupon_IdCatalogo(Integer idCat, Pageable pageable);

	@Query("   Select cup "
			+ "  From Cupon cup, CuponCatalogo cat  "
			+ " where cup.idCupon = cat.cupon.idCupon "
			+ "   and cat.catalogo.idCatalogo = :idCat")
	public Page<Cupon> findAllCupon_IdCatalogo2(Integer idCat, Pageable pageable);

}
