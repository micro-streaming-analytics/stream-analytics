package es.amplia.micro.streaming.analytics.dto;
public class NonVolatilStorage {

	private String unit;
	private String total;
	private Usage nonUolatilStorageUse;
	
	public NonVolatilStorage() {
		
	}
	
	public NonVolatilStorage(String unit, String total, Usage nonUolatilStorageUse) {
		super();
		this.unit = unit;
		this.total = total;
		this.nonUolatilStorageUse = nonUolatilStorageUse;
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
	public Usage getVolatilStorageUse() {
		return nonUolatilStorageUse;
	}
	public void setVolatilStorageUse(Usage nonUolatilStorageUse) {
		this.nonUolatilStorageUse = nonUolatilStorageUse;
	}
}
