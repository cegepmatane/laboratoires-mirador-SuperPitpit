package vue;

import javafx.scene.control.Label;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurBitcoin;
import controleur.ControleurNouvelles;


public class VueBitcoin extends Vue {

	protected ControleurBitcoin controleur = null;
	protected static VueBitcoin instance = null; 
	public static VueBitcoin getInstance() {if(null==instance)instance = new VueBitcoin();return VueBitcoin.instance;}; 

	private VueBitcoin() {
		super("bitcoin.fxml", VueBitcoin.class);
		Logger.logMsg(Logger.INFO, "new VueBitcoin()");
		super.controleur = this.controleur = new ControleurBitcoin();
	}

	public void afficherCode(String code) {
		System.out.println("afficherCode");
		
		Label codeLabel = (Label)lookup("#code-bitcoin");
		codeLabel.setText("Code : " + code);
		
	}

	public void afficherSymbole(String symbole) {
		System.out.println("afficherSymbole");
		
		Label symboleLabel = (Label)lookup("#symbole-bitcoin");
		symboleLabel.setText("Symbole : " + symbole);
		
	}

	public void afficherTaux(float taux) {
		System.out.println("afficherTaux");
		
		Label tauxLabel = (Label)lookup("#taux-bitcoin");
		tauxLabel.setText("Taux : " + taux);
		
	}

	public void afficherDescription(String description) {
		System.out.println("afficherDescription");
		
		Label descriptionLabel = (Label)lookup("#description-bitcoin");
		descriptionLabel.setText("Description : " + description);
		
	}
	
	
	
	
	

}
