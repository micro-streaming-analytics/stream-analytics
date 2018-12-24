package es.amplia.micro.streaming.analytics.dto;

import java.util.List;

public class CommunicationsModuleDto {

	private Long id;
	private String name;
	private String type;
	private HardwareDto hardwareDto;
	private String operationalStatus;
	private String antennaStatus;
	private List<SoftwareDto>softwares;
	private MobileDto mobileDto;
	private SubscriberDto subscriberDto;
	
	public CommunicationsModuleDto() {
		
	}
	
	public CommunicationsModuleDto(Long id, String name, String type, HardwareDto hardwareDto, String operationalStatus,
			String antennaStatus, List<SoftwareDto> softwares, MobileDto mobileDto, SubscriberDto subscriberDto) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.hardwareDto = hardwareDto;
		this.operationalStatus = operationalStatus;
		this.antennaStatus = antennaStatus;
		this.softwares = softwares;
		this.mobileDto = mobileDto;
		this.subscriberDto = subscriberDto;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public HardwareDto getHardwareDto() {
		return hardwareDto;
	}
	public void setHardwareDto(HardwareDto hardwareDto) {
		this.hardwareDto = hardwareDto;
	}
	public String getOperationalStatus() {
		return operationalStatus;
	}
	public void setOperationalStatus(String operationalStatus) {
		this.operationalStatus = operationalStatus;
	}
	public String getAntennaStatus() {
		return antennaStatus;
	}
	public void setAntennaStatus(String antennaStatus) {
		this.antennaStatus = antennaStatus;
	}
	public List<SoftwareDto> getSoftwares() {
		return softwares;
	}
	public void setSoftwares(List<SoftwareDto> softwares) {
		this.softwares = softwares;
	}
	public MobileDto getMobileDto() {
		return mobileDto;
	}
	public void setMobileDto(MobileDto mobileDto) {
		this.mobileDto = mobileDto;
	}
	public SubscriberDto getSubscriberDto() {
		return subscriberDto;
	}
	public void setSubscriberDto(SubscriberDto subscriberDto) {
		this.subscriberDto = subscriberDto;
	}
}
