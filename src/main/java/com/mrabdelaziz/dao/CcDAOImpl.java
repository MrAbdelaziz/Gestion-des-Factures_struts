package com.mrabdelaziz.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.mrabdelaziz.model.Cartecredit;
import com.mrabdelaziz.model.Proprietaire;

public class CcDAOImpl implements ICcDAO {
	@PersistenceContext
	private EntityManager em;

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
