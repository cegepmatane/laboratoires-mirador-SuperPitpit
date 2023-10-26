import java.util.ArrayList;
import java.util.List;

import modele.TremblementDeTerre;

public class ChercheurTremblementDeTerre {

	protected List<TremblementDeTerre> tousLesTremblementsDeTerre;
	
	
	
	public ChercheurTremblementDeTerre() {
		this.tousLesTremblementsDeTerre = new ArrayList<TremblementDeTerre>();
	}

	public void executer() {
		
		filtrerParLongitude();
		
	}
	
	protected List<TremblementDeTerre> filtrerParLongitude(){
		return null;
	}
	
	protected List<TremblementDeTerre> filtrerParLatitude(){
		return null;
	}

}
