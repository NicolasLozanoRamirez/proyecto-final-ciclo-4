package com.CreativeCode.appautosweb.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="carrito")
public class Carrito {
	 @Id
	 @Column(length=5, nullable=false)
	 private int id;
	 @Column(length=5, nullable=false)
	 private int producto_id;
	 @Column(length=10, nullable=false)
	 private int precio;
	 @Column(length=5, nullable=false)
	 private int cliente_id;
	 
	 @ManyToOne
	 @JoinColumn(name="cliente_id", insertable=false, updatable=false)
	 private Cliente cliente;
	 @ManyToOne
	 @JoinColumn(name="cliente_id", insertable=false, updatable=false)
	 private Producto producto1;
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProducto_id() {
		return producto_id;
	}
	public void setProducto_id(int producto_id) {
		this.producto_id = producto_id;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getCliente_id() {
		return cliente_id;
	}
	public void setCliente_id(int cliente_id) {
		this.cliente_id = cliente_id;
	} 

}
