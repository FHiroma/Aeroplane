package ar.edu.unlam.tallerweb1.servicios;

import java.util.ArrayList;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.dao.PlanificacionDAO;
import ar.edu.unlam.tallerweb1.modelo.Planificacion;

@Service("ServicioPlanificacion")
@Transactional
public class ServicioPlanificacionImpl implements ServicioPlanificacion{

	@Inject
	private PlanificacionDAO servicioPlanificacionDAO;
	
	@Override
	public ArrayList<Planificacion> consultarPlanificaciones() {
		
		return servicioPlanificacionDAO.mostrarPlanificacion();
	}

}
