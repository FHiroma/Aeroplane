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

	@Override
	public List<Planificacion> traerVuelosDeUnTripulante(Tripulacion nombreTripulante) {
		return servicioTripulacionDAO.traerVuelosDeUnTripulante(nombreTripulante);
	}

	@Override
	//deberia de cambiarlo para que calcule aquellas en las ultimas 24 horas.
	public Integer calcularTV(List<Planificacion> lista) {
		Integer TV = 0;
		for(int i = 0; i < lista.size(); i++){
	        	TV += lista.get(i).TiempoVuelo();
	       }
		return TV;
	}

	@Override
	public Boolean verificarTVUnDia(Integer tv) {
		if(tv<800){
			return true;
		}
		return false;
	}

	@Override
	public void guardarTripulante(Tripulacion tripulante) {
		servicioTripulacionDAO.guardarTripulante(tripulante);
		
	}
	
}
