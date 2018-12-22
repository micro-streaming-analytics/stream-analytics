package es.amplia.micro.streaming.analytics.dto;

public class RamDto {

	private String unit;
	private String total;
	private UsageDto ramUsageDto;
	
	public RamDto() {
		
	}
	
	public RamDto(String unit, String total, RamUsageDto ramUsageDto) {
		super();
		this.unit = unit;
		this.total = total;
		this.ramUsageDto = ramUsageDto;
	}
	
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public UsageDto getRamUsageDto() {
		return ramUsageDto;
	}
	public void setUsageDto(UsageDto ramUsageDto) {
		this.ramUsageDto = ramUsageDto;
	}
}
