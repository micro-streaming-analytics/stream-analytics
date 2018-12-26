package es.amplia.micro.streaming.analytics.dto;

public class Subscription {

	private String id;
	private String name;
	private String description;
	private String operator;
	private String imsi;
	private String msisdn;
	private String type;
	private Address address;
	
	public Subscription() {
		
	}
	
	public Subscription(String id, String name, String description, String operator, String imsi, String msisdn,
			String type, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.operator = operator;
		this.imsi = imsi;
		this.msisdn = msisdn;
		this.type = type;
		this.address = address;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getImsi() {
		return imsi;
	}
	public void setImsi(String imsi) {
		this.imsi = imsi;
	}
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
