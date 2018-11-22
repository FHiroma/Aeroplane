package ar.edu.unlam.tallerweb1.modelo;


import java.util.Date;
import java.util.concurrent.TimeUnit;

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
	private Date fechaYHorarioDeInicio;
	private Date fechaYHorarioDeArribo;
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

	public Vuelo getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(Vuelo idVuelo) {
		this.idVuelo = idVuelo;
	}	
	
	public Date getFechaYHorarioDeInicio() {
		return fechaYHorarioDeInicio;
	}
	
	public Date getFechaYHorarioDeArribo() {
		return fechaYHorarioDeArribo;
	}

	public void setFechaYHorarioDeInicio(Date fechaYHorarioDeInicio) {
		this.fechaYHorarioDeInicio = fechaYHorarioDeInicio;
	}
	
	public void setFechaYHorarioDeArribo(Date fechaYHorarioDeArribo) {
		this.fechaYHorarioDeArribo = fechaYHorarioDeArribo;
	}
	@SuppressWarnings("static-access")
	public long TiempoVuelo() {
	    long diferenciaEnMiliseg= 
	    this.fechaYHorarioDeArribo.getTime() - this.fechaYHorarioDeInicio.getTime();
	    TimeUnit timeUnit = null;
	    return timeUnit.MINUTES.convert(diferenciaEnMiliseg,TimeUnit.MILLISECONDS);
	}
	@SuppressWarnings("static-access")
	public long TiempoServicioVuelo() {
	    long diferenciaEnMiliseg= 
	    this.fechaYHorarioDeArribo.getTime() - this.fechaYHorarioDeInicio.getTime()+5400000;
	    TimeUnit timeUnit = null;
		return timeUnit.MINUTES.convert(diferenciaEnMiliseg,TimeUnit.MILLISECONDS);
	}
	
	
}
