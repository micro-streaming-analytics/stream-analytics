package es.amplia.micro.streaming.analytics.dto;

public class VolatilStorage {

	private String unit;
	private String total;
	private Usage usage;
	
	public VolatilStorage() {
		
	}
	
	public VolatilStorage(String unit, String total, Usage usage) {
		super();
		this.unit = unit;
		this.total = total;
		this.usage = usage;
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
	public Usage getUsage() {
		return usage;
	}
	public void setUsage(Usage usage) {
		this.usage = usage;
	}
}
