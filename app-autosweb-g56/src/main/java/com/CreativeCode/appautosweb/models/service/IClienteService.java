package com.CreativeCode.appautosweb.models.service;

import java.util.List;
import com.CreativeCode.appautosweb.models.entity.Cliente;


public interface IClienteService {
	
	public List <Cliente> findAll();
	
	public Cliente findById(Integer id);
	
	public Cliente save (Cliente cliente);
	
	public void delete(Integer id);

}
