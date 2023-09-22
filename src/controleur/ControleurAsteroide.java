package controleur;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import vue.VueAsteroide;

public class ControleurAsteroide extends Controleur {

	public ControleurAsteroide()
	{
		Logger.logMsg(Logger.INFO, "new ControleurAsteroide()");
	}
	
	
	public void initialiser()
	{
		
		VueAsteroide vue = VueAsteroide.getInstance();
		
		
		
		/*
		vue.afficherNom("Roch");
		vue.afficherClassification("métal");
		vue.afficherChute("fall");
		vue.afficherMasse((float)2.4452);
		vue.afficherDate(1960-01-01T00:00:00); 
		*/
		
	}

}
