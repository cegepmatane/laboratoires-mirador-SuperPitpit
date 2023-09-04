package vue;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurJoueurHockeyLigueNationnal;

public class VueJoueurHockeyLigueNationnal extends Vue {
	
	protected ControleurJoueurHockeyLigueNationnal controleur = null;
	protected static VueJoueurHockeyLigueNationnal instance = null; 
	public static VueJoueurHockeyLigueNationnal getInstance() {if(null==instance)instance = new VueJoueurHockeyLigueNationnal();return VueJoueurHockeyLigueNationnal.instance;}; 
	
	private VueJoueurHockeyLigueNationnal()  {
		super("joueurHockeyLigueNationnal.fxml", VueJoueurHockeyLigueNationnal.class);
		Logger.logMsg(Logger.INFO, "new VueJoueurHockeyLigueNationnal()");
		super.controleur = this.controleur = new ControleurJoueurHockeyLigueNationnal();
	}
	
}
