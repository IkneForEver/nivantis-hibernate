package fr.epsi.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "dmo")
public class Dmo implements Serializable{

	private static final long serialVersionUID = 414920241678807135L;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;
	
	private String nom;
	
	private String prenom;
	
	private String identifiant;
	
	private String mdp;

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

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	
	

}
