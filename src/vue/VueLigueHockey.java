package vue;

import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurLigueHockey;

public class VueLigueHockey extends Vue {
	
	protected ControleurLigueHockey controleur;
	
	protected static VueLigueHockey instance = null; 
	public static VueLigueHockey getInstance()  { if(null==instance) instance = new VueLigueHockey(); return VueLigueHockey.instance;}; 
	
	private VueLigueHockey()  {
		super("ligueHockey.fxml", VueLigueHockey.class);
		Logger.logMsg(Logger.INFO, "new VueLigueHockey()");
		super.controleur = this.controleur = new ControleurLigueHockey();
	}
	
	
}
