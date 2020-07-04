package com.mrabdelaziz.web;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.mrabdelaziz.model.Proprietaire;
import com.mrabdelaziz.service.ProprietaireService;
import com.mrabdelaziz.service.SingletonService;
import com.opensymphony.xwork2.ActionSupport;

public class ProprietaireAction extends ActionSupport{

	public Proprietaire proprietaire = new Proprietaire();
	public List<Proprietaire> proprietaires;
	public int ids;
	@Autowired
	private ProprietaireService service;
	Logger log = LogManager.getLogger(this.getClass());
	

	public String index() {
		proprietaires=service.listProprietaire();
		return SUCCESS;
	}
	
	public String save() {
		service.addProprietaire(proprietaire);
		proprietaires=service.listProprietaire();
		return SUCCESS;
	}
	
	public String delete() {
		service.deleteProprietaire(ids);
		proprietaires=service.listProprietaire();
		return SUCCESS;
	}
	
	
	public String edit() {
		proprietaire = service.getProprietaire(ids);
		//service.updateProprietaire(proprietaire);
		proprietaires= service.listProprietaire();
		return SUCCESS;
	}
	
	
	
	public String execute() {
		//proprietaire = service.getProprietaire(ids);
		//service.updateProprietaire(proprietaire);
		//proprietaires= service.listProprietaire();
		return SUCCESS;
	}

}
