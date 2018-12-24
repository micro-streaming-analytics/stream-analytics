package es.amplia.micro.streaming.analytics.dto;

public class Usage {

	private String unit;
	private String current;
	private Double average;
	private Double maximum;
	private Double minimum;
	
	public Usage() {
		
	}
	
	public Usage(String unit, String current, Double average, Double maximum, Double minimum) {
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
	public Double getAverage() {
		return average;
	}
	public void setAverage(Double average) {
		this.average = average;
	}
	public Double getMaximum() {
		return maximum;
	}
	public void setMaximum(Double maximum) {
		this.maximum = maximum;
	}
	public Double getMinimum() {
		return minimum;
	}
	public void setMinimum(Double minimum) {
		this.minimum = minimum;
	}
}
