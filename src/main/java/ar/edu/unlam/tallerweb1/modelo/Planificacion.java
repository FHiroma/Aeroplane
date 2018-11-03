package ar.edu.unlam.tallerweb1.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Planificacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPlanificacion;
	private Integer numeroDeVuelo;
	private Integer fechaYHorarioDeInicio;
	private Integer fechaYHorarioDeArribo;
	@ManyToOne
	private Vuelo idVuelo;

	

	public Long getIdPlanificacion() {
		return idPlanificacion;
	}

	public void setIdPlanificacion(Long idPlanificacion) {
		this.idPlanificacion = idPlanificacion;
	}

	public Integer getNumeroDeVuelo() {
		return numeroDeVuelo;
	}

	public void setNumeroDeVuelo(Integer numeroDeVuelo) {
		this.numeroDeVuelo = numeroDeVuelo;
	}

	public Integer getFechaYHorarioDeInicio() {
		return fechaYHorarioDeInicio;
	}

	public void setFechaYHorarioDeInicio(Integer fechaYHorarioDeInicio) {
		this.fechaYHorarioDeInicio = fechaYHorarioDeInicio;
	}

	public Integer getFechaYHorarioDeArribo() {
		return fechaYHorarioDeArribo;
	}

	public void setFechaYHorarioDeArribo(Integer fechaYHorarioDeArribo) {
		this.fechaYHorarioDeArribo = fechaYHorarioDeArribo;
	}

	public Vuelo getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(Vuelo idVuelo) {
		this.idVuelo = idVuelo;
	}


	
}
