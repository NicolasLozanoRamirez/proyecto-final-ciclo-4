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

import com.CreativeCode.appautosweb.models.entity.Producto;
import com.CreativeCode.appautosweb.models.service.IProductoService;


@CrossOrigin(origins = {"http://localhost:4200","http://localhost"})
@RestController
@RequestMapping("/v1")
public class ProductoController {
	@Autowired
	private IProductoService productoService;
	@GetMapping("/productos")
	public List<Producto> index(){
		return productoService.findAll();
	}
	
	@GetMapping("/productos/{id}")
	public Producto show(@PathVariable int id) {
		return productoService.findById(id);
	}
	
	@PostMapping("/productos")
	@ResponseStatus(HttpStatus.CREATED)
	public Producto create(@RequestBody Producto producto) {
		return productoService.save(producto);
	}
	
	@PutMapping("/productos/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Producto update(@RequestBody Producto datos,@PathVariable int id) {
		Producto productoActual = productoService.findById(id);
		productoActual.setReferencia(datos.getReferencia());
		return productoService.save(productoActual);
	}
	
	@DeleteMapping("/productos/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete (@PathVariable int id) {
		productoService.delete(id);
	}

}
