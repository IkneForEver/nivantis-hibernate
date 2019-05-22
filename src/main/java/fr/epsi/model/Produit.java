package fr.epsi.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "produit")
public class Produit implements Serializable{

	private static final long serialVersionUID = 414920241678807135L;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;
	
	private String label;
	
	private float prixNet;
	
    @OneToMany(mappedBy = "vente_client", fetch = FetchType.EAGER)
	private List<VenteClient> ventesClient;
    
    @OneToMany(mappedBy = "achat_nivantis", fetch = FetchType.EAGER)
   	private List<AchatNivantis> achatsNivantis;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public float getPrixNet() {
		return prixNet;
	}

	public void setPrixNet(float prixNet) {
		this.prixNet = prixNet;
	}
}
