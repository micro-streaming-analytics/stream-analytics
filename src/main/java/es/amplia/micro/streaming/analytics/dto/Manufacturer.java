package es.amplia.micro.streaming.analytics.dto;

public class Manufacturer {

	private String name;
	private String oui;
	
	public Manufacturer() {
		
	}
	
	public Manufacturer(String name, String oui) {
		super();
		this.name = name;
		this.oui = oui;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOui() {
		return oui;
	}
	public void setOui(String oui) {
		this.oui = oui;
	}
	
	
}
