package ar.edu.unlam.tallerweb1.servicios;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.dao.PlanificacionDAO;
import ar.edu.unlam.tallerweb1.modelo.Planificacion;
import ar.edu.unlam.tallerweb1.modelo.Tripulacion;

@Service("ServicioPlanificacion")
@Transactional
public class ServicioPlanificacionImpl implements ServicioPlanificacion{

	@Inject
	private PlanificacionDAO servicioPlanificacionDAO;
	
	@Override
	public List<Planificacion> consultarPlanificaciones() {
		
		return servicioPlanificacionDAO.mostrarPlanificacion();
	}

	@Override
	public void guardarTripulante(long idPlanificacion, Integer posicion,Tripulacion tripulante) {
		 servicioPlanificacionDAO.guardarTripulante(idPlanificacion,posicion,tripulante);
	}

}
