package controleur;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import vue.VueBitcoin;

public class ControleurBitcoin extends Controleur {

	public ControleurBitcoin()
	{
		Logger.logMsg(Logger.INFO, "new ControleurBitcoin()");
	}
	
	
	public void initialiser()
	{
		
		VueBitcoin vue = VueBitcoin.getInstance();
		vue.afficherCode("CAN");
		vue.afficherSymbole("$");
		vue.afficherTaux((float)32323.33);
		vue.afficherDescription("C'est le dollard canadien");
	}

}
