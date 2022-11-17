package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Asignado;

public interface IAsignadoService {

	public List<Asignado> listarAsignados();
	
	public Asignado guardarAsignado(Asignado asignado);
	
	public Asignado asignado_x_id(Long id);
	
	public Asignado actualizarAsignado(Asignado asignado);
	
	public void eliminarAsignado(Long id);
}
