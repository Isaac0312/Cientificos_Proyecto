package com.example.demo.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="cientificos")
public class Cientificos {

	
	@Id
	private String DNI;
	
	@Column(name = "nomapels")
	private String nomapels;
	
	@OneToMany
	@JoinColumn(name="DNI")
	private List<Asignado> asignado;

	
	public Cientificos() {
		
	}
	
	public Cientificos(String nomapels, String DNI, List<Asignado> asignado) {
		this.nomapels=nomapels;
		this.asignado=asignado;
		this.DNI=DNI;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNomapels() {
		return nomapels;
	}

	public void setNomapels(String nomapels) {
		this.nomapels = nomapels;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Asignado")
	public List<Asignado> getAsignado() {
		return asignado;
	}

	public void setAsignado(List<Asignado> asignado) {
		this.asignado = asignado;
	}

	@Override
	public String toString() {
		return "Cientificos [DNI=" + DNI + ", nomapels=" + nomapels + ", asignado=" + asignado + "]";
	}
}