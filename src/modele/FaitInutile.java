package modele;

public class FaitInutile {

	protected String fait;
	protected String source;
	protected String langue;
	protected String url;
	
	public FaitInutile() {
			
	}
	
	
	public FaitInutile(String fait, String source, String langue, String url) {
		super();
		this.fait = fait;
		this.source = source;
		this.langue = langue;
		this.url = url;
	}

	public String getFait() {
		return fait;
	}

	public void setFait(String fait) {
		this.fait = fait;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getLangue() {
		return langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	

}
