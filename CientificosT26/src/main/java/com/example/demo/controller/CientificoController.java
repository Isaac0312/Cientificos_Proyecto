package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dto.Cientificos;
import com.example.demo.service.CientificoServiceImpl;

@RestController
@RequestMapping("/api")
public class CientificoController {
	
	@Autowired
	CientificoServiceImpl cientificoServiceImpl;
	
	@GetMapping("/cientifico")
	public List<Cientificos> listarCientificos(){
		return cientificoServiceImpl.listarCientificos();
	}
	
	@PostMapping("/cientifico")
	public Cientificos salvarCientifico(@RequestBody Cientificos cientifico) {
		
		return cientificoServiceImpl.guardarCientifico(cientifico);
	}
	
	@GetMapping("/cientifico/{DNI}")
	public Cientificos cientifico_x_ID(@PathVariable(name="DNI") String DNI) {
		
		Cientificos cientifico_x_id= new Cientificos();
		
		cientifico_x_id=cientificoServiceImpl.cientifico_x_id(DNI);
		
		System.out.println("Cientifico XID: "+cientifico_x_id);
		
		return cientifico_x_id;
	}
	
	@PutMapping("/cientifico/{DNI}")
	public Cientificos actualizarCientifico(@PathVariable(name="DNI") String DNI,@RequestBody Cientificos cientifico) {
		
		Cientificos cientifico_seleccionado= new Cientificos();
		Cientificos cientifico_actualizado= new Cientificos();
		
		cientifico_seleccionado= cientificoServiceImpl.cientifico_x_id(DNI);
		
		cientifico_seleccionado.setDNI(cientifico.getDNI());
		cientifico_seleccionado.setNomapels(cientifico.getNomapels());
		
		cientifico_actualizado = cientificoServiceImpl.actualizarCientifico(cientifico_seleccionado);
		
		System.out.println("El cientifico actualizado es: "+ cientifico_actualizado);
		
		return cientifico_actualizado;
	}
	
	@DeleteMapping("/cientifico/{DNI}")
	public void eliminarCientifico(@PathVariable(name="DNI")String DNI) {
		cientificoServiceImpl.eliminarCientifico(DNI);
	}
}