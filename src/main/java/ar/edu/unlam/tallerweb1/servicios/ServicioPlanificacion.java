package ar.edu.unlam.tallerweb1.servicios;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Planificacion;
import ar.edu.unlam.tallerweb1.modelo.Tripulacion;

public interface ServicioPlanificacion {
	
	List<Planificacion> consultarPlanificaciones();

	void guardarTripulante(long idPlanificacion,Integer posicion,Tripulacion tripulante);
}
