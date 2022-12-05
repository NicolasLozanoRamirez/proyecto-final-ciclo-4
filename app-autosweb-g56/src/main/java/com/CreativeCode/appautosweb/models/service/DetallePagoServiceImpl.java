package com.CreativeCode.appautosweb.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CreativeCode.appautosweb.models.dao.IDetallePagoDao;
import com.CreativeCode.appautosweb.models.entity.DetallePago;

@Service
public class DetallePagoServiceImpl implements IDetallePagoService {
	@Autowired
	private IDetallePagoDao detallePagoDao;
	
	@Override
	public List<DetallePago> findAll() {
		// TODO Auto-generated method stub
		return (List<DetallePago>) detallePagoDao.findAll();
	}

	@Override
	public DetallePago findById(Integer id) {
		// TODO Auto-generated method stub
		return detallePagoDao.findById(id).orElse(null);
	}

	@Override
	public DetallePago save(DetallePago detallePago) {
		// TODO Auto-generated method stub
		return detallePagoDao.save(detallePago);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		detallePagoDao.deleteById(id);

	}

}
