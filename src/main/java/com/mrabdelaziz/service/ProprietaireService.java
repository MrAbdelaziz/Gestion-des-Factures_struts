package com.mrabdelaziz.service;

import java.util.List;

import com.mrabdelaziz.model.Proprietaire;

public interface ProprietaireService {
	public void addProprietaire(Proprietaire proprietaire);
	public List<Proprietaire> listProprietaire();
	public Proprietaire getProprietaire(int id);
	public void deleteProprietaire(int id);
	public void updateProprietaire(Proprietaire proprietaire);
}
