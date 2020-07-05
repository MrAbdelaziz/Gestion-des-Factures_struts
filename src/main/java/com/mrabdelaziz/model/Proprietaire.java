package com.mrabdelaziz.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Proprietaire implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String nom,prenom;

	//bi-directional many-to-one association to Cartecredit
	@OneToMany(mappedBy="proprietaire", fetch=FetchType.EAGER)
	private List<Cartecredit> cartecredits;

	public Proprietaire() {
	}


	public Proprietaire(int id, String nom, String prenom, List<Cartecredit> cartecredits) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.cartecredits = cartecredits;
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



	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public List<Cartecredit> getCartecredits() {
		return this.cartecredits;
	}

	public void setCartecredits(List<Cartecredit> cartecredits) {
		this.cartecredits = cartecredits;
	}

	public Cartecredit addCartecredit(Cartecredit cartecredit) {
		getCartecredits().add(cartecredit);
		cartecredit.setProprietaire(this);

		return cartecredit;
	}

	public Cartecredit removeCartecredit(Cartecredit cartecredit) {
		getCartecredits().remove(cartecredit);
		cartecredit.setProprietaire(null);

		return cartecredit;
	}


	@Override
	public String toString() {
		return "[nom=" + nom + ", prenom=" + prenom + "]";
	}

	

}
