package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IAsignadoDAO;
import com.example.demo.dto.Asignado;

@Service
public class AsignadoServiceImpl implements IAsignadoService {

	@Autowired
	IAsignadoDAO iAsignadoDAO;
	
	
	@Override
	public List<Asignado> listarAsignados() {
		// TODO Auto-generated method stub
		return iAsignadoDAO.findAll();
	}

	@Override
	public Asignado guardarAsignado(Asignado asignado) {
		// TODO Auto-generated method stub
		return iAsignadoDAO.save(asignado);
	}

	@Override
	public Asignado asignado_x_id(Long id) {
		// TODO Auto-generated method stub
		return iAsignadoDAO.findById(id).get();
	}

	@Override
	public Asignado actualizarAsignado(Asignado asignado) {
		// TODO Auto-generated method stub
		return iAsignadoDAO.save(asignado);
	}

	@Override
	public void eliminarAsignado(Long id) {
		// TODO Auto-generated method stub
		iAsignadoDAO.deleteById(id);
		
	}

}
