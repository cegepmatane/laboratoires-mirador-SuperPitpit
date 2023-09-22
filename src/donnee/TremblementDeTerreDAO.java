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
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import modele.TremblementDeTerre;

public class TremblementDeTerreDAO {

	private String URL_TREMBLEMENTS = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=xml&starttime=2020-01-01&endtime=2020-01-02&minmagnitude=5";
	
	public TremblementDeTerreDAO() {
		
	}
	
	public List<TremblementDeTerre> listerTremblementDeTerre() {
		
		// TELECHARGER = Recupere les donnees de internet en xml
		
		List<TremblementDeTerre> tremblementDeTerres = new ArrayList<TremblementDeTerre>();
		String xml = "";
		
		
		try {
			URL url = new URL(URL_TREMBLEMENTS);
			InputStream flux = url.openConnection().getInputStream();
			Scanner lecteur = new Scanner(flux);
			lecteur.useDelimiter("\\A"); // marque que delimiteur est la fin du document
			xml = lecteur.next();
			lecteur.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//System.out.println(xml);
		
		
		
		// PARSER = Transformer le xml en une liste d'objets Tremblements
		try {
			DocumentBuilder parseur = DocumentBuilderFactory.newInstance().newDocumentBuilder();			
			Document document = parseur.parse(new ByteArrayInputStream(xml.getBytes()));
			NodeList listeNoeudsItems = document.getElementsByTagName("event");
			//System.out.println(listeNoeudsItems.getLength());
			XPath xPath = XPathFactory.newInstance().newXPath();

			for(int position = 0; position<listeNoeudsItems.getLength(); position++)
			{
				Element noeudItem = (Element)listeNoeudsItems.item(position);
				
				// PARSER les TEXTES
				//Element noeudDescription = (Element)noeudItem.getElementsByTagName("description").item(0);
				String id = noeudItem.getAttribute("catalog:eventid");
				String description = ((NodeList)xPath.compile("description/text").evaluate(noeudItem, XPathConstants.NODESET)).item(0).getTextContent();
				String evaluation = ((NodeList)xPath.compile("origin/evaluationMode").evaluate(noeudItem, XPathConstants.NODESET)).item(0).getTextContent();
				
				// PARSER les NOMBRES
				String longitudeTEXTE = ((NodeList)xPath.compile("origin/longitude/value").evaluate(noeudItem, XPathConstants.NODESET)).item(0).getTextContent();
				String latitudeTEXTE = ((NodeList)xPath.compile("origin/latitude/value").evaluate(noeudItem, XPathConstants.NODESET)).item(0).getTextContent();
				String profondeurTEXTE = ((NodeList)xPath.compile("origin/depth/value").evaluate(noeudItem, XPathConstants.NODESET)).item(0).getTextContent();
				String magnitudeTEXTE = ((NodeList)xPath.compile("magnitude/mag/value").evaluate(noeudItem, XPathConstants.NODESET)).item(0).getTextContent();
				String incertitudeTEXTE = ((NodeList)xPath.compile("magnitude/mag/uncertainty").evaluate(noeudItem, XPathConstants.NODESET)).item(0).getTextContent();
				float longitude = Float.parseFloat(longitudeTEXTE);
				float latitude = Float.parseFloat(latitudeTEXTE);
				float profondeur = Float.parseFloat(profondeurTEXTE);
				float magnitude = Float.parseFloat(magnitudeTEXTE);
				float incertitude = Float.parseFloat(incertitudeTEXTE);
				
				// PARSER une DATE - Exemple 2020-01-01T00:28:20.289Z
				String dateTEXTE = ((NodeList)xPath.compile("origin/time/value").evaluate(noeudItem, XPathConstants.NODESET)).item(0).getTextContent();
				DateTimeFormatter formateur = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"); 
				LocalDateTime date = LocalDateTime.parse(dateTEXTE, formateur); 
				//System.out.println("Date : " + date.getDayOfMonth() + "-" + date.getMonthValue() + "-" + date.getYear());
				

				// AFFICHER pour tester
				/*
				System.out.println("Id : " + id);
				System.out.println("Description : " + description);
				System.out.println("Evaluation : " + evaluation);
				System.out.println("Longitude : " + longitude);
				System.out.println("Latitude : " + latitude);
				System.out.println("Profondeur : " + profondeur);
				System.out.println("Magnitude : " + magnitude);
				System.out.println("Incertitude : " + incertitude);
				System.out.println("Date : " + date);
				*/

				TremblementDeTerre tremblementDeTerre = new TremblementDeTerre(description, date, longitude, latitude, magnitude);
				
				
				tremblementDeTerres.add(tremblementDeTerre);
				
			}
			
		} catch (ParserConfigurationException | SAXException | IOException | DOMException | XPathExpressionException e) {
			e.printStackTrace();
		}
		
		return tremblementDeTerres;
		
	}
	
}
