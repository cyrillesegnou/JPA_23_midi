package fr.gtm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table (name ="personnes")
@NamedQuery(name = "Contact.findByNomLike", query = 
"SELECT c FROM Contact c WHERE c.nom LIKE :nom")
public class Contact {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@ Column(name = "pk")
	private long id ;
	@Column(length = 10)
	@Enumerated(EnumType.STRING)
	
	private Civilite civilite ;

	
	private String nom ;
	private String prenom ;
	
	public Contact () {}
	
	
	public Contact(Civilite civilite, String nom, String prenom) {
	
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
	public Civilite getCivilite() {
		return civilite;
	}
	public void setCivilite(Civilite civilite) {
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
		return "Contact [id=" + id + ", civilite=" + civilite + ", nom=" + nom + ", prenom=" + prenom +"]";
	}
	
}
