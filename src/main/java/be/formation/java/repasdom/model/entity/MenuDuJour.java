package be.formation.java.repasdom.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class MenuDuJour extends BaseEntity {
	
	@ManyToOne
	@JoinColumn(name="id_menu", nullable=false)
	private Menu menu;
	
	@ManyToOne
	@JoinColumn(name="id_plat", nullable=false)
	private Plat plat;
	
	@Column(nullable=false)
	private double prix;

	public MenuDuJour() {
		super();
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public Plat getPlat() {
		return plat;
	}

	public void setPlat(Plat plat) {
		this.plat = plat;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	
}
