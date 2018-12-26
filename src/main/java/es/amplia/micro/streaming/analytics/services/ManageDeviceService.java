package es.amplia.micro.streaming.analytics.services;

import java.util.List;
import es.amplia.micro.streaming.analytics.dto.DMMCollectionDto;
import es.amplia.micro.streaming.analytics.dto.Device;
import es.amplia.micro.streaming.analytics.services.model.DeviceStats;

public interface ManageDeviceService {

	void saveDeviceDto(DMMCollectionDto collection);
	
	DeviceStats manageDeviceService(List<Device> devices, String id);

	DeviceStats computeStatistics(String id);
}
