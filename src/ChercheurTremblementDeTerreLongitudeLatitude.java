import java.util.ArrayList;
import java.util.List;

import modele.TremblementDeTerre;

public class ChercheurTremblementDeTerreLongitudeLatitude extends ChercheurTremblementDeTerre{

	public ChercheurTremblementDeTerreLongitudeLatitude(List<TremblementDeTerre> tremblementDeTerres) {
		super(tremblementDeTerres);
	}
	
	public List<TremblementDeTerre> filtrerParLongitude(List<TremblementDeTerre> tremblementDeTerres){
		System.out.println("ChercheurTremblementDeTerreLongitudeLatitude.filtrerParLongitude()");
		List<TremblementDeTerre> selection = new ArrayList<TremblementDeTerre>();
		
		for (TremblementDeTerre tremblementDeTerre:tremblementDeTerres) {
			
			
			if (tremblementDeTerre.getLongitude() > 0) {
				selection.add(tremblementDeTerre);
			}
			
			
		}
		
		return selection;
	}
	
	public List<TremblementDeTerre> filtrerParLatitude(List<TremblementDeTerre> tremblementDeTerres){
		
		System.out.println("ChercheurTremblementDeTerreLongitudeLatitude.filtrerParLatitude()");
		List<TremblementDeTerre> selection = new ArrayList<TremblementDeTerre>();
		
		
		for (TremblementDeTerre tremblementDeTerre:tremblementDeTerres) {
					
			if (tremblementDeTerre.getLatitude() > 0) {
				selection.add(tremblementDeTerre);
			}
			
					
		}
		
		return selection;
	}

}
