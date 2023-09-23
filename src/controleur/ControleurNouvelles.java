package controleur;

import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import donnee.NouvelleDAO;
import modele.Nouvelle;
import vue.VueNouvelles;

public class ControleurNouvelles extends Controleur {

	public ControleurNouvelles()
	{
		Logger.logMsg(Logger.INFO, "new ControleurNouvelles()");
	}
	public void initialiser()
	{
		NouvelleDAO nouvellesDAO = new NouvelleDAO();
		List<Nouvelle> nouvelles = nouvellesDAO.listerNouvelle();
		Nouvelle nouvelle = nouvelles.get(0);
		
		VueNouvelles vue = VueNouvelles.getInstance();
		
		vue.afficherTitre(nouvelle.getTitre());
		vue.afficherResume(nouvelle.getResume());
		vue.afficherUrl(nouvelle.getLien());
		
		/*
		vue.afficherTitre("Le prince de New York");
		vue.afficherResume("C'est bien");
		vue.afficherUrl("https");
		*/
	}

}
