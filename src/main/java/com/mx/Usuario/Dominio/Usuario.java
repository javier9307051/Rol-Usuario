package com.mx.Usuario.Dominio;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="USUARIO")
public class Usuario {
	@Id
	@Column
	private int idUsuario;

	@Column
	private String nombre;

	@Column(name="APELLIDO_P", columnDefinition = "NVARCHAR(50)")
	private String apellidoP;

	@Column(name="APELLIDO_M", columnDefinition = "NVARCHAR(50)")
	private String apellidoM;

	@Column
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date nacimiento;

	@Column
	private int edad;

	@Column
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date fechaInsercion;

	@Column
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date fechaModificacion;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="ROL_ID")
	private Rol rolId;

	public Usuario() {
	}

	public Usuario(int idUsuario, String nombre, String apellidoP, String apellidoM, Date nacimiento, int edad,
			Date fechaInsercion, Date fechaModificacion, Rol rolId) {
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellidoP = apellidoP;
		this.apellidoM = apellidoM;
		this.nacimiento = nacimiento;
		this.edad = edad;
		this.fechaInsercion = fechaInsercion;
		this.fechaModificacion = fechaModificacion;
		this.rolId = rolId;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nombre=" + nombre + ", apellidoP=" + apellidoP + ", apellidoM="
				+ apellidoM + ", nacimiento=" + nacimiento + ", edad=" + edad + ", fechaInsercion=" + fechaInsercion
				+ ", fechaModificacion=" + fechaModificacion + ", rol=" + rolId + "]";
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoP() {
		return apellidoP;
	}

	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}

	public String getApellidoM() {
		return apellidoM;
	}

	public void setApellidoM(String apellidoM) {
		this.apellidoM = apellidoM;
	}

	public Date getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
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

	public Rol getRol() {
		return rolId;
	}

	public void setRol(Rol rolId) {
		this.rolId = rolId;
	}

}
