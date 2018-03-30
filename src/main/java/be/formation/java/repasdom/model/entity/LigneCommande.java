package be.formation.java.repasdom.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneCommande extends BaseEntity {

	@ManyToOne
	@JoinColumn(name="id_plat", nullable=false)
	private Plat plat;
	
	@ManyToOne
	@JoinColumn(name="id_commande", nullable=false)
	private Commande commande;
	
	@Column(nullable=false)
	private int quantite;

	public LigneCommande() {
		super();
	}

	public Plat getPlat() {
		return plat;
	}

	public void setPlat(Plat plat) {
		this.plat = plat;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	
	
}
