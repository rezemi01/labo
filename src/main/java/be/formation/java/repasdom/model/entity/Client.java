package be.formation.java.repasdom.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Client extends BaseEntity {

	@Column(nullable=false)
	private String nom;
	
	private String prenom;
	
	private String adresse;
	
	private String gsm;
	
	@Column(nullable=false, unique=true)
	private String email;

	public Client() {
		super();
	}

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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getGsm() {
		return gsm;
	}

	public void setGsm(String gsm) {
		this.gsm = gsm;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
