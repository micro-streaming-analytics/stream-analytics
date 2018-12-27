package es.amplia.micro.streaming.analytics.services;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import es.amplia.micro.streaming.analytics.services.model.Stats;

@RunWith(MockitoJUnitRunner.class)
public class StatsServiceTest {

	private static final String _50 = "50";
	
	private static List<String> emptyList;
	private static List<String> nullList;
	private static List<String> listNotEmpty;
	
	@Spy
	private StatsServiceImpl statsService;
	
	@BeforeClass
	public static void init() {
		emptyList = new ArrayList<String>();
		nullList = null;
		listNotEmpty = new ArrayList<String>();
		listNotEmpty.add(_50);
	}
	
	@Test
	public void buildStats_nullList_notNull() {
		// given
		
		// when
		Stats stats = statsService.buildStats(nullList);
		// then
		assertNotNull(stats);
	}
	
	@Test
	public void getAverage_emptyList_notNull() {
		// given
		
		// when
		double average = statsService.getAverage(emptyList);
		// then
		assertNotNull(average);
	}

	@Test
	public void getAverage_listNotEmpty_notNull() {
		// given
		
		// when
		double average = statsService.getAverage(listNotEmpty);
		// then
		assertNotNull(average);
	}
	
	@Test
	public void getAverage_null_notNull() {
		// given
		
		// when
		double average = statsService.getAverage(nullList);
		// then
		assertNotNull(average);
	}
	
	@Test
	public void getMax_emptyList_notNull() {
		// given
		
		// when
		double max = statsService.getMax(emptyList);
		// then
		assertNotNull(max);
	}

	@Test
	public void getMax_listNotEmpty_notNull() {
		// given
		
		// when
		double max = statsService.getMax(listNotEmpty);
		// then
		assertNotNull(max);
	}
	
	@Test
	public void getMax_null_notNull() {
		// given
		
		// when
		double max = statsService.getMax(nullList);
		// then
		assertNotNull(max);
	}
	
	@Test
	public void getMedian_emptyList_notNull() {
		// given
		
		// when
		double median = statsService.getMedian(emptyList);
		// then
		assertNotNull(median);
	}

	@Test
	public void getMedian_listNotEmpty_notNull() {
		// given
		
		// when
		double median = statsService.getMedian(listNotEmpty);
		// then
		assertNotNull(median);
	}
	
	@Test
	public void getMedian_listNotEmptyTwoValues_notNull() {
		// given
		listNotEmpty.add(_50);
		// when
		double median = statsService.getMedian(listNotEmpty);
		// then
		assertNotNull(median);
	}
	
	@Test
	public void getMedian_null_notNull() {
		// given
		
		// when
		double median = statsService.getMedian(nullList);
		// then
		assertNotNull(median);
	}
	
	@Test
	public void getMin_emptyList_notNull() {
		// given
		
		// when
		double min = statsService.getMin(emptyList);
		// then
		assertNotNull(min);
	}

	@Test
	public void getMin_listNotEmpty_notNull() {
		// given
		
		// when
		double min = statsService.getMin(listNotEmpty);
		// then
		assertNotNull(min);
	}
	
	@Test
	public void getMin_null_notNull() {
		// given
		
		// when
		double min = statsService.getMin(nullList);
		// then
		assertNotNull(min);
	}
	
	@Test
	public void getQuartiles_emptyList_notNull() {
		// given
		
		// when
		Map<Integer, Double> quartiles = statsService.getQuartiles(emptyList);
		// then
		assertNotNull(quartiles);
	}

	@Test
	public void getQuartiles_listNotEmpty_notNull() {
		// given
		
		// when
		Map<Integer, Double> quartiles = statsService.getQuartiles(listNotEmpty);
		// then
		assertNotNull(quartiles);
	}
	
	@Test
	public void getQuartiles_null_notNull() {
		// given
		
		// when
		Map<Integer, Double> quartiles = statsService.getQuartiles(nullList);
		// then
		assertNotNull(quartiles);
	}
	
	@Test
	public void getStandardDeviation_emptyList_notNull() {
		// given
		
		// when
		double stdDeviation = statsService.getStandardDeviation(emptyList);
		// then
		assertNotNull(stdDeviation);
	}

	@Test
	public void getStandardDeviation_listNotEmpty_notNull() {
		// given
		
		// when
		double stdDeviation = statsService.getStandardDeviation(listNotEmpty);
		// then
		assertNotNull(stdDeviation);
	}
	
	@Test
	public void getStandardDeviation_null_notNull() {
		// given
		
		// when
		double stdDeviation = statsService.getStandardDeviation(nullList);
		// then
		assertNotNull(stdDeviation);
	}
	
	@Test
	public void getTrend_emptyList_notNull() {
		// given
		
		// when
		double trend = statsService.getTrend(emptyList);
		// then
		assertNotNull(trend);
	}

	@Test
	public void getTrend_listNotEmpty_notNull() {
		// given
		
		// when
		double trend = statsService.getTrend(listNotEmpty);
		// then
		assertNotNull(trend);
	}
	
	@Test
	public void getTrend_null_notNull() {
		// given
		
		// when
		double trend = statsService.getTrend(nullList);
		// then
		assertNotNull(trend);
	}

}
