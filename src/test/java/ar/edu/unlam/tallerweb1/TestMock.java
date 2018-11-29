package ar.edu.unlam.tallerweb1;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.assertThat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.controladores.ControladorLogin;
import ar.edu.unlam.tallerweb1.modelo.Usuario;
import ar.edu.unlam.tallerweb1.servicios.ServicioLogin;

public class TestMock {
	@Test
	@Transactional @Rollback(true)
	public void pruebaValidarUsuarioQueDevuelveUsuario(){
	ControladorLogin controlador1= new ControladorLogin();
	Usuario MockUsuario= mock(Usuario.class);
	MockUsuario.setRol("admin");
	ServicioLogin MockLogin = mock(ServicioLogin.class);
	controlador1.setServicioLogin(MockLogin);
	HttpServletRequest MockServlet = mock(HttpServletRequest.class);
	HttpSession MockSession = mock(HttpSession.class);
	when(MockLogin.consultarUsuario(MockUsuario)).thenReturn(MockUsuario);
	when(MockServlet.getSession()).thenReturn(MockSession);
	MockServlet.getSession().setAttribute("ROL",MockUsuario.getRol());
	ModelAndView MAV = controlador1.validarLogin(MockUsuario, MockServlet);
	assertThat(MAV.getViewName()).isEqualTo("redirect:/home");
	}
	
	@Test
	@Transactional @Rollback(true)
	public void pruebaValidarUsuarioQueDevuelveNull(){
	ControladorLogin controlador1= new ControladorLogin();
	Usuario MockUsuario2= mock(Usuario.class);
	ServicioLogin MockLogin = mock(ServicioLogin.class);
	controlador1.setServicioLogin(MockLogin);
	when(MockLogin.consultarUsuario(MockUsuario2)).thenReturn(null);
	HttpServletRequest MockServlet = mock(HttpServletRequest.class);
	ModelAndView MAV = controlador1.validarLogin(MockUsuario2, MockServlet);
	assertThat(MAV.getViewName()).isEqualTo("login");
	}
}
