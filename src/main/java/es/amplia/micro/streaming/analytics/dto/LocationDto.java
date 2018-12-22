package es.amplia.micro.streaming.analytics.dto;

public class LocationDto {

	private String timestamp;
	private String coordenates;
	
	public LocationDto() {
		
	}
	
	public LocationDto(String timestamp, String coordenates) {
		super();
		this.timestamp = timestamp;
		this.coordenates = coordenates;
	}
	
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getCoordenates() {
		return coordenates;
	}
	public void setCoordenates(String coordenates) {
		this.coordenates = coordenates;
	}
	
	
}
