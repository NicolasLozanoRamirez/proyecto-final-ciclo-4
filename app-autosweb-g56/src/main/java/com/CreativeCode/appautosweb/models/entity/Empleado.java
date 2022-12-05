package com.CreativeCode.appautosweb.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="empleado")

public class Empleado {
	@Id
	@Column(length=5, nullable=false)
	private int id;
	@Column(length=50, nullable=false)
	private String nombre;
	@Column(length=15, nullable=false)
	private String documento;
	@Column(length=70, nullable=false)
	private String correo;
	@Column(length=20, nullable=false)
	private String contraseña;
	@Column(length=5, nullable=false)
	private int tipo_id;
	
	@ManyToOne
	@JoinColumn(name = "tipo_id", insertable=false,updatable=false)
	private TipoUsuario tipoUsuarios2;
	
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
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public int getTipo_id() {
		return tipo_id;
	}
	public void setTipo_id(int tipo_id) {
		this.tipo_id = tipo_id;
	}

}
