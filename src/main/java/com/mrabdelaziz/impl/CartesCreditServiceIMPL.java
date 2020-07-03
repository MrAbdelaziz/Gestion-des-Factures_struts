package com.mrabdelaziz.impl;

import java.util.List;

import com.mrabdelaziz.dao.CartesCreditDAO;
import com.mrabdelaziz.model.Cartecredit;
import com.mrabdelaziz.model.Proprietaire;
import com.mrabdelaziz.service.CartesCreditService;

public class CartesCreditServiceIMPL implements CartesCreditService {
	private CartesCreditDAO dao;
	
	
	
	public void setDao(CartesCreditDAO dao) {
		this.dao = dao;
	}

	@Override
	public void addCarteCredit(Cartecredit cart) {
		dao.addCarteCredit(cart);	
	}

	@Override
	public List<Cartecredit> listCartesCredit() {
		return dao.listCartesCredit();
	}

	@Override
	public Cartecredit getCartecredit(String numCarte) {
		return dao.getCartecredit(numCarte);
	}

	@Override
	public void deleteCartecredit(String numCarte) {
		dao.deleteCartecredit(numCarte);
	}

	@Override
	public void updateCartecredit(Cartecredit cart) {
		dao.updateCartecredit(cart);
	}

	@Override
	public void addProprietaire(Cartecredit cart, Proprietaire p) {
		dao.addProprietaire(cart, p);
	}

}
