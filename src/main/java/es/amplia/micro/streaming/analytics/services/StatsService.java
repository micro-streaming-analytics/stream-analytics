package es.amplia.micro.streaming.analytics.services;

import java.util.stream.DoubleStream;
import es.amplia.micro.streaming.analytics.services.model.Stats;

public interface StatsService {
	
	Stats buildStats(DoubleStream doubleStream);
	
	Double getAverage(DoubleStream doubleStream);
	
	Double getMedian(DoubleStream doubleStream);
	
	Double getTrend(final DoubleStream doubleStream);
	
	Double getTypicalDeviation(DoubleStream doubleStream);
	
	Double getQuartiles(DoubleStream doubleStream);
	
	Double getMax(final DoubleStream doubleStream);
	
	Double getMin(final DoubleStream doubleStream);
}
