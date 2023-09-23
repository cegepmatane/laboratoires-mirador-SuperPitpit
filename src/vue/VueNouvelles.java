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

	public void afficherAuteur(String auteur) {
		System.out.println("afficherAuteur");
		
		Label auteurLabel = (Label)lookup("#auteur-nouvelle");
		auteurLabel.setText("Auteur : " + auteur);
	}
	

	

}
