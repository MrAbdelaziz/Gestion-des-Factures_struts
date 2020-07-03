package com.mrabdelaziz.web;

import java.util.List;

import com.mrabdelaziz.model.Proprietaire;
import com.mrabdelaziz.service.ProprietaireService;
import com.mrabdelaziz.service.SingletonService;
import com.opensymphony.xwork2.ActionSupport;

public class ProprietaireAction extends ActionSupport{

	public Proprietaire prop = new Proprietaire();
	public List<Proprietaire> proprietaires;
	public int ids;
	public boolean editmode=false;
	private ProprietaireService service =SingletonService.getServiceProp();
	
	
	public String index() {
		proprietaires=service.listProprietaire();
		return SUCCESS;
	}
	
	public String save() {
		service.addProprietaire(prop);
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
		prop = service.getProprietaire(ids);
		//service.updateProprietaire(proprietaire);
		proprietaires= service.listProprietaire();
		return SUCCESS;
	}
}
