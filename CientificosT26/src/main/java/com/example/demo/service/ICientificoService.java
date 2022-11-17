package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Cientificos;

public interface ICientificoService {

	public List<Cientificos> listarCientificos();
	
	public Cientificos guardarCientifico(Cientificos cientifico);
	
	public Cientificos cientifico_x_id(String DNI);
	
	public Cientificos actualizarCientifico(Cientificos cientifico);
	
	public void eliminarCientifico(String DNI);
}
