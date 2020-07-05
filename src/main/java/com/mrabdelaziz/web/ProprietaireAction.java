package com.mrabdelaziz.web;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.mrabdelaziz.metier.IProprietaireMetier;
import com.mrabdelaziz.model.Proprietaire;
import com.opensymphony.xwork2.ActionSupport;

public class ProprietaireAction extends ActionSupport{

	public Proprietaire proprietaire = new Proprietaire();
	public List<Proprietaire> proprietaires;
	public int ids;
	public boolean editmode;
	@Autowired
	private IProprietaireMetier service;
	

	public String index() {
		proprietaires=service.listProprietaire();
		return SUCCESS;
	}
	
	public String save() {
		if(editmode==false) {
		service.addProprietaire(proprietaire);
		}else {
			//proprietaire.setNom("editmode");
			service.updateProprietaire(proprietaire);
			editmode=false;
		}
		proprietaire = new Proprietaire();
		proprietaires=service.listProprietaire();
		return SUCCESS;
	}
	
	public String delete() {
		service.deleteProprietaire(ids);
		proprietaires=service.listProprietaire();
		return SUCCESS;
	}
	
	
	public String edit() {
		editmode=true;
		proprietaire = service.getProprietaire(ids);
		//service.updateProprietaire(proprietaire);
		proprietaires= service.listProprietaire();
		return SUCCESS;
	}
	
	


}
