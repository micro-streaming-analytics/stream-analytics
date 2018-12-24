package es.amplia.micro.streaming.analytics.dto;

public class PowerSupplyDto {

	private String source;
	private String status;
	private BatteryChargeLevelDto batteryChargeLevel;
	private OutageDto outage;
	
	public PowerSupplyDto() {
		
	}
	
	public PowerSupplyDto(String source, String status, BatteryChargeLevelDto batteryChargeLevel, OutageDto outage) {
		super();
		this.source = source;
		this.status = status;
		this.batteryChargeLevel = batteryChargeLevel;
		this.outage = outage;
	}
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public BatteryChargeLevelDto getBatteryChargeLevel() {
		return batteryChargeLevel;
	}
	public void setBatteryChargeLevel(BatteryChargeLevelDto batteryChargeLevel) {
		this.batteryChargeLevel = batteryChargeLevel;
	}
	public OutageDto getOutage() {
		return outage;
	}
	public void setOutage(OutageDto outage) {
		this.outage = outage;
	}
	
	
}
