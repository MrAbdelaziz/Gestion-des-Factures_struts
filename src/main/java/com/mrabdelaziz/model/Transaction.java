package com.mrabdelaziz.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	private Facture facture;
	
	@ManyToOne
	private Cartecredit carte;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date datePaiement;
	
	private float montantpaiement;
	
	
	

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transaction(int id, Facture facture, Cartecredit carte, Date datePaiement, float montantpaiement) {
		super();
		this.id = id;
		this.facture = facture;
		this.carte = carte;
		this.datePaiement = datePaiement;
		this.montantpaiement = montantpaiement;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Facture getFacture() {
		return facture;
	}

	public void setFacture(Facture facture) {
		this.facture = facture;
	}

	public Cartecredit getCarte() {
		return carte;
	}

	public void setCarte(Cartecredit carte) {
		this.carte = carte;
	}

	public Date getDatePaiement() {
		return datePaiement;
	}

	public void setDatePaiement(Date datePaiement) {
		this.datePaiement = datePaiement;
	}

	public float getMontantpaiement() {
		return montantpaiement;
	}

	public void setMontantpaiement(float montantpaiement) {
		this.montantpaiement = montantpaiement;
	}
	
	
	
}
