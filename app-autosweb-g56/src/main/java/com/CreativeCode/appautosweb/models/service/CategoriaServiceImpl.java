package com.CreativeCode.appautosweb.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CreativeCode.appautosweb.models.dao.ICategoriaDao;
import com.CreativeCode.appautosweb.models.entity.Categoria;

@Service
public class CategoriaServiceImpl implements ICategoriaService {
	@Autowired
	private ICategoriaDao categoriaDao;
	
	@Override
	public List<Categoria> findAll() {
		// TODO Auto-generated method stub
		return (List<Categoria>) categoriaDao.findAll();
	}

	@Override
	public Categoria findById(Integer id) {
		// TODO Auto-generated method stub
		return categoriaDao.findById(id).orElse(null);
	}

	@Override
	public Categoria save(Categoria categoria) {
		// TODO Auto-generated method stub
		return categoriaDao.save(categoria);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		categoriaDao.deleteById(id);

	}

}
