package ar.edu.unlam.tallerweb1.dao;

import ar.edu.unlam.tallerweb1.modelo.Planificacion;
import ar.edu.unlam.tallerweb1.modelo.PlanificacionTripulante;
import ar.edu.unlam.tallerweb1.modelo.Tripulacion;

public interface PlanificacionTripulanteDAO {

	Planificacion agregarPlan(Long idPlan);
	Tripulacion agregarTripulante(String nombre);
	void guardar(PlanificacionTripulante PT);
}
