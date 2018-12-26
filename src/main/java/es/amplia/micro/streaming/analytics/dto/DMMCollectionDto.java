package es.amplia.micro.streaming.analytics.dto;

public class DMMCollectionDto {

	private String version;
	private boolean trustedBoot;
	private Event event;
	
	public DMMCollectionDto() {
		
	}
	
	public DMMCollectionDto(String version, boolean trustedBoot, Event event) {
		super();
		this.version = version;
		this.trustedBoot = trustedBoot;
		this.event = event;
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
	public Event getEvent() {
		return event;
	}
	public void setEvent(Event event) {
		this.event = event;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DMMCollectionDto [version=");
		builder.append(version);
		builder.append(", trustedBoot=");
		builder.append(trustedBoot);
		builder.append(", event=");
		builder.append(event);
		builder.append("]");
		return builder.toString();
	}
}
