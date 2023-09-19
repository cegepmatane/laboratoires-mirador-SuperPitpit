package vue;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurNumerique;
import controleur.ControleurTremblementDeTerre;
import javafx.scene.control.Label;

public class VueTremblementDeTerre extends Vue {
	
	protected ControleurTremblementDeTerre controleur;
	protected static VueTremblementDeTerre instance = null; 
	public static VueTremblementDeTerre getInstance() {if(null==instance)instance = new VueTremblementDeTerre();return VueTremblementDeTerre.instance;}; 
	
	private VueTremblementDeTerre()  {
		super("tremblementDeTerre.fxml", VueTremblementDeTerre.class);
		Logger.logMsg(Logger.INFO, "new VueTremblementDeTerre()");
		super.controleur = this.controleur = new ControleurTremblementDeTerre();
	}
	
	public void afficherEmplacement(String emplacement) {
		
		System.out.println("afficherEmplacement");
		
		Label emplacementLabel = (Label)lookup("#emplacement-tremblement-de-terre");
		emplacementLabel.setText("Emplacement : " + emplacement);
	}
	
	public void afficherMagnitude(int magnitude) {
		
		System.out.println("afficherMagnitude");
		
		Label magnitudeLabel = (Label)lookup("#magnitude-tremblement-de-terre");
		magnitudeLabel.setText("Magnitude : " + magnitude);
		
	}
	
	public void afficherDate(String date) {
		
		System.out.println("afficherDate");
		
		Label dateLabel = (Label)lookup("#date-tremblement-de-terre");
		dateLabel.setText("Date : " + date);
		
	}
	
	public void afficherLongitude(float longitude) {
		
		System.out.println("afficherLongitude");
		
		Label longitudeLabel = (Label)lookup("#longitude-tremblement-de-terre");
		longitudeLabel.setText("Longitude : " + longitude);
		
	}
	
	public void afficherLatitude(float latitude) {
		
		System.out.println("afficherLatitude");
		
		Label latitudeLabel = (Label)lookup("#latitude-tremblement-de-terre");
		latitudeLabel.setText("Latitude : " + latitude);
		
	}
	
}
