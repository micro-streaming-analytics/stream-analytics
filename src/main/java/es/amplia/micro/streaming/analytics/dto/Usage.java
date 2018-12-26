package es.amplia.micro.streaming.analytics.dto;

public class Usage {

	private String unit;
	private String current;
	private String average;
	private String maximum;
	private String minimum;
	
	public Usage() {
		
	}
	
	public Usage(String unit, String current, String average, String maximum, String minimum) {
		super();
		this.unit = unit;
		this.current = current;
		this.average = average;
		this.maximum = maximum;
		this.minimum = minimum;
	}
	
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getCurrent() {
		return current;
	}
	public void setCurrent(String current) {
		this.current = current;
	}
	public String getAverage() {
		return average;
	}
	public void setAverage(String average) {
		this.average = average;
	}
	public String getMaximum() {
		return maximum;
	}
	public void setMaximum(String maximum) {
		this.maximum = maximum;
	}
	public String getMinimum() {
		return minimum;
	}
	public void setMinimum(String minimum) {
		this.minimum = minimum;
	}
}
