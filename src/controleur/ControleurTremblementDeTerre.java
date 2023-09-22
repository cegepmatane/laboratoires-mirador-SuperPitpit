package controleur;

import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import donnee.TremblementDeTerreDAO;
import modele.TremblementDeTerre;
import vue.VueTremblementDeTerre;

public class ControleurTremblementDeTerre extends Controleur {

	public ControleurTremblementDeTerre() {
		
		Logger.logMsg(Logger.INFO, "new ControleurTremblementDeTerre()");
		
	}

	
	public void initialiser(){
		
		TremblementDeTerreDAO tremblementDeTerreDAO = new TremblementDeTerreDAO();
		List<TremblementDeTerre> tremblementDeTerres = tremblementDeTerreDAO.listerTremblementDeTerre();
		TremblementDeTerre tremblementDeTerre = tremblementDeTerres.get(0);
		
		
		VueTremblementDeTerre vue = VueTremblementDeTerre.getInstance();
		
		vue.afficherEmplacement(tremblementDeTerre.getEmplacement());
		vue.afficherMagnitude(tremblementDeTerre.getMagnitude());
		vue.afficherDate(tremblementDeTerre.getDate());
		vue.afficherLongitude(tremblementDeTerre.getLongitude());
		vue.afficherLatitude(tremblementDeTerre.getLatitude());
		
		
		/*
		vue.afficherEmplacement("Tonga");
		vue.afficherMagnitude(5);
		vue.afficherDate("23/09/2023");
		vue.afficherLongitude((float)-2.333);
		vue.afficherLatitude((float)4.32323);
		*/
		
		
	}
	
}
