import java.util.ArrayList;
import java.util.List;

import modele.TremblementDeTerre;

public class CherCheurTremblementDeTerreMagnitude extends ChercheurTremblementDeTerre{

	protected String mot;
	
	public CherCheurTremblementDeTerreMagnitude(List<TremblementDeTerre> tremblementDeTerres, String mot) {
		super(tremblementDeTerres);
		this.mot = mot;
	}

	public List<TremblementDeTerre> filtrerParMagnitude(List<TremblementDeTerre> tremblementDeTerres){
		
		List<TremblementDeTerre> selection = new ArrayList<TremblementDeTerre>();
		
		for (TremblementDeTerre tremblementDeTerre:tremblementDeTerres) {
					
					//if
			selection.add(tremblementDeTerre);
					
		}
		
		return selection;
	}
}
