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
@Table(name="productos")

public class Producto {
	@Id
	@Column(length=5, nullable=false)	
	private int id;
	@Column(length=50, nullable=false)	
	private String referencia;
	@Column(length=10, nullable=false)	
	private int precio;
	@Column(length=50, nullable=false)	
	private String estado;
	@Column(length=5, nullable=false)	
	private int categoria_id;
	@ManyToOne
	@JoinColumn(name="categoria_id", insertable=false, updatable=false)
	private Categoria categoria;
	
	@OneToMany(mappedBy="producto")
	private List<DetallePago> detallePagos;
	@OneToMany(mappedBy="producto1")
	private List<Carrito> carrito;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getCategoria_id() {
		return categoria_id;
	}
	public void setCategoria_id(int categoria_id) {
		this.categoria_id = categoria_id;
	}
	
}
