package com.CreativeCode.appautosweb.models.service;

import java.util.List;
import com.CreativeCode.appautosweb.models.entity.Producto;

public interface IProductoService {
	
	public List <Producto> findAll();
	
	public Producto findById(Integer id);
	
	public Producto save (Producto producto);
	
	public void delete(Integer id);

}
