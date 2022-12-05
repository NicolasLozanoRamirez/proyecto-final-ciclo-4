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

import com.CreativeCode.appautosweb.models.entity.Empleado;
import com.CreativeCode.appautosweb.models.service.IEmpleadoService;


@CrossOrigin(origins = {"http://localhost:4200","http://localhost"})
@RestController
@RequestMapping("/v1")
public class EmpleadoController {
	@Autowired
	private IEmpleadoService empleadoService;
	@GetMapping("/empleados")
	public List<Empleado> index(){
		return empleadoService.findAll();
	}
	
	@GetMapping("/empleados/{id}")
	public Empleado show(@PathVariable int id) {
		return empleadoService.findById(id);
	}
	
	@PostMapping("/empleados")
	@ResponseStatus(HttpStatus.CREATED)
	public Empleado create(@RequestBody Empleado empleado) {
		return empleadoService.save(empleado);
	}
	
	@PutMapping("/empleados/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Empleado update(@RequestBody Empleado datos,@PathVariable int id) {
		Empleado empleadoActual = empleadoService.findById(id);
		empleadoActual.setNombre(datos.getNombre());
		return empleadoService.save(empleadoActual);
	}
	
	@DeleteMapping("/empleados/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete (@PathVariable int id) {
		empleadoService.delete(id);
	}

}
