package com.mrabdelaziz.service;

import java.util.List;

import com.mrabdelaziz.model.Cartecredit;
import com.mrabdelaziz.model.Proprietaire;

public interface CartesCreditService {
	
	public void addCarteCredit(Cartecredit cart);
	public List<Cartecredit> listCartesCredit();
	public Cartecredit getCartecredit(String numCarte);
	public void deleteCartecredit(String numCarte);
	public void updateCartecredit(Cartecredit cart);
	public void addProprietaire(Cartecredit cart,Proprietaire p);

}
