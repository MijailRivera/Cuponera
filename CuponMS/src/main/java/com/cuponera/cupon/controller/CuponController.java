package com.cuponera.cupon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cuponera.cupon.service.CuponService;
import com.cuponera.dto.Cupon;

@RestController
@RequestMapping("cupon")
public class CuponController {

	@Autowired
	private CuponService cuponService;

	@GetMapping("")
	public String inicio() {
		return "Probando Acceso a CuponController";
	}

	@GetMapping("count")
	public Integer getCount(@RequestParam Integer estadoCupon) {
		return cuponService.getCount(estadoCupon);
	}

	@GetMapping("listarCupon")
	@ResponseBody
	public List<Cupon> listarCupon(
									@RequestParam Integer estadoCupon,
									@RequestParam Integer page, 
									@RequestParam Integer size,
									@RequestParam Boolean enablePagination){
		return cuponService.getListaCupon(estadoCupon, page, size, enablePagination);
	}
	
}
