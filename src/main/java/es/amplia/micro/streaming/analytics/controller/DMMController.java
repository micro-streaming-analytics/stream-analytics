package es.amplia.micro.streaming.analytics.controller;

import java.io.IOException;
import java.util.List;

import org.apache.tomcat.util.buf.StringUtils;
import org.mockito.internal.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import es.amplia.micro.streaming.analytics.dto.DMMCollectionDto;
import es.amplia.micro.streaming.analytics.services.ManageDeviceService;
import es.amplia.micro.streaming.analytics.services.model.DeviceStats;
import es.amplia.micro.streaming.analytics.services.utils.RestResponse;

@RestController
public class DMMController {
	
	@Autowired
	ManageDeviceService manageDeviceService;
	
	private RestResponse response;

	@RequestMapping(value = "/saveDMMCollection", method = RequestMethod.POST)
	public RestResponse saveDMMCollection(@RequestBody String jsonCollection) throws JsonParseException, JsonMappingException, IOException{
		DMMCollectionDto collection = (DMMCollectionDto) mapJsonToObject(jsonCollection, DMMCollectionDto.class);
		if(collectionIsValid(collection)) {
			manageDeviceService.saveDMMCollection(collection);
			response = new RestResponse(HttpStatus.ACCEPTED.value(), "Collection has been saved");
		} else {
			response = new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(), "Error processing JSON");
		}
		return response;
	}
	
	@RequestMapping(value = "computeStatistics/{id}", method = RequestMethod.GET)
	public DeviceStats computeStatistics(@PathVariable("id") String id) {
		DeviceStats deviceStats = new DeviceStats();
		if(idIsNotNull(id)) {
			deviceStats = manageDeviceService.computeStatistics(id);
		}
		return deviceStats;
	}
	
	private Object mapJsonToObject(String jsonValue, Class<?> class1) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(jsonValue, class1);
	}
	
	private boolean collectionIsValid(DMMCollectionDto collection) {
		return collection.getEvent() != null && 
				collection.getEvent().getDevice() != null;
	}
	
	private boolean idIsNotNull(String id) {
		return id != null && id != "";
	}
}
