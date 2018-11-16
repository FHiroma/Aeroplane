package ar.edu.unlam.tallerweb1.servicios;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.*;

public interface ServicioTripulacion {
	
	List<Tripulacion> consultarTripulaciones();
	List<PlanificacionTripulante> consultarTripulantesDeUnVuelo(long idPlan);
	List<Planificacion> traerVuelosDeUnTripulante(Tripulacion nombreTripulante);
	
	Integer calcularTV(List<Planificacion> lista);
	Boolean verificarTVUnDia(Integer tv);
	
	Integer calcularTS(List<Planificacion> lista);
	Boolean verificarTSPorVuelo(Integer ts);
	
	void guardarTripulante(Tripulacion tripulante);
}
