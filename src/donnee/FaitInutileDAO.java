package donnee;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Scanner;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import modele.FaitInutile;

public class FaitInutileDAO {

	public FaitInutileDAO() {
		
	}
	
	private String URL_FAIT_DIVERS = "https://uselessfacts.jsph.pl/api/v2/facts/random?language=en";
	
	public FaitInutile listerFaitInutile(){
		
		FaitInutile faitInutile = null;
		
		// TELECHARGER = Recupere les donnees de internet en xml
		String json = "";
		
		try 
		{
			URL url = new URL(URL_FAIT_DIVERS);
			InputStream flux = url.openConnection().getInputStream();
			Scanner lecteur = new Scanner(flux);
			lecteur.useDelimiter("\\A"); // marque que delimiteur est la fin du document
			json = lecteur.next();
			lecteur.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//System.out.println(json);
		
		// PARSER = Transformer le json en un objet de fait divers
		
		try 
		{
			JsonParser parseur = new JsonParser();
			JsonObject faitDiversJSON = parseur.parse(json).getAsJsonObject();
	
	        String fait = faitDiversJSON.get("text").getAsString();
	        String source = faitDiversJSON.get("source").getAsString();
	        String langue = faitDiversJSON.get("language").getAsString();
	        String url = faitDiversJSON.get("permalink").getAsString();
	
	        /*
	        System.out.println("Fait : " + fait);
	        System.out.println("Source : " + source);
	        System.out.println("Langue : " + langue);
	        System.out.println("Url : " + url);
	        */
	        
	        faitInutile = new FaitInutile(fait, source, langue, url);
	        
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		return faitInutile;
		
	}

}
