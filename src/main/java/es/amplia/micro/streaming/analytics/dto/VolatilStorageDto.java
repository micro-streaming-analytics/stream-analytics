package es.amplia.micro.streaming.analytics.dto;

public class VolatilStorageDto {

	private String unit;
	private String total;
	private UsageDto volatilStorageUseDto;
	
	public VolatilStorageDto() {
		
	}
	
	public VolatilStorageDto(String unit, String total, UsageDto volatilStorageUseDto) {
		super();
		this.unit = unit;
		this.total = total;
		this.volatilStorageUseDto = volatilStorageUseDto;
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
	public UsageDto getVolatilStorageUseDto() {
		return volatilStorageUseDto;
	}
	public void setVolatilStorageUseDto(UsageDto volatilStorageUseDto) {
		this.volatilStorageUseDto = volatilStorageUseDto;
	}
}
