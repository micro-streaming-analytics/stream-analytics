package es.amplia.micro.streaming.analytics.services.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import es.amplia.micro.streaming.analytics.dto.Device;

public interface DeviceRepository extends MongoRepository<Device, String>,  DeviceRepositoryCustom{

}
