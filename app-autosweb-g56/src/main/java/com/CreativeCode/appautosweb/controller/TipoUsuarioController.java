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

import com.CreativeCode.appautosweb.models.entity.TipoUsuario;
import com.CreativeCode.appautosweb.models.service.ITipoUsuarioService;


@CrossOrigin(origins = {"http://localhost:4200","http://localhost"})
@RestController
@RequestMapping("/v1")
public class TipoUsuarioController {
	@Autowired
	private ITipoUsuarioService tipoUsuarioService;
	@GetMapping("/tipoUsuarios")
	public List<TipoUsuario> index(){
		return tipoUsuarioService.findAll();
	}
	
	@GetMapping("/tipoUsuarios/{id}")
	public TipoUsuario show(@PathVariable int id) {
		return tipoUsuarioService.findById(id);
	}
	
	@PostMapping("/tipoUsuarios")
	@ResponseStatus(HttpStatus.CREATED)
	public TipoUsuario create(@RequestBody TipoUsuario tipoUsuario) {
		return tipoUsuarioService.save(tipoUsuario);
	}
	
	
	@DeleteMapping("/tipoUsuarios/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete (@PathVariable int id) {
		tipoUsuarioService.delete(id);
	}

}
