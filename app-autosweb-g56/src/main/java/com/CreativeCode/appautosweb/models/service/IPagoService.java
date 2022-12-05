package com.CreativeCode.appautosweb.models.service;

import java.util.List;
import com.CreativeCode.appautosweb.models.entity.Pago;

public interface IPagoService {
	
	public List <Pago> findAll();
	
	public Pago findById(Integer id);
	
	public Pago save (Pago pago);
	
	public void delete(Integer id);

}
