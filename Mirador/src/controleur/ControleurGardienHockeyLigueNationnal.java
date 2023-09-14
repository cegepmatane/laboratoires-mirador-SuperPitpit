package controleur;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import modele.GardienHockeyLigueNationnal;
import vue.VueGardienHockeyLigueNationnal;
import vue.VueJoueurHockeyLigueNationnal;

public class ControleurGardienHockeyLigueNationnal extends Controleur {

	public ControleurGardienHockeyLigueNationnal()
	{
		Logger.logMsg(Logger.INFO, "new ControleurGardienHockeyLigueNationnal()");
	}
	public void initialiser()
	{
		
		VueGardienHockeyLigueNationnal vue = VueGardienHockeyLigueNationnal.getInstance();
		GardienHockeyLigueNationnal gardien = new GardienHockeyLigueNationnal("Marco", 29, 679, 139, (float)0.932, (float)1.86);
		
		vue.afficherNomGardien(gardien.getNom());
		vue.afficherAgeGardien(gardien.getAge());
		vue.afficherPartiesSaison(gardien.getPartiesJouesSaison());
		vue.afficherPartiesSerie(gardien.getPartiesJouesSerie());
		vue.afficherPourcentageArret(gardien.getPourcentageArrets());
		vue.afficherMoyenneButsAccordes(gardien.getButsAccordesParParties());
		
	}

	
}
