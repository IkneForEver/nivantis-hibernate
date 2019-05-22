package fr.epsi.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "pharmacie")
public class Pharmacie implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;
	
	private String nom;
	
	private String geo_x;
	
	private String geo_y;
	
    @OneToMany(mappedBy = "achat_nivantis", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<AchatNivantis> achatsNivantis;
    
    @OneToMany(mappedBy = "vente_client", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<VenteClient> ventes;
    
    @OneToMany(mappedBy = "reponse", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Reponse> reponses;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getGeo_x() {
		return geo_x;
	}

	public void setGeo_x(String geo_x) {
		this.geo_x = geo_x;
	}

	public String getGeo_y() {
		return geo_y;
	}

	public void setGeo_y(String geo_y) {
		this.geo_y = geo_y;
	}

	public List<AchatNivantis> getAchats() {
		return achatsNivantis;
	}

	public void setAchats(List<AchatNivantis> achats) {
		this.achatsNivantis = achats;
	}

	public List<VenteClient> getVentes() {
		return ventes;
	}

	public void setVentes(List<VenteClient> ventes) {
		this.ventes = ventes;
	}
}
