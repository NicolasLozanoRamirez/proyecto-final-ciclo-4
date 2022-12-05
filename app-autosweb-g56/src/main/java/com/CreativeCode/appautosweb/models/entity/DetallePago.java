package com.CreativeCode.appautosweb.models.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="detalle_Pagos")

public class DetallePago {
	@Id
	@Column(length=5, nullable=false)	
	private int id;
	@Column(length=5, nullable=false)
	private int pago_id;
	@ManyToOne
	@JoinColumn(name="pago_id", insertable=false, updatable=false)
	private Pago pago;
	
	@Column(length=5, nullable=false)
	private int producto_id;
	@ManyToOne
	@JoinColumn(name="producto_id", insertable=false, updatable=false)
	private Producto producto;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPago_id() {
		return pago_id;
	}
	public void setPago_id(int pago_id) {
		this.pago_id = pago_id;
	}
	public int getProducto_id() {
		return producto_id;
	}
	public void setProducto_id(int producto_id) {
		this.producto_id = producto_id;
	}
	
}
