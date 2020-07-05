package com.mrabdelaziz.web.admin;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mrabdelaziz.metier.ICcMetier;
import com.mrabdelaziz.metier.IFactureMetier;
import com.mrabdelaziz.metier.IProprietaireMetier;
import com.mrabdelaziz.model.Cartecredit;
import com.mrabdelaziz.model.Facture;
import com.mrabdelaziz.model.Proprietaire;
import com.opensymphony.xwork2.ActionSupport;

public class AdminAction extends ActionSupport{
	public Cartecredit cartecredit = new Cartecredit();
	public Proprietaire proprietaire = new Proprietaire();
	public Facture facture = new Facture();
	
	public List<Proprietaire> proprietaires;
	public List<Cartecredit> cartecredits;
	public List<Facture> factures;
	
	
	public int countProprietaire,ids; //<s:property value="countProprietaire"/>
	public String ccid,facid;
	//public boolean editmode;
    @Autowired
	private IProprietaireMetier service;
	
	@Autowired
	private ICcMetier ccservice;
	
	@Autowired
	private IFactureMetier factureservice;
	
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
	
	public String add_list() {
		 proprietaires=service.listProprietaire();
		return SUCCESS;
	}
	
	
	//-------------------------------------------------------------------cc
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
		
		//----------------------------------------------------------facture
		
		
		public String add_facture() {
			factures=factureservice.listFactures();
			return SUCCESS;
		}
		
		public String save_facture() {
			Date today = Calendar.getInstance().getTime();
			if(facture.getDateFacture()==null) {
				facture.setDateFacture(today);
			}
			
			if(facid !=null) {
				Facture f =new Facture(facture.getNumFacture(),facture.getMontant(),facture.getDateFacture());
				factureservice.deleteFacture(facid);
				factureservice.updateFacture(f);
				
			}else {
			cartecredit.setProprietaire(service.getProprietaire(proprietaire.getId()));
			factureservice.addFacture(facture);
			}
			
			
			factures=factureservice.listFactures();

			return SUCCESS;
		}
		
		public String facture_list() {
			factures=factureservice.listFactures();
			
			return SUCCESS;
		}
		
		public String show_facture() {

			facture = factureservice.getFacture(facid);
			factures=factureservice.listFactures();

			return SUCCESS;
		//}
	}
		
		public String delete_facture() {
			factureservice.deleteFacture(facid);
			
			factures=factureservice.listFactures();
			return SUCCESS;
		}
		
		//----------------------------------------------------------Transaction
		

}
