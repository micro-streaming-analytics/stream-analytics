package es.amplia.micro.streaming.analytics.services;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import static es.amplia.micro.streaming.analytics.utils.Constants.*;
import es.amplia.micro.streaming.analytics.dto.DMMCollectionDto;

@Service
public class RabbitMessageListenerImpl implements RabbitMessageListener {

	@Override
	@RabbitListener(queues = DEVICESQUEUE_QUEUE)
	public void listenMessages(final DMMCollectionDto collection) {
		System.out.println(collection.toString());
	}

}
