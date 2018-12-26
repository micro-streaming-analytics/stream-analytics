package es.amplia.micro.streaming.analytics.services;

import es.amplia.micro.streaming.analytics.dto.DMMCollectionDto;

public interface RabbitMessageListener {

	void listenMessages(final DMMCollectionDto collection);
}
