package ar.edu.unlam.tallerweb1.dao;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import ar.edu.unlam.tallerweb1.modelo.Planificacion;
import ar.edu.unlam.tallerweb1.modelo.PlanificacionTripulante;
import ar.edu.unlam.tallerweb1.modelo.Tripulacion;
import ar.edu.unlam.tallerweb1.modelo.Usuario;

@Repository("planificacionTripulanteDAO")
public class PlanificacionTripulanteDAOImpl implements PlanificacionTripulanteDAO{

	@Inject
    private SessionFactory sessionFactory;

	@Override
	public Planificacion agregarPlan(Long idPlan){
		final Session session = sessionFactory.getCurrentSession();
		return (Planificacion) session.createCriteria(Planificacion.class)
		.add(Restrictions.eq("idPlanificacion", idPlan))
		.uniqueResult();
	}
	@Override
	public Tripulacion agregarTripulante(String nombre){
		final Session session = sessionFactory.getCurrentSession();
		return (Tripulacion) session.createCriteria(Tripulacion.class)
		.add(Restrictions.like("nombre", nombre))
		.uniqueResult();
	}
	@Override
	public void guardar(PlanificacionTripulante PT) {
		final Session session = sessionFactory.getCurrentSession();
		session.save(PT);
	}
}
