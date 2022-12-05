package com.CreativeCode.appautosweb.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CreativeCode.appautosweb.models.dao.IEmpleadoDao;
import com.CreativeCode.appautosweb.models.entity.Empleado;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {
	@Autowired
	private IEmpleadoDao empleadoDao;
	
	@Override
	public List<Empleado> findAll() {
		// TODO Auto-generated method stub
		return (List<Empleado>) empleadoDao.findAll();
	}

	@Override
	public Empleado findById(Integer id) {
		// TODO Auto-generated method stub
		return empleadoDao.findById(id).orElse(null);
	}

	@Override
	public Empleado save(Empleado empleado) {
		// TODO Auto-generated method stub
		return empleadoDao.save(empleado);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		empleadoDao.deleteById(id);

	}

}
