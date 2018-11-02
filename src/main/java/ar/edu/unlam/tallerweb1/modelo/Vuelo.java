package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vuelo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVuelo;
	private Integer numeroDeVuelo;
	public Long getIdVuelo() {
		return idVuelo;
	}
	public void setIdVuelo(Long idVuelo) {
		this.idVuelo = idVuelo;
	}
	public Integer getNumeroDeVuelo() {
		return numeroDeVuelo;
	}
	public void setNumeroDeVuelo(Integer numeroDeVuelo) {
		this.numeroDeVuelo = numeroDeVuelo;
	}
	
	

}
