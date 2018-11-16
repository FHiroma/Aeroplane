package ar.edu.unlam.tallerweb1.dao;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import ar.edu.unlam.tallerweb1.modelo.Planificacion;
import ar.edu.unlam.tallerweb1.modelo.PlanificacionTripulante;
import ar.edu.unlam.tallerweb1.modelo.Tripulacion;
@Repository("TripulacionDAO")
public class TripulacionDAOImpl implements TripulacionDAO{	
	@Inject
    private SessionFactory sesion;
	@Override
	public List<Tripulacion> consultarTripulaciones() {
		 final Session session = sesion.getCurrentSession();
	        List<Tripulacion> list =  session.createCriteria(Tripulacion.class)
	                .list();
	                return list;
	}
	@Override
	public List<PlanificacionTripulante> consultarTripulanteDeUnVuelo(long idPlan) {
		final Session session = sesion.getCurrentSession();
        List<PlanificacionTripulante> list = session.createCriteria(PlanificacionTripulante.class)
        		.add(Restrictions.eq("idPlanificacion",idPlan))
        		.list();
                return list;
	}
	@Override
	public List<Planificacion> traerVuelosDeUnTripulante(Tripulacion nombreTripulante) {
		final Session session = sesion.getCurrentSession();
        List<PlanificacionTripulante> list = session.createCriteria(PlanificacionTripulante.class)
        		.add(Restrictions.eq("idTripulacion",nombreTripulante))
        		.list();
        List<Planificacion> lista = new ArrayList<Planificacion>();
        for(int i = 0; i < list.size(); i++){
        	lista.add(list.get(i).getIdPlanificacion());
        }
        return lista;
	}
	
	

	@Override
	public void guardarTripulante(Tripulacion tripulante) {
		final Session session = sesion.getCurrentSession();
		session.save(tripulante);
	}

}
