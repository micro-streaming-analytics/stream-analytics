package es.amplia.micro.streaming.analytics.dto;

public class NonVolatilStorageDto {

	private String unit;
	private String total;
	private UsageDto nonUolatilStorageUseDto;
	
	public NonVolatilStorageDto() {
		
	}
	
	public NonVolatilStorageDto(String unit, String total, UsageDto nonUolatilStorageUseDto) {
		super();
		this.unit = unit;
		this.total = total;
		this.nonUolatilStorageUseDto = nonUolatilStorageUseDto;
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
		return nonUolatilStorageUseDto;
	}
	public void setVolatilStorageUseDto(UsageDto nonUolatilStorageUseDto) {
		this.nonUolatilStorageUseDto = nonUolatilStorageUseDto;
	}
}
