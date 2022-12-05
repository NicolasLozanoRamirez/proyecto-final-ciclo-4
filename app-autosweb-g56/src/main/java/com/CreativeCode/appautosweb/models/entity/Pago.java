package com.CreativeCode.appautosweb.models.entity;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pagos")

public class Pago {
	@Id
	@Column(length=5, nullable=false)
	private int id;
	@Column(length=10, nullable=false)
	private int valor;
	@Column(length=50, nullable=false)
	private String fecha;
	@Column(length=5, nullable=false)
	private int cliente_id;
	
	@ManyToOne
	@JoinColumn(name="cliente_id", insertable=false, updatable=false)
	private Cliente cliente2;
	
	@OneToMany(mappedBy="pago")
	private List<DetallePago> detallePagos;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getCliente_id() {
		return cliente_id;
	}

	public void setCliente_id(int cliente_id) {
		this.cliente_id = cliente_id;
	}
	
}
