package fr.epsi.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.Formula;

@Entity
@Table(name = "formulaire")
public class Formulaire implements Serializable{

	private static final long serialVersionUID = 414920241678807135L;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;
	
	private String nom;
	
    @OneToMany(mappedBy = "question", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Question> questions;
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
