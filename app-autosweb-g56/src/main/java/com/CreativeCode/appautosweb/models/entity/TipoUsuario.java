package com.CreativeCode.appautosweb.models.entity;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tipo_usuarios")

public class TipoUsuario {
	@Id
	@Column(length=5, nullable=false)	
	private int id;
	@Column(length=1, nullable=false)	
	private String tipo;
	
	@OneToMany(mappedBy="tipoUsuarios")
	private List<Cliente> clientes;
	
	@OneToMany(mappedBy="tipoUsuarios2")
	private List<Empleado> empleados;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
