package ar.edu.unlam.tallerweb1.servicios;


import java.util.ArrayList;
import java.util.Date;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

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
	public Long calcularTV(List<Planificacion> lista, Planificacion PlanActual) {
		Long TV = PlanActual.TiempoVuelo();
		Long horarioDelVuelo = PlanActual.getFechaYHorarioDeInicio().getTime() -86400000;
		
		for(int i = 0; i < lista.size(); i++){
				if(lista.get(i).getFechaYHorarioDeArribo().getTime()>=horarioDelVuelo){
	        	TV += lista.get(i).TiempoVuelo();
				}
		}
		return TV;
	}

	@Override
	public Long calcularTSV(List<Planificacion> lista, Planificacion PlanActual) {
		Long TSV = PlanActual.TiempoServicioVuelo();
		Long horarioDelVuelo = PlanActual.getFechaYHorarioDeInicio().getTime() -86400000;
		
		for(int i = 0; i < lista.size(); i++){
				if(lista.get(i).getFechaYHorarioDeArribo().getTime()>=horarioDelVuelo){
	        	TSV += lista.get(i).TiempoServicioVuelo();
				}
		}
		return TSV;
	}
	
	@Override
	public String verificarTVUnDia(Long tv) {
		if(tv<=480){
			return "";
		}
		return "El tripulante no puede ser cargado porque supera las 8 horas de TV.";
	}
	
	@Override
	public String verificarTSVUnDia(Long tsv) {
		if(tsv<=780){
			return "";
		}
		return "El tripulante no puede ser cargado porque supera las 13 horas de TSV.";
	}
	@Override
	public void guardarTripulante(Tripulacion tripulante) {
		servicioTripulacionDAO.guardarTripulante(tripulante);
		
	}
	
}
