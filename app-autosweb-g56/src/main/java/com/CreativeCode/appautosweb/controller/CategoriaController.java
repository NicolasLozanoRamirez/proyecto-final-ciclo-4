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

import com.CreativeCode.appautosweb.models.entity.Categoria;
import com.CreativeCode.appautosweb.models.service.ICategoriaService;


@CrossOrigin(origins = {"http://localhost:4200","http://localhost"})
@RestController
@RequestMapping("/v1")
public class CategoriaController {
	@Autowired
	private ICategoriaService categoriaService;
	@GetMapping("/categorias")
	public List<Categoria> index(){
		return categoriaService.findAll();
	}
	
	@GetMapping("/categorias/{id}")
	public Categoria show(@PathVariable int id) {
		return categoriaService.findById(id);
	}
	
	@PostMapping("/categorias")
	@ResponseStatus(HttpStatus.CREATED)
	public Categoria create(@RequestBody Categoria categoria) {
		return categoriaService.save(categoria);
	}
	
	@PutMapping("/categorias/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Categoria update(@RequestBody Categoria datos,@PathVariable int id) {
		Categoria categoriaActual = categoriaService.findById(id);
		categoriaActual.setNombre(datos.getNombre());
		return categoriaService.save(categoriaActual);
	}
	
	@DeleteMapping("/categorias/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete (@PathVariable int id) {
		categoriaService.delete(id);
	}

}
