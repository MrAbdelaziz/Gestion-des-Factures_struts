package com.mrabdelaziz.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.mrabdelaziz.dao.CartesCreditDAO;
import com.mrabdelaziz.model.*;

public class CartesCreditIMPL implements CartesCreditDAO {
	
	private Map<String,Cartecredit> cclist = new HashMap<String,Cartecredit>();
	Logger log = LogManager.getLogger(this.getClass());
	
	@Override
	public void addCarteCredit(Cartecredit cart) {
		cclist.put(cart.getNumCarte(), cart);
	}

	@Override
	public List<Cartecredit> listCartesCredit() {
		return new ArrayList<Cartecredit>(cclist.values());
	}

	@Override
	public Cartecredit getCartecredit(String numCarte) {
		return cclist.get(numCarte);
	}

	@Override
	public void deleteCartecredit(String numCarte) {
		cclist.remove(numCarte);
	}

	@Override
	public void updateCartecredit(Cartecredit cart) {
		cclist.put(cart.getNumCarte(), cart);
	}

	@Override
	public void addProprietaire(Cartecredit cart,Proprietaire p) {
		cclist.get(cart.getNumCarte()).setProprietaire(p);
	}
	
	public void init() {
				addCarteCredit(new Cartecredit("cc1", new Proprietaire(1,"elouahab","abdelaziz")));
				addCarteCredit(new Cartecredit("cc2", new Proprietaire(2,"elouahab2","abdelaziz2")));
				addCarteCredit(new Cartecredit("cc3", new Proprietaire(3,"elouahab3","abdelaziz3")));
				addCarteCredit(new Cartecredit("cc4", new Proprietaire(4,"elouahab4","abdelaziz4")));
			    log.info("init de cc");
	}


}
