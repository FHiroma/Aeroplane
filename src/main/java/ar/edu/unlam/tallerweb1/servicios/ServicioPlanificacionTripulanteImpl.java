package ar.edu.unlam.tallerweb1.servicios;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.dao.PlanificacionTripulanteDAO;
import ar.edu.unlam.tallerweb1.modelo.Planificacion;
import ar.edu.unlam.tallerweb1.modelo.PlanificacionTripulante;
import ar.edu.unlam.tallerweb1.modelo.Tripulacion;

@Service("servicioPlanificacionTripulante")
@Transactional
public class ServicioPlanificacionTripulanteImpl implements ServicioPlanificacionTripulante{
	
	@Inject
	private PlanificacionTripulanteDAO servicioPlanificacionTripulanteDAO;

	@Override
	public Planificacion agregarPlan(Long idPlan){
		return servicioPlanificacionTripulanteDAO.agregarPlan(idPlan);
	}
	@Override
	public Tripulacion agregarTripulante(long idTripulante){
		return servicioPlanificacionTripulanteDAO.agregarTripulante(idTripulante);
	}
	@Override
	public void guardar(PlanificacionTripulante PT) {
		servicioPlanificacionTripulanteDAO.guardar(PT);
	}
}
