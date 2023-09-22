package controleur;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import vue.VueFaitInutile;
import vue.VueTremblementDeTerre;

public class ControleurFaitInutile extends Controleur {

	public ControleurFaitInutile()
	{
		Logger.logMsg(Logger.INFO, "new ControleurFaitInutile()");
	}
	public void initialiser()
	{
		
		VueFaitInutile vue = VueFaitInutile.getInstance();
		vue.afficherfaitInutile("fait");
		vue.afficherSource("minecraft.net");
		vue.afficherLangue("fr");
		vue.afficherUrl("https");
	}

}
