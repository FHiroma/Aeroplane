package ar.edu.unlam.tallerweb1.servicios;

import ar.edu.unlam.tallerweb1.modelo.Planificacion;
import ar.edu.unlam.tallerweb1.modelo.PlanificacionTripulante;
import ar.edu.unlam.tallerweb1.modelo.Tripulacion;

public interface ServicioPlanificacionTripulante {

	Planificacion agregarPlan(Long idPlan);
	Tripulacion agregarTripulante(long idTripulante);
	void guardar(PlanificacionTripulante PT);
}
