package ar.edu.unlam.tallerweb1.servicios;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.dao.TripulacionTVDao;
import ar.edu.unlam.tallerweb1.dao.UsuarioDao;
import ar.edu.unlam.tallerweb1.modelo.Tripulacion;
import ar.edu.unlam.tallerweb1.modelo.Usuario;

@Service("servicioTripulacionTV")
@Transactional
public class ServicioTripulacionTVImpl implements ServicioTripulacionTV{
	
	@Inject
	private TripulacionTVDao servicioLoginDao;
	
	@Override
	public Tripulacion consultarTiempoDeVuelo(Tripulacion tripulacion){
		
		
		
	}
	
	

}
