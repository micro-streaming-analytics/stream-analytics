package es.amplia.micro.streaming.analytics.services.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import es.amplia.micro.streaming.analytics.dto.Device;

import java.util.ArrayList;
import java.util.List;

public class DeviceRepositoryCustomImpl implements DeviceRepositoryCustom{

	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Override
	public List<Device> findDevicesById(String id) {
		final Query query = new Query();
		final List<Criteria> criterias = new ArrayList<>();
		criterias.add(Criteria.where("id").is(id));
		query.addCriteria(new Criteria().andOperator(criterias.toArray(new Criteria[criterias.size()])));
		return mongoTemplate.find(query, Device.class);
	}

}
