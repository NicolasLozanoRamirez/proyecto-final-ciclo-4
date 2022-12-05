package com.CreativeCode.appautosweb.models.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.CreativeCode.appautosweb.models.entity.Pago;

@Repository
public interface IPagoDao extends CrudRepository<Pago,Integer> {

}
