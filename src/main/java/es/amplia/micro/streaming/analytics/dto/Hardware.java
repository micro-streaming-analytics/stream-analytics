package es.amplia.micro.streaming.analytics.dto;

public class Hardware {

	private String serialNumber;
	private Manufacturer manufacturer;
	private Model model;
	private String clockDate;
	private String upTime;
	
	public Hardware() {
		
	}
	
	public Hardware(String serialNumber, Manufacturer manufacturer, Model model, String clockDate,
			String upTime) {
		super();
		this.serialNumber = serialNumber;
		this.manufacturer = manufacturer;
		this.model = model;
		this.clockDate = clockDate;
		this.upTime = upTime;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public Manufacturer getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}
	public Model getModel() {
		return model;
	}
	public void setModel(Model model) {
		this.model = model;
	}
	public String getClockDate() {
		return clockDate;
	}
	public void setClockDate(String clockDate) {
		this.clockDate = clockDate;
	}
	public String getUpTime() {
		return upTime;
	}
	public void setUpTime(String upTime) {
		this.upTime = upTime;
	}
}
