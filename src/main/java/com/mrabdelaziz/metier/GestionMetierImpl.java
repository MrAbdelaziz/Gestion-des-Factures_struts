package com.mrabdelaziz.metier;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mrabdelaziz.dao.ICcDAO;
import com.mrabdelaziz.dao.IFactureDAO;
import com.mrabdelaziz.dao.IProprietaireDAO;
import com.mrabdelaziz.dao.ITransactionDAO;
import com.mrabdelaziz.model.Cartecredit;
import com.mrabdelaziz.model.Facture;
import com.mrabdelaziz.model.Proprietaire;
import com.mrabdelaziz.model.Transaction;
@Transactional
@Service
public class GestionMetierImpl implements IProprietaireMetier , ICcMetier , IFactureMetier , ITransactionMetier{
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
			ccdao.addCc(cartecredit);

	}

	@Override
	public List<Cartecredit> listCc() {

		return ccdao.listCc();
	}

	@Override
	public Cartecredit getCc(String id) {

		return ccdao.getCc(id);
	}

	@Override
	public void deleteCc(String id) {

		ccdao.deleteCc(id);
	}

	@Override
	public void updateCc(Cartecredit cartecredit) {

		ccdao.updateCc(cartecredit);
	}
	
	@Override
	public List<Cartecredit> listCcbyProprietaire(int id) {
		// TODO Auto-generated method stub
		return ccdao.listCcbyProprietaire(id);
	}
//-------------------------- Facture
	private IFactureDAO facturedao;
	
	
	
	public IFactureDAO getFacturedao() {
		return facturedao;
	}

	public void setFacturedao(IFactureDAO facturedao) {
		this.facturedao = facturedao;
	}

	@Override
	public void addFacture(Facture facture) {
		facturedao.addFacture(facture);
		
	}

	@Override
	public List<Facture> listFactures() {
		
		return facturedao.listFactures();
	}

	@Override
	public Facture getFacture(String id) {

		return facturedao.getFacture(id);
	}

	@Override
	public void deleteFacture(String id) {
		facturedao.deleteFacture(id);
		
	}

	@Override
	public void updateFacture(Facture facture) {
		facturedao.updateFacture(facture);
		
	}
	
	@Override
	public List<Facture> listFacturesbyProprietaire(int id) {
		return facturedao.listFacturesbyProprietaire(id);
	}
	//-----------------------------------Transaction

	private ITransactionDAO transactiondao;
	
	public ITransactionDAO getTransactiondao() {
		return transactiondao;
	}

	public void setTransactiondao(ITransactionDAO transactiondao) {
		this.transactiondao = transactiondao;
	}
	
	@Override
	public void addTransaction(Transaction transaction) {
		transactiondao.addTransaction(transaction);	
	}

	@Override
	public List<Transaction> listTransactions() {

		return transactiondao.listTransactions();
	}

	@Override
	public Transaction getTransaction(int id) {

		return transactiondao.getTransaction(id);
	}

	@Override
	public void deleteTransaction(int id) {

		transactiondao.deleteTransaction(id);
	}

	@Override
	public void updateTransaction(Transaction transaction) {
		transactiondao.updateTransaction(transaction);
		
	}




	
	
	
}
