package es.amplia.micro.streaming.analytics.dto;

import java.util.List;

import static es.amplia.micro.streaming.analytics.utils.Constants.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection=DEVICE_DTO)
public class Device {

	@Id
	private ObjectId deviceId;
	private String id;
	private List<String> path;
	private String name;
	private String description;
	private Hardware hardware;
	private String operationalStatus;
	private List<Software> softwareList;
	private Location location;
	private Temperature temperature;
	private Usage cpuUsage;
	private Ram ram;
	private VolatilStorage volatilStorage;
	private NonVolatilStorage nonVolatilStorage;
	private PowerSupply powerSupply;
	private List<CommunicationsModule> communicationsModules;
	
	public Device() {
		
	}
	
	public Device(String id, List<String> path, String name, String description, Hardware hardware,
			String operationalStatus, List<Software> softwareList, Location location,
			Temperature temperature, Usage cpuUsage, Ram ram, VolatilStorage volatilStorage,
			NonVolatilStorage nonVolatilStorage, PowerSupply powerSupply,
			List<CommunicationsModule> communicationsModules) {
		super();
		this.id = id;
		this.path = path;
		this.name = name;
		this.description = description;
		this.hardware = hardware;
		this.operationalStatus = operationalStatus;
		this.softwareList = softwareList;
		this.location = location;
		this.temperature = temperature;
		this.cpuUsage = cpuUsage;
		this.ram = ram;
		this.volatilStorage = volatilStorage;
		this.nonVolatilStorage = nonVolatilStorage;
		this.powerSupply = powerSupply;
		this.communicationsModules = communicationsModules;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<String> getPath() {
		return path;
	}
	public void setPath(List<String> path) {
		this.path = path;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public List<Software> getSoftwareList() {
		return softwareList;
	}
	public void setSoftwareList(List<Software> softwareList) {
		this.softwareList = softwareList;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Temperature getTemperature() {
		return temperature;
	}
	public void setTemperature(Temperature temperature) {
		this.temperature = temperature;
	}
	public Usage getCpuUsage() {
		return cpuUsage;
	}
	public void setCpuUsage(Usage cpuUsage) {
		this.cpuUsage = cpuUsage;
	}
	public Ram getRam() {
		return ram;
	}
	public void setRam(Ram ram) {
		this.ram = ram;
	}
	public VolatilStorage getVolatilStorage() {
		return volatilStorage;
	}
	public void setVolatilStorage(VolatilStorage volatilStorage) {
		this.volatilStorage = volatilStorage;
	}
	public NonVolatilStorage getNonVolatilStorage() {
		return nonVolatilStorage;
	}
	public void setNonVolatilStorage(NonVolatilStorage nonVolatilStorage) {
		this.nonVolatilStorage = nonVolatilStorage;
	}
	public PowerSupply getPowerSupply() {
		return powerSupply;
	}
	public void setPowerSupply(PowerSupply powerSupply) {
		this.powerSupply = powerSupply;
	}
	public List<CommunicationsModule> getCommunicationsModules() {
		return communicationsModules;
	}
	public void setCommunicationsModules(List<CommunicationsModule> communicationsModules) {
		this.communicationsModules = communicationsModules;
	}
	public ObjectId getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(ObjectId deviceId) {
		this.deviceId = deviceId;
	}
}
