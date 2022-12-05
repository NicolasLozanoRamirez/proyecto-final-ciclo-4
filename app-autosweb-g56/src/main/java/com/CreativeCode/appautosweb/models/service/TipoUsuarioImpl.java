package com.CreativeCode.appautosweb.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CreativeCode.appautosweb.models.dao.ITipoUsuarioDao;
import com.CreativeCode.appautosweb.models.entity.TipoUsuario;

@Service
public class TipoUsuarioImpl implements ITipoUsuarioService {
	@Autowired
	private ITipoUsuarioDao tipoUsuarioDao;
	
	@Override
	public List<TipoUsuario> findAll() {
		// TODO Auto-generated method stub
		return (List<TipoUsuario>) tipoUsuarioDao.findAll();
	}

	@Override
	public TipoUsuario findById(Integer id) {
		// TODO Auto-generated method stub
		return tipoUsuarioDao.findById(id).orElse(null);
	}

	@Override
	public TipoUsuario save(TipoUsuario tipoUsuario) {
		// TODO Auto-generated method stub
		return tipoUsuarioDao.save(tipoUsuario);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		tipoUsuarioDao.deleteById(id);

	}

}
