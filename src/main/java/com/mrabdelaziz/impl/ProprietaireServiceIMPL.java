package com.mrabdelaziz.impl;

import java.util.List;

import com.mrabdelaziz.dao.ProprietaireDAO;
import com.mrabdelaziz.model.Proprietaire;
import com.mrabdelaziz.service.ProprietaireService;

public class ProprietaireServiceIMPL implements ProprietaireService{
	private ProprietaireDAO dao;
	
	
	public void setDao(ProprietaireDAO dao) {
		this.dao = dao;
	}
	
	
	
	@Override
	public void addProprietaire(Proprietaire proprietaire) {
		dao.addProprietaire(proprietaire);
	}

	@Override
	public List<Proprietaire> listProprietaire() {
		return dao.listProprietaire();
	}

	@Override
	public Proprietaire getProprietaire(int id) {
		return dao.getProprietaire(id);
	}

	@Override
	public void deleteProprietaire(int id) {
			dao.deleteProprietaire(id);
	}

	@Override
	public void updateProprietaire(Proprietaire proprietaire) {
		dao.updateProprietaire(proprietaire);

	}

}
