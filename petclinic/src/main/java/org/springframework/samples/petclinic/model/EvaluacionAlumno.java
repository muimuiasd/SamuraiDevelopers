package org.springframework.samples.petclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "evaluacion_alumno")
public class EvaluacionAlumno extends EntidadBase{
	
	@Column(name="nota")
	@NotEmpty
	private int nota;
	
	@ManyToOne
    @JoinColumn(name = "idalumno")
    private Alumno alumno;
	
	@ManyToOne
    @JoinColumn(name = "idevaluacion")
    private Evaluacion evaluacion;
}
