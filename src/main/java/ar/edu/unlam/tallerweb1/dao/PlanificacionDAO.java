package ar.edu.unlam.tallerweb1.dao;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Planificacion;
import ar.edu.unlam.tallerweb1.modelo.Tripulacion;

public interface PlanificacionDAO {
	
	List<Planificacion> mostrarPlanificacion();
	void guardarTripulante(long idPlanificacion, Integer posicion,Tripulacion tripulante);
}
