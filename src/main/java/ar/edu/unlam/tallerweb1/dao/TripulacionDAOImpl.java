package ar.edu.unlam.tallerweb1.dao;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import ar.edu.unlam.tallerweb1.modelo.Tripulacion;
@Repository("TripulacionDAO")
public class TripulacionDAOImpl implements TripulacionDAO{	
	@Inject
    private SessionFactory sesion;
	@Override
	public List<Tripulacion> consultarTripulaciones() {
		 final Session session = sesion.getCurrentSession();
	        List<Tripulacion> list =   session.createCriteria(Tripulacion.class)
	                .list();
	                return list;
	}
	

	

}
