package com.mrabdelaziz.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Cartecredit implements Serializable {
	@Id
	@Column(name = "numCarte")
	private String numCarte;

	//bi-directional many-to-one association to Proprietaire
	@ManyToOne
	@JoinColumn(name="idProprietaire")
	private Proprietaire proprietaire;

	public Cartecredit() {
	}

	
	
	public Cartecredit(String numCarte, Proprietaire proprietaire) {
		super();
		this.numCarte = numCarte;
		this.proprietaire = proprietaire;
	}



	public String getNumCarte() {
		return this.numCarte;
	}

	public void setNumCarte(String numCarte) {
		this.numCarte = numCarte;
	}

	public Proprietaire getProprietaire() {
		return this.proprietaire;
	}

	public void setProprietaire(Proprietaire proprietaire) {
		this.proprietaire = proprietaire;
	}

}
