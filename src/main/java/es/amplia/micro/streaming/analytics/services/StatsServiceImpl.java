package es.amplia.micro.streaming.analytics.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import org.springframework.data.util.Pair;
import org.springframework.stereotype.Service;

import com.google.common.math.Quantiles;

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
		return isEmpty(list) ? Double.NaN : getTrendIfListNotNull(list);
	}

	@Override
	public Double getStandardDeviation(final List<String> list) {
		return Math.sqrt(getVariance(list));
	}

	@Override
	public Map<Integer, Double> getQuartiles(final List<String> list) {
		return isEmpty(list) ? new HashMap<>() : getQuartilesIfListNotNull(list);
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
	
	private Double getTrendIfListNotNull(List<String> list) {
		return Double.parseDouble(list.stream().map(e -> Pair.of(e, getRelativeFrequency(e, list))).max((o1, o2) -> 
			o1.getSecond() > o2.getSecond() ? 1 : o1.getSecond() == o2.getSecond() ? 0: -1).orElse(Pair.of("NaN", 0.0)).getFirst());
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
	
	private Double getRelativeFrequency(final String elemento, List<String> list) {
		double concurrences = list.stream().filter(elemento::equals).count();
		double listSize = list.size();
		return concurrences/listSize;
	}
	
	private Map<Integer, Double> getQuartilesIfListNotNull(List<String> list) {
		return Quantiles.quartiles().indexes(1, 2, 3).compute(list.stream().mapToDouble(Double::new).toArray());
	}
}
