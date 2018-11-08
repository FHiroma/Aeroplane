package ar.edu.unlam.tallerweb1.controladores;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Planificacion;
import ar.edu.unlam.tallerweb1.modelo.PlanificacionTripulante;
import ar.edu.unlam.tallerweb1.servicios.ServicioPlanificacion;

@Controller
public class ControladorPlanificacion {
@Inject
private ServicioPlanificacion servicioPlanificacion;	
	@RequestMapping("/plan")
	public ModelAndView plan() {
	ModelMap modelo = new ModelMap();
	return new ModelAndView("listaPlanificaciones", modelo);
	}
	
	@RequestMapping("/consultarPlanificaciones")
	public ModelAndView planificaciones() {
			
		List<Planificacion> lista = servicioPlanificacion.consultarPlanificaciones();
		ModelMap modelo = new ModelMap();	
		modelo.put("lista", lista);
		
		return new ModelAndView("consultarPlanificaciones",modelo);
	}
}
