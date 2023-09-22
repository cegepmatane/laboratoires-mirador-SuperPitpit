package donnee;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import modele.Asteroide;

public class AsteroideDAO {
	
	private String URL_ASTEROIDES = "https://data.nasa.gov/resource/gh4g-9sfh.xml?$where=starts_with(name,%27De%20%27)";
	
	public AsteroideDAO() {
		
	}
	
	public List<Asteroide> listerAsteroide() {

		//System.out.println("listerAsteroide");
		
		List<Asteroide> asteroides = new ArrayList<Asteroide>();
		
		// TELECHARGER = Recupere les donnees de internet en xml
		String xml = "";
		try {
			URL url = new URL(URL_ASTEROIDES);
			InputStream flux = url.openConnection().getInputStream();
			Scanner lecteur = new Scanner(flux);
			lecteur.useDelimiter("\\A"); // marque que delimiteur est la fin du document
			xml = lecteur.next();
			lecteur.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//System.out.println(xml);
		
		// PARSER = Transformer le xml en une liste d'objets Asteroides
		try {
			DocumentBuilder parseur = DocumentBuilderFactory.newInstance().newDocumentBuilder();			
			Document document = parseur.parse(new ByteArrayInputStream(xml.getBytes()));
			NodeList listeNoeudsItems = document.getElementsByTagName("row");
			//System.out.println(listeNoeudsItems.getLength());

			for(int position = 0; position<listeNoeudsItems.getLength(); position++)
			{
				Element noeudItem = (Element)listeNoeudsItems.item(position);
				
				// PARSER les TEXTES
				String nom = noeudItem.getElementsByTagName("name").item(0).getTextContent();
				String classification = noeudItem.getElementsByTagName("recclass").item(0).getTextContent();
				String chute = noeudItem.getElementsByTagName("fall").item(0).getTextContent();

				// PARSER les NOMBRES
				String idTEXTE = noeudItem.getElementsByTagName("id").item(0).getTextContent();
				int id = Integer.parseInt(idTEXTE);
				String masseTEXTE = noeudItem.getElementsByTagName("mass").item(0).getTextContent();
				float masse = Float.parseFloat(masseTEXTE);
				String latitudeTEXTE = noeudItem.getElementsByTagName("reclat").item(0).getTextContent();
				float latitude = Float.parseFloat(latitudeTEXTE);
				String longitudeTEXTE = noeudItem.getElementsByTagName("reclong").item(0).getTextContent();
				float longitude = Float.parseFloat(longitudeTEXTE);

				// PARSER une DATE
				// Un peu special = parser l'annee dans quelque chose comme "1940-01-01T00:00:00"
				String dateTEXTE = noeudItem.getElementsByTagName("year").item(0).getTextContent();
				DateTimeFormatter formateur = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"); 
				LocalDateTime date = LocalDateTime.parse(dateTEXTE, formateur); 
				//System.out.println("Date : " + date.getDayOfMonth() + "-" + date.getMonthValue() + "-" + date.getYear());
				int annee = date.getYear();
				// FIN
				
				Asteroide asteroide = new Asteroide(nom, classification, chute, masse, date);
				asteroides.add(asteroide);
				
				/*
				System.out.println("Id : " + id);
				System.out.println("Nom : " + nom);				
				System.out.println("Classification : " + classification);
				System.out.println("Masse : " + masse);
				
				System.out.println("Annee : " + annee);
				System.out.println("Chute : " + chute);				
				System.out.println("Latitude : " + latitude);				
				System.out.println("Longitude : " + longitude);
				*/
			}
			
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
		
		return asteroides;
		
	}

}
