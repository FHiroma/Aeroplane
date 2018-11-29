package ar.edu.unlam.tallerweb1;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.controladores.ControladorPlanificacionTripulacion;
import ar.edu.unlam.tallerweb1.modelo.Planificacion;
import ar.edu.unlam.tallerweb1.modelo.PlanificacionTripulante;
import ar.edu.unlam.tallerweb1.servicios.ServicioPlanificacion;
import ar.edu.unlam.tallerweb1.servicios.ServicioPlanificacionTripulante;
import ar.edu.unlam.tallerweb1.servicios.ServicioTripulacion;

public class TestTripulacion {

	@Test
	@Transactional @Rollback(true)
	public void testNiegaTripulanteConMasDe8HorasUltimoDia() {
		ControladorPlanificacionTripulacion controlador = new ControladorPlanificacionTripulacion();
		long NumeroPlanificacion = 100;
		long NumeroTripulante = 1;
		Integer Posicion = 1;
		ServicioTripulacion MockST = mock(ServicioTripulacion.class);
		ServicioPlanificacion MockSP = mock(ServicioPlanificacion.class);
		ServicioPlanificacionTripulante MockSPT= mock(ServicioPlanificacionTripulante.class);
		controlador.setServicioPlanificacion(MockSP);
		controlador.setServicioPlanificacionTripulante(MockSPT);
		controlador.setServicioTripulacion(MockST);
		PlanificacionTripulante MockPT = mock(PlanificacionTripulante.class);
		MockPT.setIdPlanificacion(MockSPT.agregarPlan(NumeroPlanificacion));
		MockPT.setIdTripulacion(MockSPT.agregarTripulante(NumeroTripulante));
		List<Planificacion>MockListaDeVuelos = mock(List.class);
		Planificacion MockPlan = mock(Planificacion.class);
		when(MockST.calcularTV(MockListaDeVuelos, MockPlan)).thenReturn((long) 9);
		ModelAndView MAV = controlador.tripulanteCargado(NumeroPlanificacion, NumeroTripulante, Posicion);
		assertThat(MAV.getViewName()).isEqualTo("consultarPlanificaciones");
	}

}
