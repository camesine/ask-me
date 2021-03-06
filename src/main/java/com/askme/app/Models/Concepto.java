package com.askme.app.Models;

import java.util.HashSet;
import java.util.Set;

public class Concepto implements java.io.Serializable {

	private Integer id;
	private Contenido contenido;
	private String nombre;
	private Set caracteristicas = new HashSet(0);
	private Set observacions = new HashSet(0);
	private Set relacionsForConcepto1 = new HashSet(0);
	private Set definicions = new HashSet(0);
	private Set relacionsForConcepto2 = new HashSet(0);

	public Concepto() {
	}

	public Concepto(Contenido contenido, String nombre) {
		this.contenido = contenido;
		this.nombre = nombre;
	}

	public Concepto(Contenido contenido, String nombre, Set caracteristicas, Set observacions,
			Set relacionsForConcepto1, Set definicions, Set relacionsForConcepto2) {
		this.contenido = contenido;
		this.nombre = nombre;
		this.caracteristicas = caracteristicas;
		this.observacions = observacions;
		this.relacionsForConcepto1 = relacionsForConcepto1;
		this.definicions = definicions;
		this.relacionsForConcepto2 = relacionsForConcepto2;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Contenido getContenido() {
		return this.contenido;
	}

	public void setContenido(Contenido contenido) {
		this.contenido = contenido;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set getCaracteristicas() {
		return this.caracteristicas;
	}

	public void setCaracteristicas(Set caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public Set getObservacions() {
		return this.observacions;
	}

	public void setObservacions(Set observacions) {
		this.observacions = observacions;
	}

	public Set getRelacionsForConcepto1() {
		return this.relacionsForConcepto1;
	}

	public void setRelacionsForConcepto1(Set relacionsForConcepto1) {
		this.relacionsForConcepto1 = relacionsForConcepto1;
	}

	public Set getDefinicions() {
		return this.definicions;
	}

	public void setDefinicions(Set definicions) {
		this.definicions = definicions;
	}

	public Set getRelacionsForConcepto2() {
		return this.relacionsForConcepto2;
	}

	public void setRelacionsForConcepto2(Set relacionsForConcepto2) {
		this.relacionsForConcepto2 = relacionsForConcepto2;
	}

}
