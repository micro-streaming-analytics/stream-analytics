package es.amplia.micro.streaming.analytics.dto;

public class Address {

	private String type;
	private String value;
	private String apn;
	
	public Address() {
		
	}
	
	public Address(String type, String value, String apn) {
		super();
		this.type = type;
		this.value = value;
		this.apn = apn;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getApn() {
		return apn;
	}
	public void setApn(String apn) {
		this.apn = apn;
	}
	
	
}
