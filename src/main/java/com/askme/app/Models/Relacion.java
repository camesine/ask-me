package com.askme.app.Models;

public class Relacion implements java.io.Serializable {

	private Integer id;
	private Concepto conceptoByConcepto1;
	private Concepto conceptoByConcepto2;
	private TipoRelacion tipoRelacion;

	public Relacion() {
	}

	public Relacion(Concepto conceptoByConcepto1, Concepto conceptoByConcepto2, TipoRelacion tipoRelacion) {
		this.conceptoByConcepto1 = conceptoByConcepto1;
		this.conceptoByConcepto2 = conceptoByConcepto2;
		this.tipoRelacion = tipoRelacion;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Concepto getConceptoByConcepto1() {
		return this.conceptoByConcepto1;
	}

	public void setConceptoByConcepto1(Concepto conceptoByConcepto1) {
		this.conceptoByConcepto1 = conceptoByConcepto1;
	}

	public Concepto getConceptoByConcepto2() {
		return this.conceptoByConcepto2;
	}

	public void setConceptoByConcepto2(Concepto conceptoByConcepto2) {
		this.conceptoByConcepto2 = conceptoByConcepto2;
	}

	public TipoRelacion getTipoRelacion() {
		return this.tipoRelacion;
	}

	public void setTipoRelacion(TipoRelacion tipoRelacion) {
		this.tipoRelacion = tipoRelacion;
	}

}
