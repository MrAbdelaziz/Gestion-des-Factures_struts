package com.mrabdelaziz.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
public class Facture {
	@Id
	private String numFacture;
	private float montant;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateFacture;
	
	
	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Facture(String numFacture, float montant, Date dateFacture) {
		super();
		this.numFacture = numFacture;
		this.montant = montant;
		this.dateFacture = dateFacture;
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
