package controleur;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;

public class ControleurLigueHockey extends Controleur {

	public ControleurLigueHockey()
	{
		Logger.logMsg(Logger.INFO, "new ControleurLigueHockey()");
	}

	public void initialiser()
	{
	}

	
	public void notifierActionConvertir()
	{
		Logger.logMsg(Logger.INFO, "ControleurLigueHockey.notifierActionConvertir()");
	}
	
}
