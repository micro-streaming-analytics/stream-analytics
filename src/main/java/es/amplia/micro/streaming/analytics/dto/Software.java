package es.amplia.micro.streaming.analytics.dto;

public class Software {

	private String name;
	private String type;
	private String version;
	private String date;
	
	public Software() {
		
	}
	
	public Software(String name, String type, String version, String date) {
		super();
		this.name = name;
		this.type = type;
		this.version = version;
		this.date = date;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
}
