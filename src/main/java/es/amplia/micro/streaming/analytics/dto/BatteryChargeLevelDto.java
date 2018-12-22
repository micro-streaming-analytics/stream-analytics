package es.amplia.micro.streaming.analytics.dto;

public class BatteryChargeLevelDto {

	private String trend;
	private String status;
	private String percentage;
	
	public BatteryChargeLevelDto() {
		
	}
	
	public BatteryChargeLevelDto(String trend, String status, String percentage) {
		super();
		this.trend = trend;
		this.status = status;
		this.percentage = percentage;
	}
	
	public String getTrend() {
		return trend;
	}
	public void setTrend(String trend) {
		this.trend = trend;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPercentage() {
		return percentage;
	}
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	
	
}
