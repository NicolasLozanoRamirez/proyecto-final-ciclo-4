package com.CreativeCode.appautosweb.models.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.CreativeCode.appautosweb.models.entity.DetallePago;

@Repository
public interface IDetallePagoDao extends CrudRepository<DetallePago,Integer>{

}
