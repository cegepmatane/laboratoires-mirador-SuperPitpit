package vue;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurJoueurHockeyLigueNationnal;
import javafx.scene.control.Label;

public class VueJoueurHockeyLigueNationnal extends Vue {
	
	protected ControleurJoueurHockeyLigueNationnal controleur = null;
	protected static VueJoueurHockeyLigueNationnal instance = null; 
	public static VueJoueurHockeyLigueNationnal getInstance() {if(null==instance)instance = new VueJoueurHockeyLigueNationnal();return VueJoueurHockeyLigueNationnal.instance;}; 
	
	private VueJoueurHockeyLigueNationnal()  {
		super("joueurHockeyLigueNationnal.fxml", VueJoueurHockeyLigueNationnal.class);
		Logger.logMsg(Logger.INFO, "new VueJoueurHockeyLigueNationnal()");
		super.controleur = this.controleur = new ControleurJoueurHockeyLigueNationnal();
	}
	
	// Nom et age du joueur
	
	public void afficherNomJoueur(String nom) {
		Label labelNomJoueur = (Label)lookup("#nomJoueur");
		labelNomJoueur.setText("Nom : " + nom);
	}
	
	public void afficherAgeJoueur(int age) {
		Label labelAgeJoueur = (Label)lookup("#ageJoueur");
		labelAgeJoueur.setText("Age : " + age);
	}
	
	// Saison
	
	public void afficherPartiesSaison(int parties) {
		Label labelPartiesSaison = (Label)lookup("#partiesSaison");
		labelPartiesSaison.setText("Parties jouées dans sa carrière : " + parties);
	}
		
	public void afficherPointsSaison(int points) {
		Label labelPointsSaison = (Label)lookup("#pointsSaison");
		labelPointsSaison.setText("Points faits durant sa carrière : " + points);
	}
	
	public void afficherButsSaison(int buts) {
		Label labelButsSaison = (Label)lookup("#butsSaison");
		labelButsSaison.setText("Buts marqués durant sa carrière : " + buts);	
	}
	
	public void afficherAssistancesSaison(int assistances) {
		Label labelAssistancesSaison = (Label)lookup("#assistancesSaison");
		labelAssistancesSaison.setText("Assistances faites durant sa carrière : " + assistances);
	}
	
	// Série
	
	public void afficherPartiesSerie(int parties) {
		Label labelPartiesSerie = (Label)lookup("#partiesSerie");
		labelPartiesSerie.setText("Parties jouées dans sa carrière : " + parties);
	}
		
	public void afficherPointsSerie(int points) {
		Label labelPointsSerie = (Label)lookup("#pointsSerie");
		labelPointsSerie.setText("Points faits durant sa carrière : " + points);
	}
	
	public void afficherButsSerie(int buts) {
		Label labelButsSerie = (Label)lookup("#butsSerie");
		labelButsSerie.setText("Buts marqués durant sa carrière : " + buts);	
	}
	
	public void afficherAssistancesSerie(int assistances) {
		Label labelAssistancesSerie = (Label)lookup("#assistancesSerie");
		labelAssistancesSerie.setText("Assistances faites durant sa carrière : " + assistances);
	}
	
}
