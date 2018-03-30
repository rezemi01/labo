package be.formation.java.repasdom.model.entity;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Menu extends BaseEntity {

	@Column(nullable=false, unique=true)
	private String nom;
	
	private String description;
	
	private String imageUrl;
	
	@Column(nullable=false, unique=true)
	private LocalDate date;
	
	@OneToMany(mappedBy = "menu")
	private Set<MenuDuJour> menuDuJour = new HashSet(0);

	public Menu() {
		super();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Set<MenuDuJour> getMenuDuJour() {
		return menuDuJour;
	}

	public void setMenuDuJour(Set<MenuDuJour> menuDuJour) {
		this.menuDuJour = menuDuJour;
	}

}
