package org.springframework.samples.petclinic.model;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.samples.petclinic.rest.*;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
@Table(name = "Asignatura")
@JsonSerialize(using = AsignaturaSerializer.class)
@JsonDeserialize(using = AsignaturaDeserializer.class)
public class Asignatura extends EntidadBase {
	
	@Column(name = "nombreAsignatura")
	@NotEmpty
	private String nombre;
	
	
	@ManyToOne
	@JoinColumn(name = "idProfesor")
	private int idProfesor;
	


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(int idProfesor) {
		this.idProfesor = idProfesor;
	}
	
	

}
