package es.amplia.micro.streaming.analytics.services.model;

import java.util.Map;

public class Stats {

	private Double average;
	private Double median;
	private Double trend;
	private Double typicalDeviation;
	private Map<Integer, Double> quartiles;
	private Double max;
	private Double min;
	
	public Stats() {
		
	}
	
	public Stats(Double average, Double median, Double trend, Double typicalDeviation, Map<Integer, Double> quartiles, Double max,
			Double min) {
		super();
		this.average = average;
		this.median = median;
		this.trend = trend;
		this.typicalDeviation = typicalDeviation;
		this.quartiles = quartiles;
		this.max = max;
		this.min = min;
	}
	
	public Double getAverage() {
		return average;
	}
	public void setAverage(Double average) {
		this.average = average;
	}
	public Double getMedian() {
		return median;
	}
	public void setMedian(Double median) {
		this.median = median;
	}
	public Double getTrend() {
		return trend;
	}
	public void setTrend(Double trend) {
		this.trend = trend;
	}
	public Double getTypicalDeviation() {
		return typicalDeviation;
	}
	public void setTypicalDeviation(Double typicalDeviation) {
		this.typicalDeviation = typicalDeviation;
	}
	public Map<Integer, Double> getQuartiles() {
		return quartiles;
	}
	public void setQuartiles(Map<Integer, Double> quartiles) {
		this.quartiles = quartiles;
	}
	public Double getMax() {
		return max;
	}
	public void setMax(Double max) {
		this.max = max;
	}
	public Double getMin() {
		return min;
	}
	public void setMin(Double min) {
		this.min = min;
	}
}
