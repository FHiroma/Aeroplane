package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tripulacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTripulacion;
	private Boolean jefeDeCabina;
	private String nombre;
	
	
	public Long getIdTripulacion() {
		return idTripulacion;
	}
	public void setIdTripulacion(Long idTripulacion) {
		this.idTripulacion = idTripulacion;
	}
	public Boolean getJefeDeCabina() {
		return jefeDeCabina;
	}
	public void setJefeDeCabina(Boolean jefeDeCabina) {
		this.jefeDeCabina = jefeDeCabina;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	

}
