package com.CreativeCode.appautosweb.models.service;

import java.util.List;
import com.CreativeCode.appautosweb.models.entity.Empleado;

public interface IEmpleadoService {
	
	public List <Empleado> findAll();
	
	public Empleado findById(Integer id);
	
	public Empleado save (Empleado empleado);
	
	public void delete(Integer id);

}
