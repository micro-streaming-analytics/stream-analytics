package es.amplia.micro.streaming.analytics.services;

import java.util.List;
import java.util.stream.DoubleStream;

import org.springframework.stereotype.Service;
import static org.springframework.util.CollectionUtils.*;

import es.amplia.micro.streaming.analytics.services.model.Stats;

@Service
public class StatsServiceImpl implements StatsService {

	@Override
	public Stats buildStats(List<String> list) {
		Stats stats = new Stats();
		stats.setAverage(getAverage(list));
		stats.setMedian(getMedian(list));
		stats.setTrend(getTrend(list));
		stats.setTypicalDeviation(getStandardDeviation(list));
		stats.setQuartiles(getQuartiles(list));
		stats.setMax(getMax(list));
		stats.setMin(getMin(list));
		return stats;
	}

	@Override
	public Double getAverage(List<String> list) {
		return isEmpty(list) ? Double.NaN : list.stream().mapToDouble(Double::new).average().orElse(Double.NaN);
	}

	@Override
	public Double getMedian(final List<String> list) {
		return isEmpty(list) ? Double.NaN : getMedianIfListNotNull(list);
	}

	@Override
	public Double getTrend(final List<String> list) {
		return null;
	}

	@Override
	public Double getStandardDeviation(final List<String> list) {
		return Math.sqrt(getVariance(list));
	}

	@Override
	public Double getQuartiles(final List<String> list) {
		return null;
	}

	@Override
	public Double getMax(final List<String> list) {
		return isEmpty(list) ? Double.NaN : list.stream().mapToDouble(Double::new).max().orElse(Double.NaN);
	}

	@Override
	public Double getMin(final List<String> list) {
		return isEmpty(list) ? Double.NaN : list.stream().mapToDouble(Double::new).min().orElse(Double.NaN);
	}

	private Double getMedianIfListNotNull(final List<String> list) {
		DoubleStream sortedList = list.stream().mapToDouble(Double::new).sorted();
		return list.size() % 2 == 0 ? sortedList.skip(list.size() / 2 - 1).limit(2).average().getAsDouble()
				: sortedList.skip(list.size() / 2).findFirst().getAsDouble();
	}

	private double getVariance(final List<String> list) {
		return isEmpty(list) ? Double.NaN : getVarianceIfListNotNull(list);
	}

	private double getVarianceIfListNotNull(final List<String> list) {
		double average = getAverage(list);
		double temp = 0;
		for (String a : list) {
			temp += Math.pow(Double.parseDouble(a) - average, 3);
		}
		return temp / list.size();
	}
}
