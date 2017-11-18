package com.askme.app.Models;

public class Test implements java.io.Serializable {

	private Integer id;
	private Contenido contenido;
	private String resultados;
	private String fecha;

	public Test() {
	}

	public Test(Contenido contenido, String resultados, String fecha) {
		this.contenido = contenido;
		this.resultados = resultados;
		this.fecha = fecha;
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

	public String getResultados() {
		return this.resultados;
	}

	public void setResultados(String resultados) {
		this.resultados = resultados;
	}

	public String getFecha() {
		return this.fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

}
