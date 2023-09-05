package modele;

import java.awt.Image;

public class Nouvelles {
	
	protected String titre;
	protected String auteur;
	protected String date; // TODO : ajuster type date
	
	protected String resume;
	
	protected String lien;
	protected Image illustration;
	
	
	public Nouvelles() {
		super();
	}
	
	public Nouvelles(String titre, String auteur) {
		super();
		this.titre = titre;
		this.auteur = auteur;
	}

	public Nouvelles(String titre, String auteur, String date) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.date = date;
	}

	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	public String getLien() {
		return lien;
	}
	public void setLien(String lien) {
		this.lien = lien;
	}
	public Image getIllustration() {
		return illustration;
	}
	public void setIllustration(Image illustration) {
		this.illustration = illustration;
	}
}
