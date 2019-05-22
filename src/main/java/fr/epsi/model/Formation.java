package fr.epsi.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.Formula;

@Entity
@Table(name = "formation")
public class Formation implements Serializable{

	private static final long serialVersionUID = 414920241678807135L;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;
	
	private String libelle;
	
	private Date dateFormation;
	
	@ManyToMany(mappedBy = "formations")
	private List<Pharmacien> pharmaciens;


	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Date getDateFormation() {
		return dateFormation;
	}

	public void setDateFormation(Date dateFormation) {
		this.dateFormation = dateFormation;
	}
	
}
