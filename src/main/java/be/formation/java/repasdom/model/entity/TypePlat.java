package be.formation.java.repasdom.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class TypePlat extends BaseEntity {
	
	@Column(nullable=false, unique=true)
	private String libelle;
	
	@Column
	private String description;

	public TypePlat() {
		super();
	}	
	
	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
