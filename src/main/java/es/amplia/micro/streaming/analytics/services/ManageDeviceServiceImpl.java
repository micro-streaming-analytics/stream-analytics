package es.amplia.micro.streaming.analytics.services;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.amplia.micro.streaming.analytics.dto.DMMCollectionDto;
import es.amplia.micro.streaming.analytics.dto.Device;
import es.amplia.micro.streaming.analytics.dto.Event;
import es.amplia.micro.streaming.analytics.dto.Temperature;
import es.amplia.micro.streaming.analytics.dto.Usage;
import es.amplia.micro.streaming.analytics.services.dao.DMMCollectionRepository;
import es.amplia.micro.streaming.analytics.services.dao.DeviceStatsRepository;
import es.amplia.micro.streaming.analytics.services.model.DeviceStats;
import es.amplia.micro.streaming.analytics.services.model.Stats;

@Service
public class ManageDeviceServiceImpl implements ManageDeviceService {

	@Autowired
	StatsService statsService;
	
	@Autowired
	DMMCollectionRepository dMMCollectionRepository;
	
	@Autowired
	DeviceStatsRepository deviceStatsRepository;
	
	@Override
	public void saveDMMCollection(DMMCollectionDto collection) {
		dMMCollectionRepository.save(collection);
	}
	
	@Override
	public DeviceStats manageDeviceService(Stream<Device> devices) {
		final DeviceStats deviceStats = new DeviceStats();
		deviceStats.setTemperature(computeStatsTemperature(devices));
		deviceStats.setCpuUsage(computeStatsCpuUsage(devices));
//		deviceStats.setRam(computeStatsRam(ram));
//		deviceStats.setVolatilStorage(computeStatsVolatilStorage(volatilStorage));
//		deviceStats.setNonVolatilStorage(computeStatsNonVolatilStorage(nonVolatilStorage));
		return persistDeviceStats(deviceStats);
	}
	
	@Override
	public DeviceStats computeStatistics(String id) {
		return manageDeviceService(findDevicesById(id));
	}
	
	private Stream<Device> findDevicesById(String id){
		return dMMCollectionRepository.findAll().stream()
				.map(DMMCollectionDto::getEvent)
					.map(Event::getDevice).filter(id::equals);
	}
		
	private Stats computeStatsTemperature(final Stream<Device> devices) {
		return statsService.buildStats(devices.map(Device::getTemperature)
				.map(Temperature::getCurrent).mapToDouble(Double::new));
	}
	private Stats computeStatsCpuUsage(final Stream<Device> devices) {
		return statsService.buildStats(devices.map(Device::getCpuUsage)
				.map(Usage::getCurrent).mapToDouble(Double::new));
	}
//	private Stats computeStatsRam(final Stream<Device> devices) {
//		return statsService.buildStats(devices.map(Device::getRam)
//				.map(Usage::getCurrent).mapToDouble(Double::new));
//	}
//	private Stats computeStatsVolatilStorage(final Stream<Device> devices) {
//		return statsService.buildStats(devices.map(Device::getVolatilStorage)
//				.map(Usage::getCurrent).mapToDouble(Double::new));
//	}
//	private Stats computeStatsNonVolatilStorage(final Stream<Device> devices) {
//		return statsService.buildStats(devices.map(Device::getTemperature)
//				.map(Temperature::getCurrent).mapToDouble(Double::new));
//	}
	private DeviceStats persistDeviceStats(final DeviceStats deviceStats) {
		return deviceStatsRepository.save(deviceStats);
	}
}
