package es.amplia.micro.streaming.analytics.services;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import static es.amplia.micro.streaming.analytics.utils.Constants.*;

import es.amplia.micro.streaming.analytics.dto.DMMCollectionDto;

@Service
public class RabbitMessageSenderImpl implements RabbitMessageSender {

	private final RabbitTemplate rabbitTemplate;
	
	public RabbitMessageSenderImpl(final RabbitTemplate rabbitTemplate) {
		this.rabbitTemplate = rabbitTemplate;
	}
	
	@Override
	@Scheduled(fixedDelay=5000L)
	public void sendMessage(final DMMCollectionDto collection) {
		rabbitTemplate.convertAndSend(DEVICEINFO_EXCHANGES, EMPTY, collection.toString());
	}

}
