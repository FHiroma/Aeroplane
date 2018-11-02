package ar.edu.unlam.tallerweb1.dao;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import ar.edu.unlam.tallerweb1.modelo.Tripulacion;
import ar.edu.unlam.tallerweb1.modelo.Usuario;

@Repository("tripulacionTVDao")
public class TripulacionTVDaoImpl implements TripulacionTVDao {
	
	@Inject
    private SessionFactory sessionFactory;
	
	@Override
	Tripulacion consultarTiempoDeVuelo(Tripulacion tripulacion) {
		
		//ESCRIBIR EL CRITERIA DEL TIEMPO DE VYELO DE LOS TRIPULANTES
		final Session session = sessionFactory.getCurrentSession();
		return (Tripulacion) session.createCriteria(Tripulacion.class)
//				.add(Restrictions.eq("email", usuario.getEmail()))
//				.add(Restrictions.eq("password", usuario.getPassword()))
				.uniqueResult();
	}
}

