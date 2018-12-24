package es.amplia.micro.streaming.analytics.dto;

public class PowerSupply {

	private String source;
	private String status;
	private BatteryChargeLevel batteryChargeLevel;
	private Outage outage;
	
	public PowerSupply() {
		
	}
	
	public PowerSupply(String source, String status, BatteryChargeLevel batteryChargeLevel, Outage outage) {
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
	public BatteryChargeLevel getBatteryChargeLevel() {
		return batteryChargeLevel;
	}
	public void setBatteryChargeLevel(BatteryChargeLevel batteryChargeLevel) {
		this.batteryChargeLevel = batteryChargeLevel;
	}
	public Outage getOutage() {
		return outage;
	}
	public void setOutage(Outage outage) {
		this.outage = outage;
	}
	
	
}
