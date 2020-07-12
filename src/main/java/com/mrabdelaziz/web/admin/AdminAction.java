package com.mrabdelaziz.web.admin;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mrabdelaziz.metier.ICcMetier;
import com.mrabdelaziz.metier.IFactureMetier;
import com.mrabdelaziz.metier.IProprietaireMetier;
import com.mrabdelaziz.metier.ITransactionMetier;
import com.mrabdelaziz.model.Cartecredit;
import com.mrabdelaziz.model.Facture;
import com.mrabdelaziz.model.Proprietaire;
import com.mrabdelaziz.model.Transaction;
import com.opensymphony.xwork2.ActionSupport;

public class AdminAction extends ActionSupport{
	public Cartecredit cartecredit = new Cartecredit();
	public Proprietaire proprietaire = new Proprietaire();
	public Facture facture = new Facture();
	public Transaction transaction = new Transaction();
	
	public List<Proprietaire> proprietaires;
	public List<Cartecredit> cartecredits;
	public List<Facture> factures;
	public List<Facture> listbyclient;
	public List<Transaction> transactions;
	public int idclient;
	
	float mntpaye;
	
	public int countProprietaire,ids,countfactures,counttransaction; //<s:property value="countProprietaire"/>
	public String ccid,facid,numcartclient;
	//public boolean editmode;
    @Autowired
	private IProprietaireMetier service;
	
	@Autowired
	private ICcMetier ccservice;
	
	@Autowired
	private IFactureMetier factureservice;
	
	@Autowired
	private ITransactionMetier transactionservice;
	
	public String index() {
		countProprietaire=service.listProprietaire().size();
		countfactures=factureservice.listFactures().size();
		counttransaction=transactionservice.listTransactions().size();
		return SUCCESS;
	}
	
	
	public String getSubForm() {
		proprietaires=service.listProprietaire();
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
				Facture f;
				if(factureservice.getFacture(facture.getNumFacture()).getEtat().equals("en cours")|| factureservice.getFacture(facture.getNumFacture()).getEtat().equals("paye")) {
					f =new Facture(facture.getNumFacture(),facture.getMontant(),facture.getDateFacture(),service.getProprietaire(proprietaire.getId()),facture.getEtat(),2-2);

				}else {
					f =new Facture(facture.getNumFacture(),facture.getMontant(),facture.getDateFacture(),service.getProprietaire(proprietaire.getId()),facture.getEtat(),factureservice.getFacture(facture.getNumFacture()).getMontant());
				}
				//factureservice.deleteFacture(facid);
				factureservice.updateFacture(f);
				
			}else {
		    facture.setProprietaire(service.getProprietaire(proprietaire.getId()));
		    facture.setRestant(facture.getMontant());
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
			proprietaires=service.listProprietaire();
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
	
		
		public String login_view() {
			return SUCCESS;
		}
		
		
		public String login_client() {
			 listbyclient=factureservice.listFacturesbyProprietaire(idclient);
			
			return SUCCESS;
		}
		
		
		public String getSubForm2() {
			cartecredits = ccservice.listCcbyProprietaire(idclient);
			return SUCCESS;
		}
		
		public String paye_facture_step1() {
			cartecredits = ccservice.listCcbyProprietaire(idclient);
			facture = factureservice.getFacture(facid);
			return SUCCESS;
		}
		
		
		public String paye_facture_step2() {
			   Date today = Calendar.getInstance().getTime();
		       transaction.setCarte(ccservice.getCc(cartecredit.getNumCarte()));
			   transaction.setFacture(factureservice.getFacture(facid));
			   transaction.setDatePaiement(today);
			   transaction.setMontantpaiement(transaction.getMontantpaiement());
			   transactionservice.addTransaction(transaction);
			   
			  facture= factureservice.getFacture(facid);
			 // float somme=facture.getMontant()-transaction.getMontantpaiement();
			//  facture.setRestant();
			  facture.setRestant(facture.getRestant()-transaction.getMontantpaiement());
			 
			  if(facture.getRestant()==0) {
				  facture.setEtat("en cours");
			  }
			  factureservice.updateFacture(facture);
		       listbyclient=factureservice.listFacturesbyProprietaire(idclient);

			return SUCCESS;
		}
		
		
		
		public String transactions_list() {
			transactions=transactionservice.listTransactions();
			return SUCCESS;
		}
		
}