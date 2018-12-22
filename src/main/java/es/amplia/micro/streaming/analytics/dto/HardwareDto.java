package es.amplia.micro.streaming.analytics.dto;

public class HardwareDto {

	private String serialNumber;
	private ManufacturerDto manufacturerDto;
	private ModelDto modelDto;
	private String clockDate;
	private String upTime;
	
	public HardwareDto() {
		
	}
	
	public HardwareDto(String serialNumber, ManufacturerDto manufacturerDto, ModelDto modelDto, String clockDate,
			String upTime) {
		super();
		this.serialNumber = serialNumber;
		this.manufacturerDto = manufacturerDto;
		this.modelDto = modelDto;
		this.clockDate = clockDate;
		this.upTime = upTime;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public ManufacturerDto getManufacturerDto() {
		return manufacturerDto;
	}
	public void setManufacturerDto(ManufacturerDto manufacturerDto) {
		this.manufacturerDto = manufacturerDto;
	}
	public ModelDto getModelDto() {
		return modelDto;
	}
	public void setModelDto(ModelDto modelDto) {
		this.modelDto = modelDto;
	}
	public String getClockDate() {
		return clockDate;
	}
	public void setClockDate(String clockDate) {
		this.clockDate = clockDate;
	}
	public String getUpTime() {
		return upTime;
	}
	public void setUpTime(String upTime) {
		this.upTime = upTime;
	}
}
