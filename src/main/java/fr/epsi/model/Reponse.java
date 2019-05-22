package fr.epsi.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "reponse")
public class Reponse implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;
	
	private String libelle;
	
	@ManyToOne
	private Pharmacie pharmacie;
	
	@ManyToOne
	private Question question;

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
}
