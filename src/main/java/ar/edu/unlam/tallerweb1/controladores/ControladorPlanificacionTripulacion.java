package ar.edu.unlam.tallerweb1.controladores;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.PlanificacionTripulante;
import ar.edu.unlam.tallerweb1.servicios.ServicioPlanificacionTripulante;

@Controller
public class ControladorPlanificacionTripulacion {

	@Inject
	private ServicioPlanificacionTripulante servicioPlanificacionTripulante;
	
	
	@RequestMapping("/formularioCarga")
	public ModelAndView cargarTripulante(){
		ModelMap modelo= new ModelMap();
		return new ModelAndView("formularioCarga",modelo);
	}

	@RequestMapping(path = "/tripulanteCargado", method = RequestMethod.GET)
	public ModelAndView tripulanteCargado(@RequestParam ("numeroPlanificacion") long numeroPlanificacion,@RequestParam ("nombreTripulante") String nombreTripulante,  HttpServletRequest request) {
		ModelMap modelo = new ModelMap();
		PlanificacionTripulante PT = new PlanificacionTripulante();
		PT.setIdPlanificacion(servicioPlanificacionTripulante.agregarPlan(numeroPlanificacion));
		PT.setIdTripulacion(servicioPlanificacionTripulante.agregarTripulante(nombreTripulante));
		servicioPlanificacionTripulante.guardar(PT);
		modelo.put("PT", PT);
		return new ModelAndView("tripulanteCargado",modelo);
	}
	
	
}
