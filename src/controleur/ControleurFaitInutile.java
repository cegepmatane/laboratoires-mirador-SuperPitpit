package controleur;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import donnee.FaitInutileDAO;
import modele.FaitInutile;
import vue.VueFaitInutile;
import vue.VueTremblementDeTerre;

public class ControleurFaitInutile extends Controleur {

	public ControleurFaitInutile()
	{
		Logger.logMsg(Logger.INFO, "new ControleurFaitInutile()");
	}
	public void initialiser()
	{
		FaitInutileDAO faitInutileDAO = new FaitInutileDAO();
		VueFaitInutile vue = VueFaitInutile.getInstance();
		
		FaitInutile faitInutile = faitInutileDAO.listerFaitInutile();
		
		vue.afficherfaitInutile(faitInutile.getFait());
		vue.afficherSource(faitInutile.getSource());
		vue.afficherLangue(faitInutile.getLangue());
		vue.afficherUrl(faitInutile.getUrl());
		
		/*
		vue.afficherfaitInutile("fait");
		vue.afficherSource("minecraft.net");
		vue.afficherLangue("fr");
		vue.afficherUrl("https");
		*/
	}

}
