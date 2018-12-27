package es.amplia.micro.streaming.analytics.services;

import java.util.List;
import java.util.Map;

import es.amplia.micro.streaming.analytics.services.model.Stats;

public interface StatsService {
	
	Stats buildStats(final List<String> stream);
	
	Double getAverage(final List<String> stream);
	
	Double getMedian(final List<String> stream);
	
	Double getTrend(final List<String> stream);
	
	Double getStandardDeviation(final List<String> stream);
	
	Map<Integer, Double> getQuartiles(final List<String> stream);
	
	Double getMax(final List<String> stream);
	
	Double getMin(final List<String> stream);
}
