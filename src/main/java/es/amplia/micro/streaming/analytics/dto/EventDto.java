package es.amplia.micro.streaming.analytics.dto;

public class EventDto {

	private Long id;
	private DeviceDto deviceDto;
	
	public EventDto() {
		
	}
	
	public EventDto(Long id, DeviceDto deviceDto) {
		super();
		this.id = id;
		this.deviceDto = deviceDto;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public DeviceDto getDeviceDto() {
		return deviceDto;
	}
	public void setDeviceDto(DeviceDto deviceDto) {
		this.deviceDto = deviceDto;
	}
}
