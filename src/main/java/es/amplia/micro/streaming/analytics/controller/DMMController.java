package es.amplia.micro.streaming.analytics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static es.amplia.micro.streaming.analytics.utils.Constants.*;
import es.amplia.micro.streaming.analytics.services.ManageDeviceService;
import es.amplia.micro.streaming.analytics.services.RabbitMessageSender;
import es.amplia.micro.streaming.analytics.services.model.DeviceStats;
import es.amplia.micro.streaming.analytics.utils.RestResponse;

@RestController
public class DMMController {
	
	@Autowired
	private ManageDeviceService manageDeviceService;
	
	@Autowired
	private RabbitMessageSender rabbitMessageSender;
	
	@RequestMapping(value=SEND_JSON_TO_RABBIT, method=RequestMethod.POST)
	public RestResponse sendJsonToRabbit(@RequestBody String jsonRabbit) {
		rabbitMessageSender.sendMessage(jsonRabbit);
		return new RestResponse(HttpStatus.OK.value(), MESSAGE_SEND_TO_RABBIT_MQ_QUEU);
	}
	
	@RequestMapping(value = COMPUTE_STATISTICS_ID, method = RequestMethod.GET)
	public DeviceStats computeStatistics(@PathVariable(_ID) String id) {
		DeviceStats deviceStats = new DeviceStats();
		if(idIsNotNull(id)) {
			deviceStats = manageDeviceService.computeStatistics(id);
		}
		return deviceStats;
	}
	
	private boolean idIsNotNull(String id) {
		return id != null && id != EMPTY;
	}
}
