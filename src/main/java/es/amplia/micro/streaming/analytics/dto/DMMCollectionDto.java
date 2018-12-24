package es.amplia.micro.streaming.analytics.dto;

public class DMMCollectionDto {

	private String version;
	private boolean trustedBoot;
	private EventDto eventDto;
	
	public DMMCollectionDto() {
		
	}
	
	public DMMCollectionDto(String version, boolean trustedBoot, EventDto eventDto) {
		super();
		this.version = version;
		this.trustedBoot = trustedBoot;
		this.eventDto = eventDto;
	}
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public boolean isTrustedBoot() {
		return trustedBoot;
	}
	public void setTrustedBoot(boolean trustedBoot) {
		this.trustedBoot = trustedBoot;
	}
	public EventDto getEventDto() {
		return eventDto;
	}
	public void setEventDto(EventDto eventDto) {
		this.eventDto = eventDto;
	}
}
