
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
import donnee.BitcoinDAO;
import donnee.FaitInutileDAO;
import donnee.NouvelleDAO;
import donnee.TremblementDeTerreDAO;
import modele.Asteroide;
import modele.Bitcoin;
import modele.FaitInutile;
import modele.Nouvelle;
import modele.TremblementDeTerre;
import vue.VueAsteroide;
import vue.VueBitcoin;
import vue.VueFaitInutile;
import vue.VueNouvelles;
import vue.VueTremblementDeTerre;

public class App {

	public static void main(String[] parametres) {
		
		
		// Controleur.choisirVuePrincipale(VueMirador.class);
		
		//Controleur.choisirVuePrincipale(VueJoueurHockeyLigueNationnal.class);
		//Controleur.choisirVuePrincipale(VueGardienHockeyLigueNationnal.class);
		//StationSpatialeDAO sationSpatiale = new StationSpatialeDAO();
		//sationSpatiale.detaillerPosition();
		
		/*
		NouvelleDAO nouvellesDAO = new NouvelleDAO();
		List<Nouvelle> nouvelles = nouvellesDAO.listerNouvelle();
		for(Nouvelle nouvelle : nouvelles) {
			System.out.println("Titre : " + nouvelle.getTitre());
			System.out.println("Url : " + nouvelle.getLien());
			System.out.println("Description : " + nouvelle.getResume());
		}*/
		
		//Controleur.choisirVuePrincipale(VueNouvelles.class);
		
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
		
		//Controleur.choisirVuePrincipale(VueAsteroide.class);
		
		// Tests bitcoin
		
		/*
		BitcoinDAO bitcoinDAO = new BitcoinDAO();
		List<Bitcoin> monnaies = bitcoinDAO.listerMonnaie();
		Bitcoin monnaie = monnaies.get(0);
		System.out.println(monnaie.getCode());
		*/
		
		//Controleur.choisirVuePrincipale(VueBitcoin.class);
		
		//Fenetre.launch(Fenetre.class, parametres);
		
		// Design pattern Template
		TremblementDeTerreDAO tremblementDeTerreDAO = new TremblementDeTerreDAO();
		List<TremblementDeTerre> tremblementDeTerres = tremblementDeTerreDAO.listerTremblementDeTerre();
		
		ChercheurTremblementDeTerre chercheurTremblementDeTerre = new ChercheurTremblementDeTerre();
		chercheurTremblementDeTerre.executer();
		
		/*
		for (TremblementDeTerre tremblementDeTerre:tremblementDeTerres) {
			
			//System.out.println(tremblementDeTerre.getMagnitude());
			
		}*/
		
		
	}

}
