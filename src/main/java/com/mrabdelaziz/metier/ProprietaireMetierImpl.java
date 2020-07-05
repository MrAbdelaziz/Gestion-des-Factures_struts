package com.mrabdelaziz.metier;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mrabdelaziz.dao.ICcDAO;
import com.mrabdelaziz.dao.IProprietaireDAO;
import com.mrabdelaziz.model.Cartecredit;
import com.mrabdelaziz.model.Proprietaire;
@Transactional
@Service
public class ProprietaireMetierImpl implements IProprietaireMetier , ICcMetier {
	private IProprietaireDAO dao;
	
	public void setDao(IProprietaireDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public void addProprietaire(Proprietaire proprietaire) {
			dao.addProprietaire(proprietaire);
	}

	@Override
	public List<Proprietaire> listProprietaire() {
		return dao.listProprietaire();
	}

	@Override
	public Proprietaire getProprietaire(int id) {
		// TODO Auto-generated method stub
		return dao.getProprietaire(id);
	}

	@Override
	public void deleteProprietaire(int id) {
		dao.deleteProprietaire(id);
	}

	@Override
	public void updateProprietaire(Proprietaire proprietaire) {
		dao.updateProprietaire(proprietaire);
	}
//-------------------------- cc
private ICcDAO ccdao;
	
	

	public ICcDAO getCcdao() {
	return ccdao;
}

public void setCcdao(ICcDAO ccdao) {
	this.ccdao = ccdao;
}

public IProprietaireDAO getDao() {
	return dao;
}

	@Override
	public void addCc(Cartecredit cartecredit) {
		System.out.println("cartecredit id:"+cartecredit.getNumCarte());
		System.out.println("cartecredit pr:"+cartecredit.getProprietaire().getId());
			ccdao.addCc(cartecredit);
		// TODO Auto-generated method stub
	}

	@Override
	public List<Cartecredit> listCc() {
		// TODO Auto-generated method stub
		return ccdao.listCc();
	}

	@Override
	public Cartecredit getCc(String id) {
		// TODO Auto-generated method stub
		return ccdao.getCc(id);
	}

	@Override
	public void deleteCc(String id) {
		// TODO Auto-generated method stub
		ccdao.deleteCc(id);
	}

	@Override
	public void updateCc(Cartecredit cartecredit) {
		// TODO Auto-generated method stub
		ccdao.updateCc(cartecredit);
	}
	
}
