package modele;

public class LigueHockey {

	protected String nom;
	protected String pays;
	protected String qualitéJoueurs;
	protected int nombreJoueurs;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getQualitéJoueurs() {
		return qualitéJoueurs;
	}
	public void setQualitéJoueurs(String qualitéJoueurs) {
		this.qualitéJoueurs = qualitéJoueurs;
	}
	public int getNombreJoueurs() {
		return nombreJoueurs;
	}
	public void setNombreJoueurs(int nombreJoueurs) {
		this.nombreJoueurs = nombreJoueurs;
	}
	public int getAnneeOuverture() {
		return anneeOuverture;
	}
	public void setAnneeOuverture(int anneeOuverture) {
		this.anneeOuverture = anneeOuverture;
	}
	protected int anneeOuverture;
	
}
