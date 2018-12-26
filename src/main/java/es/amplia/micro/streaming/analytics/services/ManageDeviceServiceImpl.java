package es.amplia.micro.streaming.analytics.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.amplia.micro.streaming.analytics.dto.DMMCollectionDto;
import es.amplia.micro.streaming.analytics.dto.Device;
import es.amplia.micro.streaming.analytics.dto.NonVolatilStorage;
import es.amplia.micro.streaming.analytics.dto.Ram;
import es.amplia.micro.streaming.analytics.dto.Temperature;
import es.amplia.micro.streaming.analytics.dto.Usage;
import es.amplia.micro.streaming.analytics.dto.VolatilStorage;
import es.amplia.micro.streaming.analytics.services.dao.DeviceRepository;
import es.amplia.micro.streaming.analytics.services.dao.DeviceStatsRepository;
import es.amplia.micro.streaming.analytics.services.model.DeviceStats;
import es.amplia.micro.streaming.analytics.services.model.Stats;

@Service
public class ManageDeviceServiceImpl implements ManageDeviceService {

	@Autowired
	StatsService statsService;
	
	@Autowired
	DeviceRepository deviceRepository;
	
	@Autowired
	DeviceStatsRepository deviceStatsRepository;
	
	@Override
	public void saveDeviceDto(DMMCollectionDto collection) {
		deviceRepository.save(collection.getEvent().getDevice());
	}
	
	@Override
	public DeviceStats manageDeviceService(final List<Device> devices, final String id) {
		final DeviceStats deviceStats = new DeviceStats();
		deviceStats.setDeviceId(id);
		deviceStats.setTemperature(computeStatsTemperature(devices));
		deviceStats.setCpuUsage(computeStatsCpuUsage(devices));
		deviceStats.setRam(computeStatsRam(devices));
		deviceStats.setVolatilStorage(computeStatsVolatilStorage(devices));
		deviceStats.setNonVolatilStorage(computeStatsNonVolatilStorage(devices));
		return persistDeviceStats(deviceStats);
	}
	
	@Override
	public DeviceStats computeStatistics(String id) {
		return manageDeviceService(deviceRepository.findDevicesById(id), id);
	}
	
	private Stats computeStatsTemperature(final List<Device> devices) {
		return statsService.buildStats(devices.stream().map(Device::getTemperature)
				.map(Temperature::getCurrent).collect(Collectors.toList()));
	}
	private Stats computeStatsCpuUsage(final List<Device> devices) {
		return statsService.buildStats(devices.stream().map(Device::getCpuUsage)
				.map(Usage::getCurrent).collect(Collectors.toList()));
	}
	private Stats computeStatsRam(final List<Device> devices) {
		return statsService.buildStats(devices.stream().map(Device::getRam)
				.map(Ram::getUsage).map(Usage::getCurrent).collect(Collectors.toList()));
	}
	private Stats computeStatsVolatilStorage(final List<Device> devices) {
		return statsService.buildStats(devices.stream().map(Device::getVolatilStorage)
				.map(VolatilStorage::getUsage).map(Usage::getCurrent).collect(Collectors.toList()));
	}
	private Stats computeStatsNonVolatilStorage(final List<Device> devices) {
		return statsService.buildStats(devices.stream().map(Device::getNonVolatilStorage)
				.map(NonVolatilStorage::getUsage).map(Usage::getCurrent).collect(Collectors.toList()));
	}
	private DeviceStats persistDeviceStats(final DeviceStats deviceStats) {
		return deviceStatsRepository.save(deviceStats);
	}
}
