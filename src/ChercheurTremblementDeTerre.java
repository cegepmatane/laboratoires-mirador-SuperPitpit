import java.util.ArrayList;
import java.util.List;

import modele.TremblementDeTerre;

public class ChercheurTremblementDeTerre {

	protected List<TremblementDeTerre> tousLesTremblementsDeTerre;
	protected List<TremblementDeTerre> selection;
	
	
	public ChercheurTremblementDeTerre() {
		this.tousLesTremblementsDeTerre = new ArrayList<TremblementDeTerre>();
	}

	public void executer() {
		
		selection = filtrerParLongitude(this.tousLesTremblementsDeTerre);
		selection = filtrerParLatitude(selection);
		selection = filtrerParMagnitude(selection);
		
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
	
	public List<TremblementDeTerre> filtrerParMagnitude(List<TremblementDeTerre> tremblementDeTerres){
		
		List<TremblementDeTerre> selection = new ArrayList<TremblementDeTerre>();
		
		for (TremblementDeTerre tremblementDeTerre:tremblementDeTerres) {
					
					//if
			selection.add(tremblementDeTerre);
					
		}
		
		return selection;
	}

}
