
import architecture.Controleur;
import architecture.Fenetre;
import vue.VueJoueurHockeyLigueNationnal;
import vue.VueMirador;
import vue.VueNouvelles;

public class App {

	public static void main(String[] parametres) {
		
		// Refaire la même ligne pour choisir la ligne voulut
		// Controleur.choisirVuePrincipale(VueMirador.class);
		
		//Controleur.choisirVuePrincipale(VueNouvelles.class);
		Controleur.choisirVuePrincipale(VueJoueurHockeyLigueNationnal.class);
		
		Fenetre.launch(Fenetre.class, parametres);	
	}

}
