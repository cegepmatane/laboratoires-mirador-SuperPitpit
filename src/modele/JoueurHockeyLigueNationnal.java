package modele;

public class JoueurHockeyLigueNationnal {

	protected String nom;
	protected int age;
	
	protected int pointsCarriereSaison;
	protected int partiesJoueesSaison;
	protected int butsSaison;
	protected int assistancesSaison;
	
	protected int pointsCarriereSerie;
	protected int partiesJoueesSerie;
	protected int butsSerie;
	protected int assistancesSerie;
	
	
	
	
	public JoueurHockeyLigueNationnal() {
		super();
	}
	
	public JoueurHockeyLigueNationnal(String nom, int age, int partiesJoueesSaison, int pointsCarriereSaison,
			int butsSaison, int assistancesSaison, int partiesJoueesSerie, int pointsCarriereSerie, int butsSerie,
			int assistancesSerie) {
		super();
		this.nom = nom;
		this.age = age;
		this.pointsCarriereSaison = pointsCarriereSaison;
		this.partiesJoueesSaison = partiesJoueesSaison;
		this.butsSaison = butsSaison;
		this.assistancesSaison = assistancesSaison;
		this.pointsCarriereSerie = pointsCarriereSerie;
		this.partiesJoueesSerie = partiesJoueesSerie;
		this.butsSerie = butsSerie;
		this.assistancesSerie = assistancesSerie;
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
	public int getPointsCarriereSaison() {
		return pointsCarriereSaison;
	}
	public void setPointsCarriereSaison(int pointsCarriereSaison) {
		this.pointsCarriereSaison = pointsCarriereSaison;
	}
	public int getPartiesJouesSaison() {
		return partiesJoueesSaison;
	}
	public void setPartiesJouesSaison(int partiesJouesSaison) {
		this.partiesJoueesSaison = partiesJouesSaison;
	}
	public int getButsSaison() {
		return butsSaison;
	}
	public void setButsSaison(int butsSaison) {
		this.butsSaison = butsSaison;
	}
	public int getAssistancesSaison() {
		return assistancesSaison;
	}
	public void setAssistancesSaison(int assistancesSaison) {
		this.assistancesSaison = assistancesSaison;
	}
	public int getPointsCarriereSerie() {
		return pointsCarriereSerie;
	}
	public void setPointsCarriereSerie(int pointsCarriereSerie) {
		this.pointsCarriereSerie = pointsCarriereSerie;
	}
	public int getPartiesJouesSerie() {
		return partiesJoueesSerie;
	}
	public void setPartiesJouesSerie(int partiesJouesSerie) {
		this.partiesJoueesSerie = partiesJouesSerie;
	}
	public int getButsSerie() {
		return butsSerie;
	}
	public void setButsSerie(int butsSerie) {
		this.butsSerie = butsSerie;
	}
	public int getAssistancesSerie() {
		return assistancesSerie;
	}
	public void setAssistancesSerie(int assistancesSerie) {
		this.assistancesSerie = assistancesSerie;
	}
	
	
}
