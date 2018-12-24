package es.amplia.micro.streaming.analytics.dto;

import java.util.List;

public class Event {

	private String id;
	private Device device;
	
	public Event() {
		
	}

	public Event(String id, Device device) {
		super();
		this.id = id;
		this.device = device;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}
	
}
