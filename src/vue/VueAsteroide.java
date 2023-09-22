package vue;

import java.time.LocalDateTime;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurAsteroide;

public class VueAsteroide extends Vue {
	
	protected ControleurAsteroide controleur;
	protected static VueAsteroide instance = null; 
	public static VueAsteroide getInstance() {if(null==instance)instance = new VueAsteroide();return VueAsteroide.instance;}; 
	
	private VueAsteroide()  {
		super("asteroidetDeTerre.fxml", VueAsteroide.class);
		Logger.logMsg(Logger.INFO, "new VueTremblementDeTerre()");
		super.controleur = this.controleur = new ControleurAsteroide();
	}
	

	
}
