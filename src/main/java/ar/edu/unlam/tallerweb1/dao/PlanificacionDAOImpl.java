package ar.edu.unlam.tallerweb1.dao;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import ar.edu.unlam.tallerweb1.modelo.Planificacion;
import ar.edu.unlam.tallerweb1.modelo.Tripulacion;

@Repository("PlanificacionDAO")
public class PlanificacionDAOImpl implements PlanificacionDAO{
	
	@Inject
	private SessionFactory sesion;
	
	@Override
	public List<Planificacion> mostrarPlanificacion() {
		final Session session = sesion.getCurrentSession();
		List<Planificacion> list = (List<Planificacion>) 
				session.createCriteria(Planificacion.class)
			    .list();
				return list;
	}

	@Override
	public void guardarTripulante(long idPlanificacion, Integer posicion,Tripulacion tripulante) {
		final Session session = sesion.getCurrentSession();
		Planificacion plan = (Planificacion) session.createCriteria(Planificacion.class)
		.add(Restrictions.eq("idPlanificacion", idPlanificacion))
		.uniqueResult();
		switch(posicion){
		case 1: plan.setJefeDeCabina(tripulante);
		break;
		case 2: plan.setTripulante2(tripulante);
		break;
		case 3: plan.setTripulante3(tripulante);
		break;
		case 4: plan.setTripulante4(tripulante);
		break;
		}
		session.update(plan);
		
	}

}
