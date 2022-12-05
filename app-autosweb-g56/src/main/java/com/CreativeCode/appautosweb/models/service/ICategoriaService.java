package com.CreativeCode.appautosweb.models.service;

import java.util.List;
import com.CreativeCode.appautosweb.models.entity.Categoria;


public interface ICategoriaService {
	
	public List <Categoria> findAll();
	
	public Categoria findById(Integer id);
	
	public Categoria save (Categoria categoria);
	
	public void delete(Integer id);

}
