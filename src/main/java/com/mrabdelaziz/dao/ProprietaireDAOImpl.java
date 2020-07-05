package com.mrabdelaziz.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.mrabdelaziz.model.Cartecredit;
import com.mrabdelaziz.model.Proprietaire;

public class ProprietaireDAOImpl implements IProprietaireDAO , ICcDAO{
	@PersistenceContext
	private EntityManager em;

	@Override
	public void addProprietaire(Proprietaire proprietaire) {
		// TODO Auto-generated method stub
		em.persist(proprietaire);
	}

	@Override
	public List<Proprietaire> listProprietaire() {
		// TODO Auto-generated method stub
		Query req=em.createQuery("select p from Proprietaire p");
		return req.getResultList();
	}

	@Override
	public Proprietaire getProprietaire(int id) {
		// TODO Auto-generated method stub
		return em.find(Proprietaire.class, id);
	}

	@Override
	public void deleteProprietaire(int id) {
		// TODO Auto-generated method stub
		Proprietaire p=getProprietaire(id);
		em.remove(p);
		
	}

	@Override
	public void updateProprietaire(Proprietaire proprietaire) {
		//Proprietaire p=getProprietaire(proprietaire.getId());
		//p.setNom(proprietaire.getNom());
		//p.setPrenom(proprietaire.getPrenom());
		//em.merge(proprietaire);		
		
			//em.getTransaction().begin();
			em.merge(proprietaire);
			//em.getTransaction().commit();
		
		    em.close();
	}
//--- cc
	@Override
	public void addCc(Cartecredit cartecredit) {
		// TODO Auto-generated method stub
		em.persist(cartecredit);
	}

	@Override
	public List<Cartecredit> listCc() {
		// TODO Auto-generated method stub
		Query req=em.createQuery("select c from Cartecredit c");
		return req.getResultList();
	}

	@Override
	public Cartecredit getCc(String id) {
		// TODO Auto-generated method stub
		return em.find(Cartecredit.class, id);
	}

	@Override
	public void deleteCc(String id) {
		// TODO Auto-generated method stub
		Cartecredit p=getCc(id);
		em.remove(p);
	}

	@Override
	public void updateCc(Cartecredit cartecredit) {
		// TODO Auto-generated method stub
		em.merge(cartecredit);
		em.close();
	}

	

}
