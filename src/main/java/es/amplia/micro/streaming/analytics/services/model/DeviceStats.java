package es.amplia.micro.streaming.analytics.services.model;

public class DeviceStats {

	private Long deviceId;
	private Stats temperature;
	private Stats cpuUsage;
	private Stats ram;
	private Stats volatilStorage;
	private Stats nonVolatilStorage;

	public DeviceStats() {

	}

	public DeviceStats(Long deviceId, Stats temperature, Stats cpuUsage, Stats ram, Stats volatilStorage,
			Stats nonVolatilStorage) {
		super();
		this.deviceId = deviceId;
		this.temperature = temperature;
		this.cpuUsage = cpuUsage;
		this.ram = ram;
		this.volatilStorage = volatilStorage;
		this.nonVolatilStorage = nonVolatilStorage;
	}

	public Long getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}

	public Stats getTemperature() {
		return temperature;
	}

	public void setTemperature(Stats temperature) {
		this.temperature = temperature;
	}

	public Stats getCpuUsage() {
		return cpuUsage;
	}

	public void setCpuUsage(Stats cpuUsage) {
		this.cpuUsage = cpuUsage;
	}

	public Stats getRam() {
		return ram;
	}

	public void setRam(Stats ram) {
		this.ram = ram;
	}

	public Stats getVolatilStorage() {
		return volatilStorage;
	}

	public void setVolatilStorage(Stats volatilStorage) {
		this.volatilStorage = volatilStorage;
	}

	public Stats getNonVolatilStorage() {
		return nonVolatilStorage;
	}

	public void setNonVolatilStorage(Stats nonVolatilStorage) {
		this.nonVolatilStorage = nonVolatilStorage;
	}
}
