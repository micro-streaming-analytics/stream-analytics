package es.amplia.micro.streaming.analytics.services;

import es.amplia.micro.streaming.analytics.dto.DMMCollectionDto;

public interface RabbitMessageSender {

	void sendMessage(DMMCollectionDto collection);
}
