package controleur;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import modele.JoueurHockeyLigueNationnal;
import vue.VueJoueurHockeyLigueNationnal;


public class ControleurJoueurHockeyLigueNationnal extends Controleur {

	public ControleurJoueurHockeyLigueNationnal()
	{
		Logger.logMsg(Logger.INFO, "new ControleurJoueurHockeyLigueNationnal()");
	}
	public void initialiser()
	{
		
		VueJoueurHockeyLigueNationnal vue = VueJoueurHockeyLigueNationnal.getInstance();
		JoueurHockeyLigueNationnal joueur = new JoueurHockeyLigueNationnal("Brice", 28, 560, 368, 144,244, 74, 57, 17, 40);
		
		
		vue.afficherNomJoueur(joueur.getNom());
		vue.afficherAgeJoueur(joueur.getAge());
		vue.afficherPartiesSaison(joueur.getPartiesJouesSaison());
		vue.afficherPointsSaison(joueur.getPointsCarriereSaison());
		vue.afficherButsSaison(joueur.getButsSaison());
		vue.afficherAssistancesSaison(joueur.getAssistancesSaison());
		vue.afficherPartiesSerie(joueur.getPartiesJouesSerie());
		vue.afficherPointsSerie(joueur.getPointsCarriereSerie());
		vue.afficherButsSerie(joueur.getButsSerie());
		vue.afficherAssistancesSerie(joueur.getAssistancesSerie());
		
		
	}

}


