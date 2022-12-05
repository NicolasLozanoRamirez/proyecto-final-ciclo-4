package com.CreativeCode.appautosweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.CreativeCode.appautosweb.models.entity.Pago;
import com.CreativeCode.appautosweb.models.service.IPagoService;



@CrossOrigin(origins = {"http://localhost:4200","http://localhost"})
@RestController
@RequestMapping("/v1")
public class PagoController {
	@Autowired
	private IPagoService pagoService;
	@GetMapping("/pagos")
	public List<Pago> index(){
		return pagoService.findAll();
	}
	
	@GetMapping("/pagos/{id}")
	public Pago show(@PathVariable int id) {
		return pagoService.findById(id);
	}
	
	@PostMapping("/pagos")
	@ResponseStatus(HttpStatus.CREATED)
	public Pago create(@RequestBody Pago pago) {
		return pagoService.save(pago);
	}
		
	@DeleteMapping("/pagos/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete (@PathVariable int id) {
		pagoService.delete(id);
	}

}
