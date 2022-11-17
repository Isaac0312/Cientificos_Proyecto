package com.example.demo.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="asignado")
public class Asignado {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	@JoinColumn(name="proyecto_id")
	private Proyecto proyecto;
	
	@ManyToOne
	@JoinColumn(name="cientifico_dni")
	private Cientificos cientifico;
	
	public Asignado() {
		
	}
	
	public Asignado(long id, Proyecto proyecto, Cientificos cientifico) {
		this.id=id;
		this.proyecto=proyecto;
		this.cientifico=cientifico;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	public Cientificos getCientifico() {
		return cientifico;
	}

	public void setCientifico(Cientificos cientifico) {
		this.cientifico = cientifico;
	}

	@Override
	public String toString() {
		return "Asignado [id=" + id + ", proyecto=" + proyecto + ", cientifico=" + cientifico + "]";
	}
}
