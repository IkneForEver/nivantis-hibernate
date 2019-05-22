package fr.epsi.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.Formula;

@Entity
@Table(name = "achat_nivantis")
public class AchatNivantis implements Serializable{

	private static final long serialVersionUID = 414920241678807135L;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;
	
	@ManyToOne
	private Produit produit;
	
	@ManyToOne
	private Pharmacie pharmacie;
	
	private int quantite;
	
    @Formula("now()")
	private Date dateAchat;

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public Date getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}
	
	
}
