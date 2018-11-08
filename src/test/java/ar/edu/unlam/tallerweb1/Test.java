package ar.edu.unlam.tallerweb1;

import static org.junit.Assert.*;

import java.util.ArrayList;

import javax.inject.Inject;

import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.modelo.Planificacion;
import ar.edu.unlam.tallerweb1.modelo.PlanificacionTripulante;
import ar.edu.unlam.tallerweb1.modelo.Tripulacion;
import ar.edu.unlam.tallerweb1.modelo.Vuelo;


public class Test extends SpringTest {
	
	@Inject
	public SessionFactory sesion;
	@org.junit.Test
	@Transactional
	@Rollback(true)
	
	public void testQueCreaUnPlanDeVuelos() {
		
		Planificacion planning= new Planificacion();
		
		ArrayList<String> miLista= new ArrayList<String>();
		miLista.add("JefePerez");
		miLista.add("MuriPutito");
		miLista.add("GonzaGay");
		
		
		planning.setFechaYHorarioDeInicio(316);
		planning.setFechaYHorarioDeArribo(311);
		planning.setNumeroDeVuelo(421);
		sesion.getCurrentSession().save(planning);
		
		Integer valorEsperado=421;
		
		assertEquals(valorEsperado, planning.getNumeroDeVuelo());					
	}
	
	
	public void testQueCreaUnaPlanificacionConUnVuelo() {
		
		Vuelo vuelo= new Vuelo();
		vuelo.setNumeroDeVuelo(505);
		sesion.getCurrentSession().save(vuelo);
				
		Planificacion plan= new Planificacion();
		plan.setIdVuelo(vuelo);
		sesion.getCurrentSession().save(plan);
		
		Integer valorEsperado=505;
				
		assertEquals(valorEsperado, plan.getIdVuelo());	
		
	}
	
	public void testQueAsignaTripulantesAUnaPlanificacion() {
		
		Vuelo vuelo= new Vuelo();
		vuelo.setNumeroDeVuelo(505);
		sesion.getCurrentSession().save(vuelo);
				
		Planificacion plan= new Planificacion();
		plan.setIdVuelo(vuelo);
		plan.setFechaYHorarioDeInicio(336);
		sesion.getCurrentSession().save(plan);
		
		Tripulacion JefeCabina= new Tripulacion();
		JefeCabina.setJefeDeCabina(true);
		JefeCabina.setNombre("GonzaGato");
		sesion.getCurrentSession().save(JefeCabina);
		
		PlanificacionTripulante conectar= new PlanificacionTripulante();
		conectar.setIdPlanificacion(plan);
		conectar.setIdTripulacion(JefeCabina);
		sesion.getCurrentSession().save(conectar);
		
		assertTrue(conectar.getIdTripulacion().getJefeDeCabina());		
		
	}
	
	
	
	
	
}


