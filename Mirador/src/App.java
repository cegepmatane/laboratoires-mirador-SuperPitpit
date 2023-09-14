
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

import architecture.Controleur;
import architecture.Fenetre;
import donnee.NouvelleDAO;
import donnee.StationSpatialeDAO;
import modele.Nouvelle;
import vue.VueGardienHockeyLigueNationnal;
import vue.VueJoueurHockeyLigueNationnal;
import vue.VueMirador;
import vue.VueNouvelles;

public class App {

	public static void main(String[] parametres) {
		
		// Refaire la même ligne pour choisir la ligne voulut
		// Controleur.choisirVuePrincipale(VueMirador.class);
		
		//Controleur.choisirVuePrincipale(VueNouvelles.class);
		Controleur.choisirVuePrincipale(VueJoueurHockeyLigueNationnal.class);
		//Controleur.choisirVuePrincipale(VueGardienHockeyLigueNationnal.class);

		
				
		//NouvelleDAO nouvellesDAO = new NouvelleDAO();
		//List<Nouvelle> nouvelles = nouvellesDAO.listerNouvelle();
		//for(Nouvelle nouvelle : nouvelles) {
		//	System.out.println("Titre : " + nouvelle.getTitre());
		//}
		
		//StationSpatialeDAO sationSpatiale = new StationSpatialeDAO();
		//sationSpatiale.detaillerPosition();
				
		Fenetre.launch(Fenetre.class, parametres);	
	}

}
