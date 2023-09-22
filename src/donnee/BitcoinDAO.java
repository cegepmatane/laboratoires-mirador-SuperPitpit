package donnee;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import modele.Bitcoin;

public class BitcoinDAO {

	private String URL_BITCOIN = "https://api.coindesk.com/v1/bpi/currentprice.json";
	
	public BitcoinDAO() {
		
	}

	
	public List<Bitcoin> listerMonnaie(){
		
		//System.out.println("listerMonnaie");
		
		List<Bitcoin> monnaies = new ArrayList<Bitcoin>();
		
		// TELECHARGER = Recupere les donnees de internet en xml
		String json = "";
		try 
		{
			URL url = new URL(URL_BITCOIN);
			InputStream flux = url.openConnection().getInputStream();
			Scanner lecteur = new Scanner(flux);
			lecteur.useDelimiter("\\A"); // marque que delimiteur est la fin du document
			json = lecteur.next();
			lecteur.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//System.out.println(json);
		
		// PARSER = Transformer le json en une liste d'objets de devises
		
		try 
		{
			JsonParser parseur = new JsonParser();
			JsonObject bitcoinJSON = parseur.parse(json).getAsJsonObject();
	
	        // Récupérer l'objet "bpi" à partir de l'objet JSON
	        JsonObject bpiJSON = bitcoinJSON.get("bpi").getAsJsonObject();
	
	        // Parcourir les clés de l'objet "bpi" et afficher tous les champs
	        for (String cle : bpiJSON.keySet()) 
	        {
	        	JsonObject deviseJSON = bpiJSON.get(cle).getAsJsonObject();
	            String code = deviseJSON.get("code").getAsString();
	            String symbole = deviseJSON.get("symbol").getAsString();
	            String description = deviseJSON.get("description").getAsString();
	            float taux = deviseJSON.get("rate_float").getAsFloat();
	
	            // Afficher les valeurs de chaque champ
	            //System.out.println("Devise : " + cle);
	            /*
	            System.out.println("Code : " + code);
	            System.out.println("Symbole : " + symbole);
	            System.out.println("Taux : " + taux); // 27,199.2608
	            System.out.println("Description : " + description);
	            */
	            Bitcoin monnaie = new Bitcoin(code, symbole, taux, description);
	            monnaies.add(monnaie);
	            
	        }
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		return monnaies;
		
	}
	
}
