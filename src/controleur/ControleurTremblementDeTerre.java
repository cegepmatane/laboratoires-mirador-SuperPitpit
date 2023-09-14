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
		vue.afficherDate();
	}
	
}
