package fr.epsi.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.Formula;

@Entity
@Table(name = "vente_client")
public class VenteClient implements Serializable{

	private static final long serialVersionUID = 414920241678807135L;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;
	
	private int quantite;
	
	@ManyToOne
	private Produit produit;
	
	@ManyToOne
	private Pharmacie pharmacie;
	
    @Formula("now()")
	private Date dateVente;

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public Date getDateVente() {
		return dateVente;
	}

	public void setDateVente(Date dateAchat) {
		this.dateVente = dateAchat;
	}
	
	
}
