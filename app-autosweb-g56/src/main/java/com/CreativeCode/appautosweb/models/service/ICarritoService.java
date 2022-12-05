package com.CreativeCode.appautosweb.models.service;

import java.util.List;
import com.CreativeCode.appautosweb.models.entity.Carrito;

public interface ICarritoService {
	
	public List <Carrito> findAll();
	
	public Carrito findById(Integer id);
	
	public Carrito save (Carrito carrito);
	
	public void delete(Integer id);

}
