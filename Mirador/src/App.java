
import architecture.Controleur;
import architecture.Fenetre;
import vue.VueMirador;

public class App {

	public static void main(String[] parametres) {
		
		// Refaire la même ligne pour choisir la ligne voulut
		Controleur.choisirVuePrincipale(VueMirador.class);
		
		Fenetre.launch(Fenetre.class, parametres);	
	}

}
