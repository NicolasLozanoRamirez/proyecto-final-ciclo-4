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

import com.CreativeCode.appautosweb.models.entity.DetallePago;
import com.CreativeCode.appautosweb.models.service.IDetallePagoService;


@CrossOrigin(origins = {"http://localhost:4200","http://localhost"})
@RestController
@RequestMapping("/v1")
public class DetallePagoController {
	@Autowired
	private IDetallePagoService detallePagoService;
	@GetMapping("/detallePagos")
	public List<DetallePago> index(){
		return detallePagoService.findAll();
	}
	
	@GetMapping("/detallePagos/{id}")
	public DetallePago show(@PathVariable int id) {
		return detallePagoService.findById(id);
	}
	
	@PostMapping("/detallePagos")
	@ResponseStatus(HttpStatus.CREATED)
	public DetallePago create(@RequestBody DetallePago detallePago) {
		return detallePagoService.save(detallePago);
	}
	
	@DeleteMapping("/detallePagos/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete (@PathVariable int id) {
		detallePagoService.delete(id);
	}

}
