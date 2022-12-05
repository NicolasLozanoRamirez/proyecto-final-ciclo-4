package com.CreativeCode.appautosweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.CreativeCode.appautosweb.models.entity.Carrito;
import com.CreativeCode.appautosweb.models.service.ICarritoService;

@CrossOrigin(origins = {"http://localhost:4200","http://localhost"})
@RestController
@RequestMapping("/v1")
public class CarritoController {
	@Autowired
	private ICarritoService carritoService;
	@GetMapping("/carrito")
	public List<Carrito> index(){
		return carritoService.findAll();
	}
	
	@GetMapping("/carrito/{id}")
	public Carrito show(@PathVariable int id) {
		return carritoService.findById(id);
	}
	
	@PostMapping("/carrito")
	@ResponseStatus(HttpStatus.CREATED)
	public Carrito create(@RequestBody Carrito carrito) {
		return carritoService.save(carrito);
	}
	
	@PutMapping("/carrito/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Carrito update(@RequestBody Carrito datos,@PathVariable int id) {
		Carrito carritoActual = carritoService.findById(id);
		carritoActual.setPrecio(datos.getPrecio());
		return carritoService.save(carritoActual);
	}
	
	@DeleteMapping("/carrito/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete (@PathVariable int id) {
		carritoService.delete(id);
	}

}
