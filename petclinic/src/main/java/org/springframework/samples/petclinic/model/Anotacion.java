package org.springframework.samples.petclinic.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.samples.petclinic.rest.*;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
@Table(name = "anotacion")
@JsonSerialize(using = AnotacionSerializer.class) //cambiar?
@JsonDeserialize(using = AnotacionDeserializer.class)
public class Anotacion extends EntidadBase{
	
	@Column(name="texto")
	@NotEmpty
	private String texto; 
	
	@Column(name="tipo")
	@NotEmpty
	private int tipo; 
	
	@Column(name="fecha")
	@NotEmpty
	private Date fecha; 
	
	@ManyToOne
    @JoinColumn(name = "idalumno")
	@NotEmpty
    private Alumno alumno;
	
	@ManyToOne
    @JoinColumn(name = "idprofesor")
	@NotEmpty
    private Profesor profesor;
	
	
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}	
}
