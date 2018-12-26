package es.amplia.micro.streaming.analytics.services;

import java.util.List;

import es.amplia.micro.streaming.analytics.services.model.Stats;

public interface StatsService {
	
	Stats buildStats(final List<String> stream);
	
	Double getAverage(final List<String> stream);
	
	Double getMedian(final List<String> stream);
	
	Double getTrend(final List<String> stream);
	
	Double getTypicalDeviation(final List<String> stream);
	
	Double getQuartiles(final List<String> stream);
	
	Double getMax(final List<String> stream);
	
	Double getMin(final List<String> stream);
}
