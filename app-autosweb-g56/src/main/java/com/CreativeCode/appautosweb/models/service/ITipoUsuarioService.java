package com.CreativeCode.appautosweb.models.service;

import java.util.List;
import com.CreativeCode.appautosweb.models.entity.TipoUsuario;

public interface ITipoUsuarioService {
	
	public List <TipoUsuario> findAll();
	
	public TipoUsuario findById(Integer id);
	
	public TipoUsuario save (TipoUsuario tipoUsuario);
	
	public void delete(Integer id);

}
