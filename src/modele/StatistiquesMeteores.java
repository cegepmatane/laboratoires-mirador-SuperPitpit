package modele;

public class StatistiquesMeteores {

	
	protected float masseMax;
	protected float masseMin;
	protected float masseMoyenne;
	
	public StatistiquesMeteores(float masseMin, float masseMax,  float masseMoyenne) {
		super();
		this.masseMax = masseMax;
		this.masseMin = masseMin;
		this.masseMoyenne = masseMoyenne;
	}
	
	
	
	public StatistiquesMeteores() {
		super();
	}



	public float getMasseMoyenne() {
		return masseMoyenne;
	}
	public void setMasseMoyenne(float masseMoyenne) {
		this.masseMoyenne = masseMoyenne;
	}
	public float getMasseMax() {
		return masseMax;
	}
	public void setMasseMax(float masseMax) {
		this.masseMax = masseMax;
	}
	public float getMasseMin() {
		return masseMin;
	}
	public void setMasseMin(float masseMin) {
		this.masseMin = masseMin;
	}
	
	
	
	
}
