package com.mrabdelaziz.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.mrabdelaziz.dao.ProprietaireDAO;
import com.mrabdelaziz.model.Proprietaire;

public class Proprietaire_JPA_IMPL implements ProprietaireDAO{
	@PersistenceContext
	private EntityManager em;
	@Override
	public void addProprietaire(Proprietaire proprietaire) {
	em.persist(proprietaire);	
	}

	@Override
	public List<Proprietaire> listProprietaire() {
		Query req = em.createQuery("select p from Proprietaire p");
		return req.getResultList();
	}

	@Override
	public Proprietaire getProprietaire(int id) {
		return em.find(Proprietaire.class, id);
	}



	@Override
	public void updateProprietaire(Proprietaire proprietaire) {
			em.merge(proprietaire);
	}
	
	@Override
	public void deleteProprietaire(int id) {
		Proprietaire p = getProprietaire(id);
		em.remove(p);
	}

}
