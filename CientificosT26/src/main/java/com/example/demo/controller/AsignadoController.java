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
import com.example.demo.dto.Asignado;
import com.example.demo.service.AsignadoServiceImpl;

@RestController
@RequestMapping("/api")
public class AsignadoController {
	
	@Autowired
	AsignadoServiceImpl asignadoServiceImpl;
	
	@GetMapping("/asignado")
	public List<Asignado> listarAsignados(){
		return asignadoServiceImpl.listarAsignados();
	}
	
	@PostMapping("/asignado")
	public Asignado salvarAsignado(@RequestBody Asignado asignado) {
		
		return asignadoServiceImpl.guardarAsignado(asignado);
	}
	
	@GetMapping("/asignado/{id}")
	public Asignado asignado_x_ID(@PathVariable(name="id") Long id) {
		
		Asignado asignado_x_id= new Asignado();
		
		asignado_x_id=asignadoServiceImpl.asignado_x_id(id);
		
		System.out.println("Asignado XID: "+asignado_x_id);
		
		return asignado_x_id;
	}
	
	@PutMapping("/asignado/{id}")
	public Asignado actualizarAsignado(@PathVariable(name="id") Long id,@RequestBody Asignado asignado) {
		
		Asignado asignado_seleccionado= new Asignado();
		Asignado asignado_actualizado= new Asignado();
		
		asignado_seleccionado= asignadoServiceImpl.asignado_x_id(id);
		
		asignado_seleccionado.setCientifico(asignado.getCientifico());
		asignado_seleccionado.setProyecto(asignado.getProyecto());
		
		asignado_actualizado = asignadoServiceImpl.actualizarAsignado(asignado_seleccionado);
		
		System.out.println("El asignado actualizado es: "+ asignado_actualizado);
		
		return asignado_actualizado;
	}
	
	@DeleteMapping("/asignado/{id}")
	public void eliminarProyecto(@PathVariable(name="id")Long id) {
		asignadoServiceImpl.eliminarAsignado(id);
	}
}
