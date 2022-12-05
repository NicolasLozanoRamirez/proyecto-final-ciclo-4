package com.CreativeCode.appautosweb.models.service;

import java.util.List;
import com.CreativeCode.appautosweb.models.entity.DetallePago;

public interface IDetallePagoService {
	
	public List <DetallePago> findAll();
	
	public DetallePago findById(Integer id);
	
	public DetallePago save (DetallePago detallePago);
	
	public void delete(Integer id);

}
