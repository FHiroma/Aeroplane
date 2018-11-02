package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PlanificacionTripulante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPlanTrip;
	@ManyToOne
	private Planificacion idPlanificacion;
	@ManyToOne
	private Tripulacion idTripulacion;
	
	public Long getIdPlanTrip() {
		return idPlanTrip;
	}
	public void setIdPlanTrip(Long idPlanTrip) {
		this.idPlanTrip = idPlanTrip;
	}
	public Planificacion getIdPlanificacion() {
		return idPlanificacion;
	}
	public void setIdPlanificacion(Planificacion idPlanificacion) {
		this.idPlanificacion = idPlanificacion;
	}
	public Tripulacion getIdTripulacion() {
		return idTripulacion;
	}
	public void setIdTripulacion(Tripulacion idTripulacion) {
		this.idTripulacion = idTripulacion;
	}
	
	

}
