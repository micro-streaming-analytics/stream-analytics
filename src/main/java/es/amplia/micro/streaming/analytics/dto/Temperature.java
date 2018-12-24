package es.amplia.micro.streaming.analytics.dto;

public class Temperature {

	private String unit;
	private String current;
	private String status;
	private Double trend;
	private Double average;
	private Double maximum;
	private Double minimum;
	
	public Temperature () {
		
	}
	
	public Temperature(String unit, String current, String status, Double trend, Double average, Double maximum,
			Double minimum) {
		super();
		this.unit = unit;
		this.current = current;
		this.status = status;
		this.trend = trend;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Double getTrend() {
		return trend;
	}
	public void setTrend(Double trend) {
		this.trend = trend;
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
