package com.cuponera.cupon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cuponera.cupon.service.TerminosCuponService;
import com.cuponera.dto.TerminosCupon;

@RestController
@RequestMapping("terminosCupon")
public class TerminosCuponController {

	@Autowired
	private TerminosCuponService terminosCuponService;

	@GetMapping("")
	public String inicio() {
		return "Probando Acceso a TerminosCuponController";
	}

	@GetMapping("obtenerTerminosCupon")
	@ResponseBody
	public TerminosCupon obtenerTerminosCupon(@RequestParam(name = "idTerminosCupon") Integer idTerminosCupon) {
		return terminosCuponService.obtenerCupon(idTerminosCupon);
	}

    @GetMapping("listarterminosCupon")
    @ResponseBody
    public List<TerminosCupon> listarTerminosCupon() {

    	List<TerminosCupon> list = (List<TerminosCupon>) terminosCuponService.obtenerListaTerminosCupon();
    	
    	return  list;
    }
    
}
