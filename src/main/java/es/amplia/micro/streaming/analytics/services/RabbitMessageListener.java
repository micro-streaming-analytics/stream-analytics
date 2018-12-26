package es.amplia.micro.streaming.analytics.services;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public interface RabbitMessageListener {

	void listenMessages(final String collection) throws JsonParseException, JsonMappingException, IOException;
}
