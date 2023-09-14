package vue;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurEquipeLigueNationnal;

public class VueEquipeLigueNationnal extends Vue {
	
	protected ControleurEquipeLigueNationnal controleur = null;
	protected static VueEquipeLigueNationnal instance = null; 
	public static VueEquipeLigueNationnal getInstance() {if(null==instance)instance = new VueEquipeLigueNationnal();return VueEquipeLigueNationnal.instance;}; 
	
	private VueEquipeLigueNationnal()  {
		super("equipeLigueNationnal.fxml", VueEquipeLigueNationnal.class);
		Logger.logMsg(Logger.INFO, "new EquipeLigueNationnal()");
		super.controleur = this.controleur = new ControleurEquipeLigueNationnal();
	}
	
}
