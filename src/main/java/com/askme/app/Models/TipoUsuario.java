package com.askme.app.Models;

import java.util.HashSet;
import java.util.Set;

public class TipoUsuario implements java.io.Serializable {

	private Integer id;
	private String nombre;
	private Set usuarios = new HashSet(0);

	public TipoUsuario() {
	}

	public TipoUsuario(String nombre) {
		this.nombre = nombre;
	}

	public TipoUsuario(String nombre, Set usuarios) {
		this.nombre = nombre;
		this.usuarios = usuarios;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Set usuarios) {
		this.usuarios = usuarios;
	}

}
