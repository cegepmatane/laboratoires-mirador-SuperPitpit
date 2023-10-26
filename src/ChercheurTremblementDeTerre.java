import java.util.ArrayList;
import java.util.List;

import modele.TremblementDeTerre;

public class ChercheurTremblementDeTerre {

	protected List<TremblementDeTerre> tousLesTremblementsDeTerre;
	protected List<TremblementDeTerre> selection;
	
	
	public void setTousLesTremblementsDeTerre(List<TremblementDeTerre> tousLesTremblementsDeTerre) {
		this.tousLesTremblementsDeTerre = tousLesTremblementsDeTerre;
	}

	public List<TremblementDeTerre> getSelection() {
		return selection;
	}

	

	public ChercheurTremblementDeTerre(List<TremblementDeTerre> tremblementDeTerres) {
		this.tousLesTremblementsDeTerre = tremblementDeTerres;
	}

	public void executer() {
		//System.out.println("ChercheurTremblementDeTerre.executer()");
		selection = filtrerParLongitude(this.tousLesTremblementsDeTerre);
		selection = filtrerParLatitude(selection);
		selection = filtrerParMagnitude(selection);
		
	}
	
	public List<TremblementDeTerre> filtrerParLongitude(List<TremblementDeTerre> tremblementDeTerres){
		
		return tremblementDeTerres;
	}
	
	public List<TremblementDeTerre> filtrerParLatitude(List<TremblementDeTerre> tremblementDeTerres){
		
		return tremblementDeTerres;
	}
	
	public List<TremblementDeTerre> filtrerParMagnitude(List<TremblementDeTerre> tremblementDeTerres){
		
		return tremblementDeTerres;
	}

}
