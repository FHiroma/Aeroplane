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
	public Tripulacion getJefeDeCabina() {
		return jefeDeCabina;
	}

	public void setJefeDeCabina(Tripulacion jefeDeCabina) {
		this.jefeDeCabina = jefeDeCabina;
	}

	public Tripulacion getTripulante2() {
		return tripulante2;
	}

	public void setTripulante2(Tripulacion tripulante2) {
		this.tripulante2 = tripulante2;
	}

	public Tripulacion getTripulante3() {
		return tripulante3;
	}

	public void setTripulante3(Tripulacion tripulante3) {
		this.tripulante3 = tripulante3;
	}

	public Tripulacion getTripulante4() {
		return tripulante4;
	}

	public void setTripulante4(Tripulacion tripulante4) {
		this.tripulante4 = tripulante4;
	}
	@ManyToOne
	private Tripulacion jefeDeCabina;
	@ManyToOne
	private Tripulacion tripulante2;
	@ManyToOne
	private Tripulacion tripulante3;
	@ManyToOne
	private Tripulacion tripulante4;

	

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
