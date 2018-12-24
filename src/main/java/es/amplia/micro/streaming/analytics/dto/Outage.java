package es.amplia.micro.streaming.analytics.dto;

public class Outage {

	private String timestamp;
	private String duration;
	
	public Outage() {
		
	}
	
	public Outage(String timestamp, String duration) {
		super();
		this.timestamp = timestamp;
		this.duration = duration;
	}
	
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	
}
