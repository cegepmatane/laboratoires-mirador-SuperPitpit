package controleur;

import java.util.ArrayList;
import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import modele.Nouvelle;
import modele.StatistiquesMeteores;
import vue.VueMirador;

public class ControleurMirador extends Controleur{

	public ControleurMirador()
	{
		Logger.logMsg(Logger.INFO, "new ControleurMirador()");
	}
	
	public void initialiser()
	{
		
		VueMirador vue = VueMirador.getInstance();
		
		int nombreAstraunautes = 5;
		VueMirador.getInstance().afficherNombreAstronautes(nombreAstraunautes);
		StatistiquesMeteores statistiquesMeteores = new StatistiquesMeteores(20, 4000, 500);
		
		
		vue.afficherStatistiquesMeteores(statistiquesMeteores);
		
		Nouvelle nouvelle1 = new Nouvelle("The Bald Guy","Jean Paule Hypolite", "Le 23 septembre 2024");
		Nouvelle nouvelle2 = new Nouvelle("The Fat Guy", "Jean Paule Hypolite", "Le 34 septembre 2045");
		Nouvelle nouvelle3 = new Nouvelle("The Poor Guy", "Jean Paule Hypolite", "Le 11 septembre 2001");
		
		List<Nouvelle> listeNouvelles = new ArrayList<Nouvelle>();
		listeNouvelles.add(nouvelle1);
		listeNouvelles.add(nouvelle2);
		listeNouvelles.add(nouvelle3);
		
		vue.afficherNouvelles(listeNouvelles);
;	}

}
