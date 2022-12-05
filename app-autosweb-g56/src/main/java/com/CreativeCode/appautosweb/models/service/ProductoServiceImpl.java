package com.CreativeCode.appautosweb.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CreativeCode.appautosweb.models.dao.IProductoDao;
import com.CreativeCode.appautosweb.models.entity.Producto;

@Service
public class ProductoServiceImpl implements IProductoService {
	@Autowired
	private IProductoDao productoDao;
	
	@Override
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return (List<Producto>) productoDao.findAll();
	}

	@Override
	public Producto findById(Integer id) {
		// TODO Auto-generated method stub
		return productoDao.findById(id).orElse(null);
	}

	@Override
	public Producto save(Producto producto) {
		// TODO Auto-generated method stub
		return productoDao.save(producto);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		productoDao.deleteById(id);

	}

}
