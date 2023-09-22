package modele;

public class Bitcoin {

	protected String code;
	protected String symbole;
	protected float taux;
	protected String description;
	
	
	public Bitcoin() {
		
	}


	public Bitcoin(String code, String symbole, float taux, String description) {
		super();
		this.code = code;
		this.symbole = symbole;
		this.taux = taux;
		this.description = description;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getSymbole() {
		return symbole;
	}


	public void setSymbole(String symbole) {
		this.symbole = symbole;
	}


	public float getTaux() {
		return taux;
	}


	public void setTaux(float taux) {
		this.taux = taux;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}

}
