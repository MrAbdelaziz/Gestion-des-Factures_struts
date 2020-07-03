package com.mrabdelaziz.model;

import java.io.Serializable;



public class Cartecredit implements Serializable {
	//private static final long serialVersionUID = 1L;

	//@Id
	private String numCarte;

	//bi-directional many-to-one association to Proprietaire
	//@ManyToOne
	//@JoinColumn(name="idProprietaire")
	private Proprietaire proprietaire;

	public Cartecredit(String numCarte, Proprietaire proprietaire) {
		super();
		this.numCarte = numCarte;
		this.proprietaire = proprietaire;
	}

	public Cartecredit() {
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
