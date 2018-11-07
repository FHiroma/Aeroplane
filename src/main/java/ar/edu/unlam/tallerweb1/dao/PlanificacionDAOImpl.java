package ar.edu.unlam.tallerweb1.dao;

import java.util.ArrayList;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import ar.edu.unlam.tallerweb1.modelo.Planificacion;

@Repository("PlanificacionDAO")
public class PlanificacionDAOImpl implements PlanificacionDAO{
	
	@Inject
	private SessionFactory sesion;
	
	@Override
	public ArrayList<Planificacion> mostrarPlanificacion() {
		final Session session = sesion.getCurrentSession();
		ArrayList<Planificacion> list = (ArrayList<Planificacion>) 
				session.createCriteria(Planificacion.class)
			    .list();
				return list;
	}

}
