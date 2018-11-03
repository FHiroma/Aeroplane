package ar.edu.unlam.tallerweb1.dao;



import ar.edu.unlam.tallerweb1.modelo.PlanificacionTripulante;
import ar.edu.unlam.tallerweb1.modelo.Tripulacion;


public interface TripulacionTVDao {
	
	Tripulacion consultarTiempoDeVuelo(PlanificacionTripulante tripulacion);

}
