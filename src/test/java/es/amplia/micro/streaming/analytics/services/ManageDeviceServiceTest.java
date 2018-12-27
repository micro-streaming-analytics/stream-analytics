package es.amplia.micro.streaming.analytics.services;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.ArgumentMatcher.*;
import org.mockito.Mock;
import static org.mockito.Mockito.any;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import es.amplia.micro.streaming.analytics.dto.DMMCollectionDto;
import es.amplia.micro.streaming.analytics.dto.Device;
import es.amplia.micro.streaming.analytics.dto.Event;
import es.amplia.micro.streaming.analytics.dto.NonVolatilStorage;
import es.amplia.micro.streaming.analytics.dto.Ram;
import es.amplia.micro.streaming.analytics.dto.Temperature;
import es.amplia.micro.streaming.analytics.dto.Usage;
import es.amplia.micro.streaming.analytics.dto.VolatilStorage;
import es.amplia.micro.streaming.analytics.services.dao.DeviceRepository;
import es.amplia.micro.streaming.analytics.services.dao.DeviceStatsRepository;
import es.amplia.micro.streaming.analytics.services.model.DeviceStats;
import es.amplia.micro.streaming.analytics.services.model.Stats;

@RunWith(MockitoJUnitRunner.class)
public class ManageDeviceServiceTest {

	@Mock
	DeviceRepository deviceRepository;
	
	@Mock
	StatsService statsService;
	
	@Mock
	DeviceStatsRepository deviceStatsRepository;
	
	@Spy
	@InjectMocks
	private ManageDeviceServiceImpl manageDeviceService;
	
	@Test
	public void saveDeviceDto_dmmCollectionValid_noError() {
		// given
		DMMCollectionDto dmmCollectionDto = new DMMCollectionDto();
		dmmCollectionDto.setEvent(new Event());
		// when
		manageDeviceService.saveDeviceDto(dmmCollectionDto);
		// then
		verify(deviceRepository, times(1)).save(dmmCollectionDto.getEvent().getDevice());
	}
	
	@Test
	public void manageDeviceService_nullParameters_error() {
		// given
		
		// when
		manageDeviceService.manageDeviceService(null, null);
		// then
		verify(statsService, times(0)).buildStats(null);
	}
	
	@Test
	public void manageDeviceService_emptyList_error() {
		// given
		List<Device> devices = new ArrayList<Device>();
		// when
		manageDeviceService.manageDeviceService(devices, null);
		// then
		verify(statsService, times(0)).buildStats(null);
	}
	
	@Test
	public void manageDeviceService_devicesNotEmpty_ok() {
		// given
		List<Device> devices = buildDevices();
		when(deviceStatsRepository.save((DeviceStats) any())).thenReturn(new DeviceStats());
		// when
		DeviceStats stats = manageDeviceService.manageDeviceService(devices, null);
		// then
		assertNotNull(stats);
	}
	
	@Test
	public void computeStatistics_nullId_deviceEmpty() {
		// given
		String id = null;
		// when
		DeviceStats stats = manageDeviceService.computeStatistics(id);
		// then
		assertNotNull(stats);
	}
	
	private List<Device> buildDevices(){
		List<Device> devices = new ArrayList<Device>();
		Device device = new Device();
		devices.add(device);
		Temperature temperature = new Temperature();
		device.setTemperature(temperature);
		temperature.setCurrent("20");
		Usage usage = new Usage();
		device.setCpuUsage(usage);
		usage.setCurrent("30");
		Ram ram = new Ram();
		device.setRam(ram);
		ram.setUsage(usage);
		VolatilStorage vStorage = new VolatilStorage();
		device.setVolatilStorage(vStorage);
		vStorage.setUsage(usage);
		NonVolatilStorage nvStorage = new NonVolatilStorage();
		device.setNonVolatilStorage(nvStorage);
		nvStorage.setUsage(usage);
		return devices;
	}
}
