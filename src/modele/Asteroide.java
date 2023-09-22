package modele;

import java.time.LocalDateTime;

public class Asteroide {

	protected String nom;
	protected String classification;
	protected String chute;
	protected float masse;
	protected LocalDateTime date;
	
	
	public Asteroide() {
		
	}


	public Asteroide(String nom, String classification, String chute, float masse, LocalDateTime date) {
		super();
		this.nom = nom;
		this.classification = classification;
		this.chute = chute;
		this.masse = masse;
		this.date = date;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getClassification() {
		return classification;
	}


	public void setClassification(String classification) {
		this.classification = classification;
	}


	public String getChute() {
		return chute;
	}


	public void setChute(String chute) {
		this.chute = chute;
	}


	public float getMasse() {
		return masse;
	}


	public void setMasse(float masse) {
		this.masse = masse;
	}


	public LocalDateTime getDate() {
		return date;
	}


	public void setDate(LocalDateTime date) {
		this.date = date;
	}

}
