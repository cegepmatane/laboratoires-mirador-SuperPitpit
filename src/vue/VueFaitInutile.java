package vue;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurFaitInutile;
import controleur.ControleurNouvelles;
import javafx.scene.control.Label;

public class VueFaitInutile extends Vue {

	protected ControleurFaitInutile controleur = null;
	protected static VueFaitInutile instance = null; 
	public static VueFaitInutile getInstance() {if(null==instance)instance = new VueFaitInutile();return VueFaitInutile.instance;}; 

	public VueFaitInutile() {
		super("faitInutile.fxml", VueFaitInutile.class);
		Logger.logMsg(Logger.INFO, "new VueFaitInutile()");
		super.controleur = this.controleur = new ControleurFaitInutile();
	}
	
	public void afficherfaitInutile() {
		System.out.println("afficherfaitInutile");
		Label faitInutileLabel = (Label)lookup("#fait-inutile");
		faitInutileLabel.setText("dsdd");
	}
	

}
