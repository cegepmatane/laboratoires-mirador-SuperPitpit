import java.util.ArrayList;
import java.util.List;

import modele.TremblementDeTerre;

public class ChercheurTremblementDeTerreLongitudeLatitude extends ChercheurTremblementDeTerre{

	public ChercheurTremblementDeTerreLongitudeLatitude(List<TremblementDeTerre> tremblementDeTerres) {
		
	}
	
	public List<TremblementDeTerre> filtrerParLongitude(List<TremblementDeTerre> tremblementDeTerres){
		
		List<TremblementDeTerre> selection = new ArrayList<TremblementDeTerre>();
		
		for (TremblementDeTerre tremblementDeTerre:tremblementDeTerres) {
			
			//if
			selection.add(tremblementDeTerre);
			
		}
		
		return selection;
	}
	
	public List<TremblementDeTerre> filtrerParLatitude(List<TremblementDeTerre> tremblementDeTerres){
		
		List<TremblementDeTerre> selection = new ArrayList<TremblementDeTerre>();
		
		
		for (TremblementDeTerre tremblementDeTerre:tremblementDeTerres) {
					
					//if
			selection.add(tremblementDeTerre);
					
		}
		
		return selection;
	}

}
