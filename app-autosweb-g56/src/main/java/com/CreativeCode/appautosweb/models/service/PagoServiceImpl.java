package com.CreativeCode.appautosweb.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CreativeCode.appautosweb.models.dao.IPagoDao;
import com.CreativeCode.appautosweb.models.entity.Pago;

@Service
public class PagoServiceImpl implements IPagoService {
	@Autowired
	private IPagoDao pagoDao;
	
	@Override
	public List<Pago> findAll() {
		// TODO Auto-generated method stub
		return (List<Pago>) pagoDao.findAll();
	}

	@Override
	public Pago findById(Integer id) {
		// TODO Auto-generated method stub
		return pagoDao.findById(id).orElse(null);
	}

	@Override
	public Pago save(Pago pago) {
		// TODO Auto-generated method stub
		return pagoDao.save(pago);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		pagoDao.deleteById(id);

	}

}
