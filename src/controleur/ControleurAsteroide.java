package controleur;

import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import donnee.AsteroideDAO;
import modele.Asteroide;
import vue.VueAsteroide;

public class ControleurAsteroide extends Controleur {

	public ControleurAsteroide()
	{
		Logger.logMsg(Logger.INFO, "new ControleurAsteroide()");
	}
	
	
	public void initialiser()
	{
		AsteroideDAO asteroideDAO = new AsteroideDAO();
		VueAsteroide vue = VueAsteroide.getInstance();
		
		List<Asteroide> asteroides = asteroideDAO.listerAsteroide();
		Asteroide asteroide = asteroides.get(0);
		
		vue.afficherNom(asteroide.getNom());
		vue.afficherClassification(asteroide.getClassification());
		vue.afficherChute(asteroide.getChute());
		vue.afficherMasse(asteroide.getMasse());
		vue.afficherDate(asteroide.getDate()); 
		
		/*
		vue.afficherNom("Roch");
		vue.afficherClassification("métal");
		vue.afficherChute("fall");
		vue.afficherMasse((float)2.4452);
		vue.afficherDate(1960-01-01T00:00:00); 
		*/
		
	}

}
