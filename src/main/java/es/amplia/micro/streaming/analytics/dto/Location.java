package es.amplia.micro.streaming.analytics.dto;

public class Location {

	private String timestamp;
	private Coordinates coordinates;
	
	public Location() {
		
	}
	
	public Location(String timestamp, Coordinates coordinates) {
		super();
		this.timestamp = timestamp;
		this.coordinates = coordinates;
	}
	
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public Coordinates getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}
	
	
}
