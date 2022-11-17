package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Proyecto;

public interface IProyectoService {
	
	public List<Proyecto> listarProyectos();
	
	public Proyecto guardarProyecto(Proyecto proyecto);
	
	public Proyecto proyecto_x_id(String id);
	
	public Proyecto actualizarProyecto(Proyecto proyecto);
	
	public void eliminarProyecto(String id);
}
