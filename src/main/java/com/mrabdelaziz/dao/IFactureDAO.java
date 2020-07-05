package com.mrabdelaziz.dao;

import java.util.List;

import com.mrabdelaziz.model.Cartecredit;
import com.mrabdelaziz.model.Facture;


public interface IFactureDAO {
	public void addFacture(Facture facture);
	public List<Facture> listFactures();
	public Facture getFacture(String id);
	public void deleteFacture(String id);
	public void updateFacture(Facture facture);
	public List<Facture> listFacturesbyProprietaire(int id);
}
