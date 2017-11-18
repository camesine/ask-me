package com.askme.app.Models;

import java.util.HashSet;
import java.util.Set;

public class Usuario implements java.io.Serializable {

	private Integer id;
	private TipoUsuario tipoUsuario;
	private String correo;
	private String nombre;
	private String apellido;
	private String contrasena;
	private Set contenidos = new HashSet(0);

	public Usuario() {
	}

	public Usuario(TipoUsuario tipoUsuario, String correo, String nombre, String apellido, String contrasena) {
		this.tipoUsuario = tipoUsuario;
		this.correo = correo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.contrasena = contrasena;
	}

	public Usuario(TipoUsuario tipoUsuario, String correo, String nombre, String apellido, String contrasena,
			Set contenidos) {
		this.tipoUsuario = tipoUsuario;
		this.correo = correo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.contrasena = contrasena;
		this.contenidos = contenidos;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TipoUsuario getTipoUsuario() {
		return this.tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getContrasena() {
		return this.contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public Set getContenidos() {
		return this.contenidos;
	}

	public void setContenidos(Set contenidos) {
		this.contenidos = contenidos;
	}

}
