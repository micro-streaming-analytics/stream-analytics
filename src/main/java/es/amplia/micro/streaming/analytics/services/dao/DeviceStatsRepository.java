package es.amplia.micro.streaming.analytics.services.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import es.amplia.micro.streaming.analytics.services.model.DeviceStats;

public interface DeviceStatsRepository extends MongoRepository<DeviceStats, String> {

}
