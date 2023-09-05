package modele;

public class GardienHockeyLigueNationnal {

	protected String nom;
	protected int age;
	protected int partiesJouesSaison;
	protected int partiesJouesSerie;
	protected float pourcentageArrets;
	protected float butsAccordesParParties;
	
	public int getPartiesJouesSerie() {
		return partiesJouesSerie;
	}
	public void setPartiesJouesSerie(int partiesJouesSerie) {
		this.partiesJouesSerie = partiesJouesSerie;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPartiesJouesSaison() {
		return partiesJouesSaison;
	}
	public void setPartiesJouesSaison(int partiesJouesSaison) {
		this.partiesJouesSaison = partiesJouesSaison;
	}
	public float getPourcentageArrets() {
		return pourcentageArrets;
	}
	public void setPourcentageArrets(float pourcentageArrets) {
		this.pourcentageArrets = pourcentageArrets;
	}
	public float getButsAccordesParParties() {
		return butsAccordesParParties;
	}
	public void setButsAccordesParParties(float butsAccordesParParties) {
		this.butsAccordesParParties = butsAccordesParParties;
	}
	
	
}
