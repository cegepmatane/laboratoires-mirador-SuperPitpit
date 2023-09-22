
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

import architecture.Controleur;
import architecture.Fenetre;
import controleur.ControleurFaitInutile;
import donnee.AsteroideDAO;
import donnee.FaitInutileDAO;
import donnee.NouvelleDAO;
import donnee.StationSpatialeDAO;
import donnee.TremblementDeTerreDAO;
import modele.Asteroide;
import modele.FaitInutile;
import modele.Nouvelle;
import modele.TremblementDeTerre;
import vue.VueFaitInutile;
import vue.VueMirador;
import vue.VueNouvelles;
import vue.VueTremblementDeTerre;

public class App {

	public static void main(String[] parametres) {
		
		// Refaire la même ligne pour choisir la ligne voulut
		// Controleur.choisirVuePrincipale(VueMirador.class);
		
		//Controleur.choisirVuePrincipale(VueNouvelles.class);
		//Controleur.choisirVuePrincipale(VueJoueurHockeyLigueNationnal.class);
		//Controleur.choisirVuePrincipale(VueGardienHockeyLigueNationnal.class);

		
				
		//NouvelleDAO nouvellesDAO = new NouvelleDAO();
		//List<Nouvelle> nouvelles = nouvellesDAO.listerNouvelle();
		//for(Nouvelle nouvelle : nouvelles) {
		//	System.out.println("Titre : " + nouvelle.getTitre());
		//}
		
		//StationSpatialeDAO sationSpatiale = new StationSpatialeDAO();
		//sationSpatiale.detaillerPosition();
		
		// Test sur les tremblements de terre
		
		/*
		TremblementDeTerreDAO tremblementDeTerreDAO = new TremblementDeTerreDAO();
		List<TremblementDeTerre> tremblementDeTerres = tremblementDeTerreDAO.listerTremblementDeTerre();
		TremblementDeTerre tremblementDeTerre = tremblementDeTerres.get(0);
		System.out.println(tremblementDeTerre.getEmplacement());
		*/
		
		//Controleur.choisirVuePrincipale(VueTremblementDeTerre.class);
		
		
		// Test pour les faits inutiles
		
		/*
		FaitInutileDAO faitInutileDAO = new FaitInutileDAO();
		FaitInutile faitInutile = faitInutileDAO.listerFaitInutile();
		System.out.println(faitInutile.getLangue());
		*/
		
		//Controleur.choisirVuePrincipale(VueFaitInutile.class);
		
		// Tests astéroides
		
		/*
		AsteroideDAO asteroideDAO = new AsteroideDAO();
		List<Asteroide> asteroides = asteroideDAO.listerAsteroide();
		Asteroide asteroide = asteroides.get(0);
		System.out.println(asteroide.getNom());
		*/
		
		//Controleur.choisirVuePrincipale(Vue.class);
		
		
		//Fenetre.launch(Fenetre.class, parametres);
	}

}
