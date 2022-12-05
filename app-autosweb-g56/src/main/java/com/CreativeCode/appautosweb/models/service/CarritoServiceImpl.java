package com.CreativeCode.appautosweb.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.CreativeCode.appautosweb.models.dao.ICarritoDao;
import com.CreativeCode.appautosweb.models.entity.Carrito;

@Service
public class CarritoServiceImpl implements ICarritoService {
	
	@Autowired
	private ICarritoDao carritoDao;
	
	@Override
	public List<Carrito> findAll() {
		// TODO Auto-generated method stub
		return (List<Carrito>) carritoDao.findAll();
	}

	@Override
	public Carrito findById(Integer id) {
		// TODO Auto-generated method stub
		return carritoDao.findById(id).orElse(null);
	}

	@Override
	public Carrito save(Carrito carrito) {
		// TODO Auto-generated method stub
		return carritoDao.save(carrito);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		carritoDao.deleteById(id);

	}

}
