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
@Table(name="proyecto")
public class Proyecto {

	@Id
	private String id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "horas")
	private int horas;
	
	@OneToMany
	@JoinColumn(name="id")
	private List<Asignado> asignado;
	
	public Proyecto() {
		
	}
	
	public Proyecto(String id, int horas, String nombre, List<Asignado>asignado) {
		this.id=id;
		this.horas=horas;
		this.nombre=nombre;
		this.asignado=asignado;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Asignado")
	public List<Asignado> getAsignado() {
		return asignado;
	}

	public void setAsignado(List<Asignado> asignado) {
		this.asignado = asignado;
	}
	
}
