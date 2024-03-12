package com.mx.Usuario.Dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table
public class Rol {
	@Id
	@Column
	private int idRol;

	@Column
	private String descripcion;

	@Column
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date fechaInsercion;

	@Column
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date fechaModificacion;
	
	@OneToMany(mappedBy="rolId", cascade=CascadeType.ALL)
	List<Usuario> listaUsuario=new ArrayList<>();

	public Rol() {
	}

	public Rol(int idRol, String descripcion, Date fechaInsercion, Date fechaModificacion) {
		this.idRol = idRol;
		this.descripcion = descripcion;
		this.fechaInsercion = fechaInsercion;
		this.fechaModificacion = fechaModificacion;
	}

	@Override
	public String toString() {
		return "Rol [idRol=" + idRol + ", descripcion=" + descripcion + ", fechaInsercion=" + fechaInsercion
				+ ", fechaModificacion=" + fechaModificacion + "]";
	}

	public int getIdRol() {
		return idRol;
	}

	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaInsercion() {
		return fechaInsercion;
	}

	public void setFechaInsercion(Date fechaInsercion) {
		this.fechaInsercion = fechaInsercion;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

}
