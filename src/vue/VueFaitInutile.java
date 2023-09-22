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
	
	public void afficherfaitInutile(String fait) {
		System.out.println("afficherfaitInutile");
		Label faitInutileLabel = (Label)lookup("#fait-inutile");
		faitInutileLabel.setText("Fait : " + fait);
	}
	
	public void afficherSource(String source){
			
		System.out.println("afficherSource");
		Label sourceLabel = (Label)lookup("#source-fait-inutile");
		sourceLabel.setText("Source : " + source);
		
	}
	
	public void afficherLangue(String langue) {
		
		System.out.println("afficherLangue");
		Label langueLabel = (Label)lookup("#langue-fait-Inutile");
		langueLabel.setText("Langue : " + langue);
		
	}
	
	public void afficherUrl(String url) {
		
		System.out.println("afficherUrl");
		Label urlLabel = (Label)lookup("#url-fait-inutile");
		urlLabel.setText("Url : " + url);
		
	}

}
