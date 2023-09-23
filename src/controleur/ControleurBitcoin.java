package controleur;

import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import donnee.BitcoinDAO;
import modele.Bitcoin;
import vue.VueBitcoin;

public class ControleurBitcoin extends Controleur {

	public ControleurBitcoin()
	{
		Logger.logMsg(Logger.INFO, "new ControleurBitcoin()");
	}
	
	
	public void initialiser()
	{
		BitcoinDAO bitcoinDAO = new BitcoinDAO();
		List<Bitcoin> monnaies = bitcoinDAO.listerMonnaie();
		Bitcoin monnaie = monnaies.get(0);
		// System.out.println(monnaie.getCode());
		
		VueBitcoin vue = VueBitcoin.getInstance();
		
		vue.afficherCode(monnaie.getCode());
		vue.afficherSymbole(monnaie.getSymbole());
		vue.afficherTaux(monnaie.getTaux());
		vue.afficherDescription(monnaie.getDescription());
		
		/*
		vue.afficherCode("CAN");
		vue.afficherSymbole("$");
		vue.afficherTaux((float)32323.33);
		vue.afficherDescription("C'est le dollard canadien");
		*/
	}

}
