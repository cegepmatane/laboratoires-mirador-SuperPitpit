package vue;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurNouvelles;
import javafx.scene.control.Label;

public class VueNouvelles extends Vue {

	protected ControleurNouvelles controleur = null;
	protected static VueNouvelles instance = null; 
	public static VueNouvelles getInstance() {if(null==instance)instance = new VueNouvelles();return VueNouvelles.instance;}; 

	private VueNouvelles() {
		super("nouvelles.fxml", VueNouvelles.class);
		Logger.logMsg(Logger.INFO, "new VueNouvelles()");
		super.controleur = this.controleur = new ControleurNouvelles();
	}

	public void afficherTitre(String titre) {
		System.out.println("afficherTitre");
		
		Label titreLabel = (Label)lookup("#titre-nouvelle");
		titreLabel.setText("Titre : " + titre);
	}

	
	
	
	public void afficherResume(String resume) {
		System.out.println("afficherResume");
		
		Label resumeLabel = (Label)lookup("#description-nouvelle");
		resumeLabel.setText("Description : " + resume);
	}

	public void afficherUrl(String url) {
		System.out.println("afficherUrl");
		
		Label urlLabel = (Label)lookup("#lien-nouvelle");
		urlLabel.setText("Url : " + url);
		
	}
	

	

}
