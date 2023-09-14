package donnee;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class StationSpatialeDAO {

	public StationSpatialeDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public void detaillerPosition() {
		
		//System.out.println("StationSpatialeDAO detaillerPosition");
		String  URL_STATION_SPACIALE = "http://api.open-notify.org/iss-now.json";
		
		String json = "";
		
		
		try {
			
			
			URL url = new URL(URL_STATION_SPACIALE);
			InputStream flux =  url.openConnection().getInputStream();
			Scanner lecteur = new Scanner(flux);
			lecteur.useDelimiter("\\A"); // marque que le délimiteur est la fin du document
			json = lecteur.next();
			lecteur.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println(json);
		
		JsonParser parseur = new JsonParser();
		JsonObject ssiJson = parseur.parse(json).getAsJsonObject();
		int timestamp = ssiJson.get("timestamp").getAsInt();
		System.out.println(timestamp);
		
		JsonObject position = ssiJson.get("iss_position").getAsJsonObject();
		String latitude = position.get("latitude").getAsString();
		String longitude = position.get("longitude").getAsString();
		System.out.println(latitude+longitude);
		float latitudeO = Float.parseFloat(latitude);
	}

}
