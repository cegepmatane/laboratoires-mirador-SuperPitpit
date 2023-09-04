package vue;
import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurMirador;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import modele.Nouvelle;
import modele.StatistiquesMeteores;
public class VueMirador extends Vue {

	protected ControleurMirador controleur;
	protected static VueMirador instance = null; 
	public static VueMirador getInstance() {if(null==instance)instance = new VueMirador();return VueMirador.instance;}; 
	
	private VueMirador() 
	{
		super("mirador.fxml", VueMirador.class);
		super.controleur = this.controleur = new ControleurMirador();
		Logger.logMsg(Logger.INFO, "new VueMirador()");
	}
		
	public void activerControles()
	{
		super.activerControles();
	}
	
	public void afficherNombreAstronautes(int nombre) {
		Label vueNombreAstronautes = (Label)lookup("#nombre-astronautes");
		vueNombreAstronautes.setText(nombre + " astronautes");
	}

	public void afficherStatistiquesMeteores(StatistiquesMeteores statistiquesMeteores) {
		// TODO Auto-generated method stub
		Label vueMin = (Label)lookup("#meteore-taille-min");
		Label vueMax = (Label)lookup("#meteore-taille-max");
		Label vueMoyenne = (Label)lookup("#meteore-taille-moyenne");
		vueMin.setText("Min :" + statistiquesMeteores.getMasseMin());
		vueMax.setText("Max : " + statistiquesMeteores.getMasseMax());
		vueMoyenne.setText("Moyenne :" + statistiquesMeteores.getMasseMoyenne());
		
	}

	public void afficherNouvelles(List<Nouvelle> listeNouvelles) {
		// TODO Auto-generated method stub
		
		TextArea textAreaNouvelles = (TextArea)lookup("#nouvelles-spacex");
		
		
		for(Nouvelle nouvelle : listeNouvelles) {
			textAreaNouvelles.appendText("" + nouvelle.getTitre() + "\n");
		}
	}
	
	
	
	
	
	
	// Cast (TextArea)
	// TextArea = nouvellesSpaceXVue = (TextArea) lookup(("#nouvelles-spacex");
}
