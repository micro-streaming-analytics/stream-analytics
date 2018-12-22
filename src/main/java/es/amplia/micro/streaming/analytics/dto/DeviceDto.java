package es.amplia.micro.streaming.analytics.dto;

import java.util.List;

public class DeviceDto {

	private Long id;
	private String path;
	private String name;
	private String description;
	private HardwareDto hardwareDto;
	private String operationalStatus;
	private List<SoftwareDto> softwaresDto;
	private LocationDto locationDto;
	private TemperatureDto temperatureDto;
	private UsageDto cpuUsageDto;
	private RamDto ramDto;
	private VolatilStorageDto volatilStorageDto;
	private NonVolatilStorageDto nonVolatilStorageDto;
	private PowerSupplyDto powerSupplyDto;
	private List<CommunicationsModuleDto> communicationsModulesDto;
	
	public DeviceDto() {
		
	}
	
	public DeviceDto(Long id, String path, String name, String description, HardwareDto hardwareDto,
			String operationalStatus, List<SoftwareDto> softwaresDto, LocationDto locationDto,
			TemperatureDto temperatureDto, CpuUsageDto cpuUsageDto, RamDto ramDto, VolatilStorageDto volatilStorageDto,
			NonVolatilStorageDto nonVolatilStorageDto, PowerSupplyDto powerSupplyDto,
			List<CommunicationsModuleDto> communicationsModulesDto) {
		super();
		this.id = id;
		this.path = path;
		this.name = name;
		this.description = description;
		this.hardwareDto = hardwareDto;
		this.operationalStatus = operationalStatus;
		this.softwaresDto = softwaresDto;
		this.locationDto = locationDto;
		this.temperatureDto = temperatureDto;
		this.cpuUsageDto = cpuUsageDto;
		this.ramDto = ramDto;
		this.volatilStorageDto = volatilStorageDto;
		this.nonVolatilStorageDto = nonVolatilStorageDto;
		this.powerSupplyDto = powerSupplyDto;
		this.communicationsModulesDto = communicationsModulesDto;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
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
	public List<SoftwareDto> getSoftwaresDto() {
		return softwaresDto;
	}
	public void setSoftwaresDto(List<SoftwareDto> softwaresDto) {
		this.softwaresDto = softwaresDto;
	}
	public LocationDto getLocationDto() {
		return locationDto;
	}
	public void setLocationDto(LocationDto locationDto) {
		this.locationDto = locationDto;
	}
	public TemperatureDto getTemperatureDto() {
		return temperatureDto;
	}
	public void setTemperatureDto(TemperatureDto temperatureDto) {
		this.temperatureDto = temperatureDto;
	}
	public CpuUsageDto getCpuUsageDto() {
		return cpuUsageDto;
	}
	public void setCpuUsageDto(CpuUsageDto cpuUsageDto) {
		this.cpuUsageDto = cpuUsageDto;
	}
	public RamDto getRamDto() {
		return ramDto;
	}
	public void setRamDto(RamDto ramDto) {
		this.ramDto = ramDto;
	}
	public VolatilStorageDto getVolatilStorageDto() {
		return volatilStorageDto;
	}
	public void setVolatilStorageDto(VolatilStorageDto volatilStorageDto) {
		this.volatilStorageDto = volatilStorageDto;
	}
	public NonVolatilStorageDto getNonVolatilStorageDto() {
		return nonVolatilStorageDto;
	}
	public void setNonVolatilStorageDto(NonVolatilStorageDto nonVolatilStorageDto) {
		this.nonVolatilStorageDto = nonVolatilStorageDto;
	}
	public PowerSupplyDto getPowerSupplyDto() {
		return powerSupplyDto;
	}
	public void setPowerSupplyDto(PowerSupplyDto powerSupplyDto) {
		this.powerSupplyDto = powerSupplyDto;
	}
	public List<CommunicationsModuleDto> getCommunicationsModulesDto() {
		return communicationsModulesDto;
	}
	public void setCommunicationsModulesDto(List<CommunicationsModuleDto> communicationsModulesDto) {
		this.communicationsModulesDto = communicationsModulesDto;
	}
	
	
}
