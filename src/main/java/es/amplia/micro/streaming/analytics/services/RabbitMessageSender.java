package es.amplia.micro.streaming.analytics.services;

public interface RabbitMessageSender {

	void sendMessage(final String jsonCollection);
}
