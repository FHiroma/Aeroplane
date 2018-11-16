package ar.edu.unlam.tallerweb1.dao;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Planificacion;
import ar.edu.unlam.tallerweb1.modelo.PlanificacionTripulante;
import ar.edu.unlam.tallerweb1.modelo.Tripulacion;

public interface TripulacionDAO {
	
	List<Tripulacion> consultarTripulaciones();

	List<PlanificacionTripulante> consultarTripulanteDeUnVuelo(long idPlan);

	List<Planificacion> traerVuelosDeUnTripulante(Tripulacion nombreTripulante);

}
