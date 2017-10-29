package com.askme.app.Models;

// default package
// Generated 29-10-2017 12:24:51 by Hibernate Tools 5.2.5.Final

/**
 * Observacion generated by hbm2java
 */
public class Observacion implements java.io.Serializable {

	private Integer id;
	private Concepto concepto;
	private String detalle;

	public Observacion() {
	}

	public Observacion(Concepto concepto, String detalle) {
		this.concepto = concepto;
		this.detalle = detalle;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Concepto getConcepto() {
		return this.concepto;
	}

	public void setConcepto(Concepto concepto) {
		this.concepto = concepto;
	}

	public String getDetalle() {
		return this.detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

}
