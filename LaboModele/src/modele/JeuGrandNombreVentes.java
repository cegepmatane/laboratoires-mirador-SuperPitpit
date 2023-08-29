package modele;

public class JeuGrandNombreVentes {

	protected String nom;
	protected int dateParution;
	protected int nombreCopiesVendues;
	protected int nombreLanguesTraduction;
	protected int pourcentageAppreciation;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getDateParution() {
		return dateParution;
	}
	public void setDateParution(int dateParution) {
		this.dateParution = dateParution;
	}
	public int getNombreCopiesVendues() {
		return nombreCopiesVendues;
	}
	public void setNombreCopiesVendues(int nombreCopiesVendues) {
		this.nombreCopiesVendues = nombreCopiesVendues;
	}
	public int getNombreLanguesTraduction() {
		return nombreLanguesTraduction;
	}
	public void setNombreLanguesTraduction(int nombreLanguesTraduction) {
		this.nombreLanguesTraduction = nombreLanguesTraduction;
	}
	public int getPourcentageAppreciation() {
		return pourcentageAppreciation;
	}
	public void setPourcentageAppreciation(int pourcentageAppreciation) {
		this.pourcentageAppreciation = pourcentageAppreciation;
	}
	
}
