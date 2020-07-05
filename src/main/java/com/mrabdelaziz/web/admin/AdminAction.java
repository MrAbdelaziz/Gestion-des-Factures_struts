package com.mrabdelaziz.web.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mrabdelaziz.metier.ICcMetier;
import com.mrabdelaziz.metier.IProprietaireMetier;
import com.mrabdelaziz.model.Cartecredit;
import com.mrabdelaziz.model.Proprietaire;
import com.opensymphony.xwork2.ActionSupport;

public class AdminAction extends ActionSupport{
	public Cartecredit cartecredit = new Cartecredit();
	public Proprietaire proprietaire = new Proprietaire();
	
	public List<Proprietaire> proprietaires;
	public List<Cartecredit> cartecredits;
	
	
	public int countProprietaire,ids; //<s:property value="countProprietaire"/>
	public String ccid;
	//public boolean editmode;
    @Autowired
	private IProprietaireMetier service;
	
	@Autowired
	private ICcMetier ccservice;
	
	public String index() {
		countProprietaire=service.listProprietaire().size();
		return SUCCESS;
	}
	
	
	public String ProprietaireList() {
		proprietaires=service.listProprietaire();
		return SUCCESS;
	}
	
	public String show_proprietaire() {

			//editmode=true;
			proprietaire = service.getProprietaire(ids);
			//service.updateProprietaire(proprietaire);
			//proprietaires= service.listProprietaire();
			return SUCCESS;
		//}
	}
	
	public String edit_proprietaire() {
		service.updateProprietaire(proprietaire);
		proprietaires=service.listProprietaire();
		return SUCCESS;
	}
	
	public String delete_proprietaire() {
		service.deleteProprietaire(ids);
		proprietaires=service.listProprietaire();
		return SUCCESS;
	}
	
	public String add_proprietaire() {
		return SUCCESS;
	}
	
	//cc
	public String add_list() {
		 proprietaires=service.listProprietaire();
		return SUCCESS;
	}
	
	
	//cc
		public String cc_list() {
			cartecredits=ccservice.listCc();
			return SUCCESS;
		}
		
		public String add_cc() {
			cartecredit = new Cartecredit();
			proprietaires=service.listProprietaire();
			return SUCCESS;
		}
		
		public String save_cc() {
			//cartecredit = new Cartecredit();
			if(ccid !=null) {
				Cartecredit cc =new Cartecredit(cartecredit.getNumCarte(), service.getProprietaire(proprietaire.getId()));
				ccservice.deleteCc(ccid);
				ccservice.updateCc(cc);
				
			}else {
			cartecredit.setProprietaire(service.getProprietaire(proprietaire.getId()));
			ccservice.addCc(cartecredit);
			}
			proprietaires=service.listProprietaire();
			cartecredits=ccservice.listCc();
			return SUCCESS;
		}
		
		
		public String show_cc() {
			cartecredit = ccservice.getCc(ccid.trim().toString());
			proprietaires=service.listProprietaire();
			//service.updateProprietaire(proprietaire);
			//proprietaires= service.listProprietaire();
			return SUCCESS;
		//}
	}
		
		public String delete_cc() {
			ccservice.deleteCc(ccid);
			
			cartecredits=ccservice.listCc();
			return SUCCESS;
		}
		
		//--------facture
}
