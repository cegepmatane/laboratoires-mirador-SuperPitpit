package vue;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurGardienHockeyLigueNationnal;

public class VueGardienHockeyLigueNationnal extends Vue {
	
	protected ControleurGardienHockeyLigueNationnal controleur;
	protected static VueGardienHockeyLigueNationnal instance = null; 
	public static VueGardienHockeyLigueNationnal getInstance() {if(null==instance)instance = new VueGardienHockeyLigueNationnal();return VueGardienHockeyLigueNationnal.instance;}; 

	private VueGardienHockeyLigueNationnal() {
		super("gardienHockeyLigueNationnal.fxml", VueGardienHockeyLigueNationnal.class);
		Logger.logMsg(Logger.INFO, "new VueGardienHockeyLigueNationnal()");
		super.controleur = this.controleur = new ControleurGardienHockeyLigueNationnal();
	}
}
