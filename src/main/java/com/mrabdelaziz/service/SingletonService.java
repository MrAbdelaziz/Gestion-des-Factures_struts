package com.mrabdelaziz.service;

import com.mrabdelaziz.impl.CartesCreditIMPL;
import com.mrabdelaziz.impl.CartesCreditServiceIMPL;
import com.mrabdelaziz.impl.ProprietaireIMPL;
import com.mrabdelaziz.impl.ProprietaireServiceIMPL;

public class SingletonService {
	private static CartesCreditServiceIMPL serviceCartesCredit;
	private static ProprietaireServiceIMPL serviceProprietaire;
	
	static {
		
	CartesCreditIMPL daocc = new CartesCreditIMPL();
	daocc.init();
		
		
	ProprietaireIMPL daoprop = new ProprietaireIMPL();
	daoprop.init();
		
		
	serviceCartesCredit = new CartesCreditServiceIMPL();
	serviceCartesCredit.setDao(daocc);
		
	
	serviceProprietaire = new ProprietaireServiceIMPL();
	serviceProprietaire.setDao(daoprop);
	
	}
	
	public static CartesCreditServiceIMPL getServiceCc() {
		return serviceCartesCredit;
	}
	
	public static ProprietaireServiceIMPL getServiceProp() {
		return serviceProprietaire;
	}
}
