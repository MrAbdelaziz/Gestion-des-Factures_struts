package com.mrabdelaziz.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
public class Facture {
	@Id
	@Column(name = "numFacture")
	private String numFacture;
	private float montant;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateFacture;
	
	@ManyToOne
	@JoinColumn(name="idProprietaire")
	private Proprietaire proprietaire;
	
	private String etat;
	
	private float restant;
	
	
	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getEtat() {
		return etat;
	}



	public void setEtat(String etat) {
		this.etat = etat;
	}



	public float getRestant() {
		return restant;
	}



	public void setRestant(float restant) {
		this.restant = restant;
	}



	public Facture(String numFacture, float montant, Date dateFacture, Proprietaire proprietaire, String etat,
			float restant) {
		super();
		this.numFacture = numFacture;
		this.montant = montant;
		this.dateFacture = dateFacture;
		this.proprietaire = proprietaire;
		this.etat = etat;
		this.restant = restant;
	}



	public Proprietaire getProprietaire() {
		return proprietaire;
	}



	public void setProprietaire(Proprietaire proprietaire) {
		this.proprietaire = proprietaire;
	}







	public String getNumFacture() {
		return numFacture;
	}
	
	public void setNumFacture(String numFacture) {
		this.numFacture = numFacture;
	}
	public float getMontant() {
		return montant;
	}
	public void setMontant(float montant) {
		this.montant = montant;
	}
	public Date getDateFacture() {
		return dateFacture;
	}
	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}
	
	
	
}
