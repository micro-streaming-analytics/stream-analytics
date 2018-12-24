package es.amplia.micro.streaming.analytics.dto;

import java.util.List;

public class CommunicationsModule {

	private Long id;
	private String name;
	private String type;
	private Hardware hardware;
	private String operationalStatus;
	private String antennaStatus;
	private List<Software>softwares;
	private Mobile mobile;
	private Subscriber subscriber;
	
	public CommunicationsModule() {
		
	}
	
	public CommunicationsModule(Long id, String name, String type, Hardware hardware, String operationalStatus,
			String antennaStatus, List<Software> softwares, Mobile mobile, Subscriber subscriber) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.hardware = hardware;
		this.operationalStatus = operationalStatus;
		this.antennaStatus = antennaStatus;
		this.softwares = softwares;
		this.mobile = mobile;
		this.subscriber = subscriber;
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
	public Hardware getHardware() {
		return hardware;
	}
	public void setHardware(Hardware hardware) {
		this.hardware = hardware;
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
	public List<Software> getSoftwares() {
		return softwares;
	}
	public void setSoftwares(List<Software> softwares) {
		this.softwares = softwares;
	}
	public Mobile getMobile() {
		return mobile;
	}
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	public Subscriber getSubscriber() {
		return subscriber;
	}
	public void setSubscriber(Subscriber subscriber) {
		this.subscriber = subscriber;
	}
}
