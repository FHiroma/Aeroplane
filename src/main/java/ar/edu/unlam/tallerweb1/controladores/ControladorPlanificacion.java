package ar.edu.unlam.tallerweb1.controladores;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Planificacion;
import ar.edu.unlam.tallerweb1.modelo.PlanificacionTripulante;

@Controller
public class ControladorPlanificacion {
	
	@RequestMapping("/plan")
	public ModelAndView plan() {
		
	ModelMap modelo = new ModelMap();
	
	Planificacion plan= new Planificacion();
	plan.setFechaYHorarioDeInicio(445);
	
	
	Planificacion plan1= new Planificacion();
	plan1.setFechaYHorarioDeInicio(775);
	
	ArrayList<Planificacion> lista= new ArrayList<Planificacion>();
	lista.add(plan1);
	lista.add(plan);
	modelo.put("lista", lista);
	
	
	return new ModelAndView("listaPlanificaciones", modelo);
	}
	
//	@RequestMapping(value="/crear-planificacion", method=RequestMethod.GET)
	@RequestMapping("/crear-planning")
	public ModelAndView crearPlanificacion() {
	
	ModelMap modelo= new ModelMap();
	
	return new ModelAndView("crearPlanificacion");
		
		
	}

}
