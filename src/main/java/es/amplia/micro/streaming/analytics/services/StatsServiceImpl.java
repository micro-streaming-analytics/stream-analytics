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
	public Stats buildStats(List<String> list) {
		Stats stats = new Stats();
		stats.setAverage(getAverage(list));
		stats.setMedian(getMedian(list));
		stats.setTrend(getTrend(list));
		stats.setTypicalDeviation(getTypicalDeviation(list));
		stats.setQuartiles(getQuartiles(list));
		stats.setMax(getMax(list));
		stats.setMin(getMin(list));
		stats.setRegistryDate("");
		return stats;
	}
	
	@Override
	public Double getAverage(List<String> list) {
		return list.stream().mapToDouble(Double::new).average().orElse(Double.NaN);
	}
	
	@Override
	public Double getMedian(final List<String> list) {
		DoubleStream sortedList = list.stream().mapToDouble(Double::new).sorted();
		return list.size()%2==0 ?
				sortedList.skip(list.size()/2-1).limit(2).average().getAsDouble():
					sortedList.skip(list.size()/2).findFirst().getAsDouble();
	}
	
	@Override
	public Double getTrend(final List<String> list) {
		return null;
	}
	
	@Override
	public Double getTypicalDeviation(final List<String> list) {
		return null;
	}
	
	@Override
	public Double getQuartiles(final List<String> list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getMax(final List<String> list) {
		return list.stream().mapToDouble(Double::new).max().orElse(Double.NaN);
	}

	@Override
	public Double getMin(final List<String> list) {
		return list.stream().mapToDouble(Double::new).min().orElse(Double.NaN);
	}

	private Double getRelativeFrequency(final String elemento, List<Device> devices) {
		return CollectionUtils.isEmpty(devices) ? 0.00 :
			(double) (devices.stream().map(Device::getTemperature)
			.map(Temperature::getCurrent)
			.filter(elemento::equals).count()/devices.size());
	}
}
