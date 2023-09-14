package modele;

public class TremblementDeTerre {

	protected String emplacement;
	protected String date;
	protected float longitude;
	protected float latitude;
	protected int magnitude;
	
	public TremblementDeTerre() {
		
	}
	
	
	

	public TremblementDeTerre(String emplacement, String date, float longitude, float latitude, int magnitude) {
		super();
		this.emplacement = emplacement;
		this.date = date;
		this.longitude = longitude;
		this.latitude = latitude;
		this.magnitude = magnitude;
	}




	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getEmplacement() {
		return emplacement;
	}

	public void setEmplacement(String emplacement) {
		this.emplacement = emplacement;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public int getMagnitude() {
		return magnitude;
	}

	public void setMagnitude(int magnitude) {
		this.magnitude = magnitude;
	}

	

}
