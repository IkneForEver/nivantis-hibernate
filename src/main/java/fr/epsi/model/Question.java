package fr.epsi.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.Formula;

@Entity
@Table(name = "formulaire")
public class Question implements Serializable{

	private static final long serialVersionUID = 414920241678807135L;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;
	
	private String libelle;
	
	private Boolean ouverte;
	
	private Boolean choixMultiple;
	
	@ManyToOne
	private Formulaire formulaire;

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Boolean getOuverte() {
		return ouverte;
	}

	public void setOuverte(Boolean ouverte) {
		this.ouverte = ouverte;
	}

	public Boolean getChoixMultiple() {
		return choixMultiple;
	}

	public void setChoixMultiple(Boolean choixMultiple) {
		this.choixMultiple = choixMultiple;
	}
}
