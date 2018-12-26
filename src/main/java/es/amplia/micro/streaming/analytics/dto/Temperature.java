package es.amplia.micro.streaming.analytics.dto;

public class Temperature {

	private String unit;
	private String current;
	private String status;
	private String trend;
	private String average;
	private String maximum;
	private String minimum;
	
	public Temperature () {
		
	}
	
	public Temperature(String unit, String current, String status, String trend, String average, String maximum,
			String minimum) {
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
	public String getTrend() {
		return trend;
	}
	public void setTrend(String trend) {
		this.trend = trend;
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
