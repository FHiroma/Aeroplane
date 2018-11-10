package ar.edu.unlam.tallerweb1.servicios;


import java.util.ArrayList;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.dao.TripulacionDAO;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.*;

@Service("ServicioTripulacion")
@Transactional
public class ServicioTripulacionImpl implements ServicioTripulacion{
	
	@Inject
    private TripulacionDAO servicioTripulacionDAO; 
	
	@Override
	public List<Tripulacion> consultarTripulaciones() {
		return servicioTripulacionDAO.consultarTripulaciones();
	}

	@Override
	public List<PlanificacionTripulante> consultarTripulantesDeUnVuelo(long idPlan) {
		return servicioTripulacionDAO.consultarTripulanteDeUnVuelo(idPlan);
	}
}
