package es.amplia.micro.streaming.analytics.services;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static es.amplia.micro.streaming.analytics.utils.Constants.*;

import java.io.IOException;

import es.amplia.micro.streaming.analytics.dto.DMMCollectionDto;

@Service
public class RabbitMessageListenerImpl implements RabbitMessageListener {

	@Autowired
	private ManageDeviceService manageDeviceService;
	
	@Override
	@RabbitListener(queues = DEVICESQUEUE_QUEUE)
	@Scheduled(fixedDelay=3000L)
	public void listenMessages(final String jsonCollection) throws JsonParseException, JsonMappingException, IOException {
		DMMCollectionDto collection = mapJsonToDMMCollection(jsonCollection, DMMCollectionDto.class);
		if(collectionIsValid(collection)) {
			manageDeviceService.saveDeviceDto(collection);
			manageDeviceService.computeStatistics(collection.getEvent().getDevice().getId());
		}
	}
	
	private DMMCollectionDto mapJsonToDMMCollection(String jsonValue, Class<DMMCollectionDto> class1) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(jsonValue, DMMCollectionDto.class);
	}
	
	private boolean collectionIsValid(DMMCollectionDto collection) {
		return collection.getEvent() != null && 
				collection.getEvent().getDevice() != null;
	}
}
