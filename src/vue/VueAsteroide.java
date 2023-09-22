package vue;

import java.time.LocalDateTime;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurAsteroide;
import javafx.scene.control.Label;

public class VueAsteroide extends Vue {
	
	protected ControleurAsteroide controleur;
	protected static VueAsteroide instance = null; 
	public static VueAsteroide getInstance() {if(null==instance)instance = new VueAsteroide();return VueAsteroide.instance;}; 
	
	public VueAsteroide()  {
		super("asteroide.fxml", VueAsteroide.class);
		Logger.logMsg(Logger.INFO, "new VueTremblementDeTerre()");
		super.controleur = this.controleur = new ControleurAsteroide();
	}
	
	public void afficherNom(String nom) {
		System.out.println("afficherNom");
		
		Label nomLabel = (Label)lookup("#nom-asteroide");
		nomLabel.setText("Nom : " + nom);
	}
	
	public void afficherClassification(String classification) {
		System.out.println("afficherClassification");
		
		Label classificationLabel = (Label)lookup("#classification-asteroide");
		classificationLabel.setText("Classification : " + classification);
		
	}

	public void afficherChute(String chute) {
		System.out.println("afficherChute");
		
		Label chuteLabel = (Label)lookup("#chute-asteroide");
		chuteLabel.setText("Chute : " + chute);
		
	}

	public void afficherMasse(float masse) {
		System.out.println("afficherMasse");
		
		Label masseLabel = (Label)lookup("#masse-asteroide");
		masseLabel.setText("Masse : " + masse);
		
	}

	public void afficherDate(LocalDateTime date) {
		System.out.println("afficherDate");
		
		Label dateLabel = (Label)lookup("#date-asteroide");
		dateLabel.setText("Date : " + date);
		
	}
	
	
	
	
	
	

	
}
