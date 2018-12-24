package es.amplia.micro.streaming.analytics.dto;

public class Ram {

	private String unit;
	private String total;
	private Usage ramUsage;
	
	public Ram() {
		
	}
	
	public Ram(String unit, String total, Usage ramUsage) {
		super();
		this.unit = unit;
		this.total = total;
		this.ramUsage = ramUsage;
	}
	
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public Usage getRamUsage() {
		return ramUsage;
	}
	public void setUsage(Usage ramUsage) {
		this.ramUsage = ramUsage;
	}
}
