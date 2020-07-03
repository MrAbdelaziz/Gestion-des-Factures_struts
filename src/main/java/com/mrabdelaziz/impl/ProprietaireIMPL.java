package com.mrabdelaziz.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.mrabdelaziz.dao.ProprietaireDAO;
import com.mrabdelaziz.model.Proprietaire;

public class ProprietaireIMPL implements ProprietaireDAO{

	private Map<Integer,Proprietaire> proprietaires = new HashMap<Integer,Proprietaire>();
	Logger log = LogManager.getLogger(this.getClass());
	
	@Override
	public void addProprietaire(Proprietaire proprietaire) {
		proprietaires.put(proprietaire.getId(), proprietaire);
	}

	@Override
	public List<Proprietaire> listProprietaire() {
		return new ArrayList<Proprietaire>(proprietaires.values());
	}

	@Override
	public Proprietaire getProprietaire(int id) {
		return proprietaires.get(id);
	}

	@Override
	public void deleteProprietaire(int id) {
		proprietaires.remove(id);
	}

	@Override
	public void updateProprietaire(Proprietaire proprietaire) {
		proprietaires.put(proprietaire.getId(), proprietaire);	
	}

	public void init() {
		addProprietaire(new Proprietaire(1, "prop1nom", "prop1prenom"));
		addProprietaire(new Proprietaire(2, "prop2nom", "prop2prenom"));
		addProprietaire(new Proprietaire(3, "prop3nom", "prop3prenom"));
		addProprietaire(new Proprietaire(4, "prop4nom", "prop4prenom"));
		log.info("Proprietaire");
	}


}
