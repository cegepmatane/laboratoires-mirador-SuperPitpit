package modele;

import java.time.LocalDateTime;

public class TremblementDeTerre {

	protected String emplacement;
	protected LocalDateTime date;
	protected float longitude;
	protected float latitude;
	protected float magnitude;
	
	public TremblementDeTerre() {
		
	}
	
	
	

	public TremblementDeTerre(String emplacement, LocalDateTime date, float longitude, float latitude, float magnitude) {
		super();
		this.emplacement = emplacement;
		this.date = date;
		this.longitude = longitude;
		this.latitude = latitude;
		this.magnitude = magnitude;
	}




	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
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

	public float getMagnitude() {
		return magnitude;
	}

	public void setMagnitude(float magnitude) {
		this.magnitude = magnitude;
	}

	

}
