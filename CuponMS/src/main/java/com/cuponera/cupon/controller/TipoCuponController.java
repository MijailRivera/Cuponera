package com.cuponera.cupon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cuponera.cupon.service.TipoCuponService;
import com.cuponera.dto.TipoCupon;

@RestController
@RequestMapping("tipoCupon")
public class TipoCuponController {

	@Autowired
	private TipoCuponService tipoCuponService;
	

	@GetMapping("")
	public String inicio() {
		return "Probando Acceso a Cupon Controller";
	}

	@GetMapping("obtenerTipoCupon")
	@ResponseBody
	public TipoCupon obtenerTipoCupon(@RequestParam(name = "idTipoCupon") Integer idTipoCupon) {
		return tipoCuponService.obtenerTipoCupon(idTipoCupon);
	}

    @GetMapping("/listarTipoCupon")
    @ResponseBody
    public List<TipoCupon> listarTipoCupon(Model model) {
    	List<TipoCupon> list = (List<TipoCupon>) tipoCuponService.obtenerListaTipoCupon();    	
    	return  list;
    }
    
}
