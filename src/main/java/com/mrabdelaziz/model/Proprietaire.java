package com.mrabdelaziz.model;

import java.io.Serializable;

public class Proprietaire implements Serializable {
	//private static final long serialVersionUID = 1L;
	
	private int id;
	private String nom,prenom;
	
	public Proprietaire() {
		super();
	}
	
	
	

	public Proprietaire(int id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	

}
