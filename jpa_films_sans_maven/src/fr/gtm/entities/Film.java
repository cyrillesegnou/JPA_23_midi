package fr.gtm.entities;

import java.util.Date;

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
@Table (name ="films")
@NamedQuery(name = "Film.findByTitreLike", query = 
"SELECT f FROM Film f WHERE f.titre LIKE :titre")

public class Film {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)

	@ Column(name = "fk_categorie")
	private long id ;
	@ Column(name = "prixht")
	private double prix ;
	@ Column(name = "titre")
	private String titre ;
	@ Column(name = "duree")
	private int duree ;
	@ Column(name= "date_sortie")
	private Date dateSortie ;
	
	public Film() {}
	public Film(double prix, String titre, int duree, Date dateSortie) {
	
		this.prix = prix;
		this.titre = titre;
		this.duree = duree;
		this.dateSortie = dateSortie;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public int getDuree() {
		return duree;	
		
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public Date getDateSortie() {
		return dateSortie;
	}
	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}
	@Override
	public String toString() {
		return "Films [id=" + id + ", prix=" + prix + ", titre=" + titre + ", duree=" + duree + ", dateSortie="
				+ dateSortie + "]";
	}
	}