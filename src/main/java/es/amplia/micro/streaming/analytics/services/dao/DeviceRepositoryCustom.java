package es.amplia.micro.streaming.analytics.services.dao;

import java.util.List;

import es.amplia.micro.streaming.analytics.dto.Device;

public interface DeviceRepositoryCustom {

	List<Device> findDevicesById(String id);
}
