package com.mrabdelaziz.metier;

import java.util.List;

import com.mrabdelaziz.model.Facture;

public interface IFactureMetier {
	public void addFacture(Facture facture);
	public List<Facture> listFactures();
	public Facture getFacture(String id);
	public void deleteFacture(String id);
	public void updateFacture(Facture facture);
}
