package ar.edu.unlam.tallerweb1.controladores;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Tripulacion;
import ar.edu.unlam.tallerweb1.servicios.ServicioTripulacion;

@Controller
public class ControladorTripulacion {
	
	@Inject 
	private ServicioTripulacion servicioTripulacion;
	
	
	@RequestMapping(path = "/crearTripulante")
	public ModelAndView crearTripulante() {
		
		ModelMap modelo = new ModelMap();		
		Tripulacion miTripulante = new Tripulacion();
		modelo.put("tripulante", miTripulante);
		
		return new ModelAndView ("formularioTripulante",modelo);
	}
	
	@RequestMapping(path = "/formularioTripulante",  method = RequestMethod.POST)
	public ModelAndView cargarTripulante(@ModelAttribute("tripulante") Tripulacion tripulante) {
		
		ModelMap modelo = new ModelMap();
		servicioTripulacion.guardarTripulante(tripulante);
//		modelo.put("tripulante",tripulante);
		
		return new ModelAndView("mostrarTripulanteCargado",modelo);
		
	}

}
