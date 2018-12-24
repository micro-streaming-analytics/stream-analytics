package es.amplia.micro.streaming.analytics.dto;

public class Mobile {

	private String mr;
	private String apn;
	private String bcch;
	private String cgi;
	private String cellId;
	private String lac;
	private String ratType;
	private String plmn;
	private String timingAdvance;
	private String signalStrength;
	private String signalStrengthMax;
	private String signalStrengthMin;
	private String signalQuality;
	private String signalQualityMax;
	private String signalQualityMin;
	
	public Mobile() {
		
	}
	
	public Mobile(String mr, String apn, String bcch, String cgi, String cellId, String lac, String ratType,
			String plmn, String timingAdvance, String signalStrength, String signalStrengthMax,
			String signalStrengthMin, String signalQuality, String signalQualityMax, String signalQualityMin) {
		super();
		this.mr = mr;
		this.apn = apn;
		this.bcch = bcch;
		this.cgi = cgi;
		this.cellId = cellId;
		this.lac = lac;
		this.ratType = ratType;
		this.plmn = plmn;
		this.timingAdvance = timingAdvance;
		this.signalStrength = signalStrength;
		this.signalStrengthMax = signalStrengthMax;
		this.signalStrengthMin = signalStrengthMin;
		this.signalQuality = signalQuality;
		this.signalQualityMax = signalQualityMax;
		this.signalQualityMin = signalQualityMin;
	}
	
	public String getMr() {
		return mr;
	}
	public void setMr(String mr) {
		this.mr = mr;
	}
	public String getApn() {
		return apn;
	}
	public void setApn(String apn) {
		this.apn = apn;
	}
	public String getBcch() {
		return bcch;
	}
	public void setBcch(String bcch) {
		this.bcch = bcch;
	}
	public String getCgi() {
		return cgi;
	}
	public void setCgi(String cgi) {
		this.cgi = cgi;
	}
	public String getCellId() {
		return cellId;
	}
	public void setCellId(String cellId) {
		this.cellId = cellId;
	}
	public String getLac() {
		return lac;
	}
	public void setLac(String lac) {
		this.lac = lac;
	}
	public String getRatType() {
		return ratType;
	}
	public void setRatType(String ratType) {
		this.ratType = ratType;
	}
	public String getPlmn() {
		return plmn;
	}
	public void setPlmn(String plmn) {
		this.plmn = plmn;
	}
	public String getTimingAdvance() {
		return timingAdvance;
	}
	public void setTimingAdvance(String timingAdvance) {
		this.timingAdvance = timingAdvance;
	}
	public String getSignalStrength() {
		return signalStrength;
	}
	public void setSignalStrength(String signalStrength) {
		this.signalStrength = signalStrength;
	}
	public String getSignalStrengthMax() {
		return signalStrengthMax;
	}
	public void setSignalStrengthMax(String signalStrengthMax) {
		this.signalStrengthMax = signalStrengthMax;
	}
	public String getSignalStrengthMin() {
		return signalStrengthMin;
	}
	public void setSignalStrengthMin(String signalStrengthMin) {
		this.signalStrengthMin = signalStrengthMin;
	}
	public String getSignalQuality() {
		return signalQuality;
	}
	public void setSignalQuality(String signalQuality) {
		this.signalQuality = signalQuality;
	}
	public String getSignalQualityMax() {
		return signalQualityMax;
	}
	public void setSignalQualityMax(String signalQualityMax) {
		this.signalQualityMax = signalQualityMax;
	}
	public String getSignalQualityMin() {
		return signalQualityMin;
	}
	public void setSignalQualityMin(String signalQualityMin) {
		this.signalQualityMin = signalQualityMin;
	}
}
