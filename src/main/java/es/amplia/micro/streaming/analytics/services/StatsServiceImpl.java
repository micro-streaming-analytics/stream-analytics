package es.amplia.micro.streaming.analytics.services;

import java.util.List;
import java.util.stream.DoubleStream;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import es.amplia.micro.streaming.analytics.dto.Device;
import es.amplia.micro.streaming.analytics.dto.Temperature;
import es.amplia.micro.streaming.analytics.services.model.Stats;

@Service
public class StatsServiceImpl implements StatsService {

	@Override
	public Stats buildStats(DoubleStream doubleStream) {
		Stats stats = new Stats();
		stats.setAverage(getAverage(doubleStream));
		stats.setMedian(getMedian(doubleStream));
		stats.setTrend(getTrend(doubleStream));
		stats.setTypicalDeviation(getTypicalDeviation(doubleStream));
		stats.setQuartiles(getQuartiles(doubleStream));
		stats.setMax(getMax(doubleStream));
		stats.setMin(getMin(doubleStream));
		stats.setRegistryDate("");
		return stats;
	}
	
	@Override
	public Double getAverage(DoubleStream doubleStream) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Double getMedian(DoubleStream doubleStream) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Double getTrend(DoubleStream doubleStream) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Double getTypicalDeviation(DoubleStream doubleStream) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Double getQuartiles(DoubleStream doubleStream) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getMax(DoubleStream doubleStream) {
		return doubleStream.max().orElse(Double.NaN);
	}

	@Override
	public Double getMin(DoubleStream doubleStream) {
		return doubleStream.min().orElse(Double.NaN);
	}

	private Double getRelativeFrequency(final String elemento, List<Device> devices) {
		return CollectionUtils.isEmpty(devices) ? 0.00 :
			(double) (devices.stream().map(Device::getTemperature)
			.map(Temperature::getCurrent)
			.filter(elemento::equals).count()/devices.size());
	}
}
