import modele.*;

public class App {

	public static void main(String[] args) {
		
		LigueHockey ligue = new LigueHockey();
		ligue.setNom("LNH");
		System.out.println("Le nom de la ligue " + ligue.getNom());
		
		JoueurHockeyLigueNationnal joueur = new JoueurHockeyLigueNationnal();
		joueur.setNom("Guétant");
		System.out.println("Le nom du joueur est " + joueur.getNom());
		
		GardienHockeyLigueNationnal gardien = new GardienHockeyLigueNationnal();
		gardien.setNom("Jean");
		System.out.println("Le nom du joueur est " + gardien.getNom());
		
		EquipeLigueNationnal equipe = new EquipeLigueNationnal();
		equipe.setNom("Lightning");
		System.out.println("Le nom de l'équipe est " + equipe.getNom());
		
		JeuGrandNombreVentes jeu = new JeuGrandNombreVentes();
		jeu.setNom("Minecraft");
		System.out.println("Le nom du jeu est " + jeu.getNom());
	}

}
