package es.amplia.micro.streaming.analytics.dto;

public class VolatilStorage {

	private String unit;
	private String total;
	private Usage volatilStorageUse;
	
	public VolatilStorage() {
		
	}
	
	public VolatilStorage(String unit, String total, Usage volatilStorageUse) {
		super();
		this.unit = unit;
		this.total = total;
		this.volatilStorageUse = volatilStorageUse;
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
		return volatilStorageUse;
	}
	public void setVolatilStorageUse(Usage volatilStorageUse) {
		this.volatilStorageUse = volatilStorageUse;
	}
}
