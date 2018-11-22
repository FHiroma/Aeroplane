package ar.edu.unlam.tallerweb1.servicios;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.*;

public interface ServicioTripulacion {
	
	List<Tripulacion> consultarTripulaciones();
	List<PlanificacionTripulante> consultarTripulantesDeUnVuelo(long idPlan);
	List<Planificacion> traerVuelosDeUnTripulante(Tripulacion nombreTripulante);
	Long calcularTV(List<Planificacion> lista,Planificacion PlanActual);
	Long calcularTSV(List<Planificacion> lista,Planificacion PlanActual);
	String verificarTVUnDia(Long tv);
	String verificarTSVUnDia(Long tsv);
	void guardarTripulante(Tripulacion tripulante);
}
