package com.CreativeCode.appautosweb.models.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="categorias")

public class Categoria {
	@Id
	@Column(length=5, nullable=false)
	private int id;
	@Column(length=50, nullable=false)
	private String nombre;
	
	@OneToMany(mappedBy="categoria")
	private List<Producto> productos;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
