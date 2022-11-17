package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ICientificosDAO;
import com.example.demo.dto.Cientificos;

@Service
public class CientificoServiceImpl implements ICientificoService {

	@Autowired
	ICientificosDAO iCientificoDAO;
	
	
	@Override
	public List<Cientificos> listarCientificos() {
		// TODO Auto-generated method stub
		return iCientificoDAO.findAll();
	}

	@Override
	public Cientificos guardarCientifico(Cientificos cientifico) {
		// TODO Auto-generated method stub
		return iCientificoDAO.save(cientifico);
	}

	@Override
	public Cientificos cientifico_x_id(String DNI) {
		// TODO Auto-generated method stub
		return iCientificoDAO.findById(DNI).get();
	}

	@Override
	public Cientificos actualizarCientifico(Cientificos cientifico) {
		// TODO Auto-generated method stub
		return iCientificoDAO.save(cientifico);
	}

	@Override
	public void eliminarCientifico(String DNI) {
		// TODO Auto-generated method stub
		iCientificoDAO.deleteById(DNI);
		
	}

}