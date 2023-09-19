package controleur;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import vue.VueTremblementDeTerre;

public class ControleurTremblementDeTerre extends Controleur {

	public ControleurTremblementDeTerre() {
		
		Logger.logMsg(Logger.INFO, "new ControleurTremblementDeTerre()");
		
	}

	
	public void initialiser(){
		
		VueTremblementDeTerre vue = VueTremblementDeTerre.getInstance();
		
		vue.afficherEmplacement("Tonga");
		vue.afficherMagnitude(5);
		vue.afficherDate("23/09/2023");
		vue.afficherLongitude((float)-2.333);
		vue.afficherLatitude((float)4.32323);
		
	}
	
}
