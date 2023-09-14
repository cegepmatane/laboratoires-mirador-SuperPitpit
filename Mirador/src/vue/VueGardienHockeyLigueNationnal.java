package vue;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurGardienHockeyLigueNationnal;
import javafx.scene.control.Label;

public class VueGardienHockeyLigueNationnal extends Vue {
	
	protected ControleurGardienHockeyLigueNationnal controleur;
	protected static VueGardienHockeyLigueNationnal instance = null; 
	public static VueGardienHockeyLigueNationnal getInstance() {if(null==instance)instance = new VueGardienHockeyLigueNationnal();return VueGardienHockeyLigueNationnal.instance;}; 

	private VueGardienHockeyLigueNationnal() {
		super("gardienHockeyLigueNationnal.fxml", VueGardienHockeyLigueNationnal.class);
		Logger.logMsg(Logger.INFO, "new VueGardienHockeyLigueNationnal()");
		super.controleur = this.controleur = new ControleurGardienHockeyLigueNationnal();
	}
	
	public void afficherNomGardien(String nom) {
		Label labelNomGardien = (Label)lookup("#nomJoueur");
		labelNomGardien.setText("Nom : " + nom);
	}
	
	public void afficherAgeGardien(int age) {
		Label labelAgeGardien = (Label)lookup("#ageJoueur");
		labelAgeGardien.setText("Age : " + age);
	}
	
	// Informations sur le hockey 
	
	public void afficherPartiesSaison(int parties) {
		Label labelPartiesSaison = (Label)lookup("#partiesSaison");
		labelPartiesSaison.setText("Parties jouées dans sa carrière : " + parties);
	}
	
	public void afficherPartiesSerie(int parties) {
		Label labelPartiesSerie = (Label)lookup("#partiesSerie");
		labelPartiesSerie.setText("Parties jouées dans sa carrière : " + parties);
	}
	
	public void afficherPourcentageArret(float pourcentage) {
		Label labelPourcentageArret = (Label)lookup("#pourcentageArret");
		labelPourcentageArret.setText("Moyenne de pourcentage d'arrêt : " + pourcentage);
	}
	
	public void afficherMoyenneButsAccordes(float moyenne) {
		Label labelMoyenneButsAccordes = (Label)lookup("#butAccordes");
		labelMoyenneButsAccordes.setText("Moyenne de pourcentage d'arrêt : " + moyenne);
	}
	
}
