package com.askme.app.Models;

import java.util.HashSet;
import java.util.Set;

public class TipoRelacion implements java.io.Serializable {

	private Integer id;
	private String nombre;
	private Set relacions = new HashSet(0);

	public TipoRelacion() {
	}

	public TipoRelacion(String nombre) {
		this.nombre = nombre;
	}

	public TipoRelacion(String nombre, Set relacions) {
		this.nombre = nombre;
		this.relacions = relacions;
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

	public Set getRelacions() {
		return this.relacions;
	}

	public void setRelacions(Set relacions) {
		this.relacions = relacions;
	}

}
