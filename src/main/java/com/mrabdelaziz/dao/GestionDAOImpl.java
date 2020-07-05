package com.mrabdelaziz.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.mrabdelaziz.model.Cartecredit;
import com.mrabdelaziz.model.Facture;
import com.mrabdelaziz.model.Proprietaire;
import com.mrabdelaziz.model.Transaction;

import ch.qos.logback.core.pattern.Converter;

public class GestionDAOImpl implements IProprietaireDAO , ICcDAO ,IFactureDAO , ITransactionDAO{
	@PersistenceContext
	private EntityManager em;

	@Override
	public void addProprietaire(Proprietaire proprietaire) {
		
		em.persist(proprietaire);
	}

	@Override
	public List<Proprietaire> listProprietaire() {
		
		Query req=em.createQuery("select p from Proprietaire p");
		return req.getResultList();
	}

	@Override
	public Proprietaire getProprietaire(int id) {
		
		return em.find(Proprietaire.class, id);
	}

	@Override
	public void deleteProprietaire(int id) {
		
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
		
		em.persist(cartecredit);
	}

	@Override
	public List<Cartecredit> listCc() {
		
		Query req=em.createQuery("select c from Cartecredit c");
		return req.getResultList();
	}

	@Override
	public Cartecredit getCc(String id) {
		
		return em.find(Cartecredit.class, id);
	}

	@Override
	public void deleteCc(String id) {
		
		Cartecredit p=getCc(id);
		em.remove(p);
	}

	@Override
	public void updateCc(Cartecredit cartecredit) {
		
		em.merge(cartecredit);
		em.close();
	}
	

	@Override
	public List<Cartecredit> listCcbyProprietaire(int id) {
		
		Query req=em.createQuery("select ab from Cartecredit ab where ab.proprietaire.id=:x");
		req.setParameter("x",id);
		return req.getResultList();
	}
	
	//-----------------------------------FACTURE

	@Override
	public void addFacture(Facture facture) {
		em.persist(facture);
		
	}

	@Override
	public List<Facture> listFactures() {
		Query req=em.createQuery("select f from Facture f");
		return req.getResultList();
	}

	@Override
	public Facture getFacture(String id) {
		return em.find(Facture.class, id);
	}

	@Override
	public void deleteFacture(String id) {
		Facture p=getFacture(id);
		em.remove(p);
		
	}

	@Override
	public void updateFacture(Facture facture) {
		em.merge(facture);
		em.close();
		
	}
	
	@Override
	public List<Facture> listFacturesbyProprietaire(int id) {
		Query req=em.createQuery("select ab from Facture ab where ab.proprietaire.id=:x");
		req.setParameter("x",id);
		return req.getResultList();
	}


	//-----------------------------------Transaction
	
	@Override
	public void addTransaction(Transaction transaction) {
			em.persist(transaction);
	}

	@Override
	public List<Transaction> listTransactions() {
		Query req=em.createQuery("select t from Transaction t");
		return req.getResultList();
	}

	@Override
	public Transaction getTransaction(int id) {
		
		return em.find(Transaction.class, id);
	}

	@Override
	public void deleteTransaction(int id) {
		em.remove(id);
		
	}

	@Override
	public void updateTransaction(Transaction transaction) {
		em.merge(transaction);
		em.close();
		
	}



	
	
	
	

}
