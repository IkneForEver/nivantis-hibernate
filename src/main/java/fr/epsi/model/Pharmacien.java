package fr.epsi.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "pharmacien")
public class Pharmacien implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;
	
	private String nom;
	
	private String prenom;
	
	@ManyToOne
	private Pharmacie pharmacie;
	
	@ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "formation_pharmacien", joinColumns = {@JoinColumn(name = "id_pharmacien")}, inverseJoinColumns = {@JoinColumn(name = "id_formation")})
    private List<Formation> formations;
	
	
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

	public Pharmacie getPharmacie() {
		return pharmacie;
	}

	public void setPharmacie(Pharmacie pharmacie) {
		this.pharmacie = pharmacie;
	}
}
