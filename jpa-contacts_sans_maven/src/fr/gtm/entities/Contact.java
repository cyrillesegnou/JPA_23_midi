package fr.gtm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="personnes")

public class Contact {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@ Column(name = "pk")
	private long id ;
	private String civilite ;
	
	private String nom ;
	private String prenom ;
	
	public Contact () {}
	
	
	public Contact(String civilite, String nom, String prenom) {
	
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCivilite() {
		return civilite;
	}
	public void setCivilite(String civilite) {
		this.civilite = civilite;
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
	@Override
	public String toString() {
		return "Contact [id=" + id + ", civilite=" + civilite + ", nom=" + nom + ", prenom=" + prenom + ", getId()="
				+ getId() + ", getCivilite()=" + getCivilite() + ", getNom()=" + getNom() + ", getPrenom()="
				+ getPrenom() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
