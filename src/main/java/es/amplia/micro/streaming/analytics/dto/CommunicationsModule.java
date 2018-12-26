package es.amplia.micro.streaming.analytics.dto;

import java.util.List;

public class CommunicationsModule {

	private String id;
	private String name;
	private String type;
	private Hardware hardware;
	private String operationalStatus;
	private String antennaStatus;
	private List<Software> sofwareList;
	private Mobile mobile;
	private Subscriber subscriber;
	private Subscription subscription;
	
	public CommunicationsModule() {
		
	}
	
	public CommunicationsModule(String id, String name, String type, Hardware hardware, String operationalStatus,
			String antennaStatus, List<Software> sofwareList, Mobile mobile, Subscriber subscriber,
			Subscription subscription) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.hardware = hardware;
		this.operationalStatus = operationalStatus;
		this.antennaStatus = antennaStatus;
		this.sofwareList = sofwareList;
		this.mobile = mobile;
		this.subscriber = subscriber;
		this.subscription = subscription;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public List<Software> getSoftwareList() {
		return sofwareList;
	}
	public void setSoftwareList(List<Software> sofwareList) {
		this.sofwareList = sofwareList;
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

	public Subscription getSubscription() {
		return subscription;
	}

	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
	}
}
