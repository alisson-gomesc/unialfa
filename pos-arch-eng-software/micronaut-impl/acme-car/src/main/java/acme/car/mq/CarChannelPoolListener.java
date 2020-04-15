package acme.car.mq;

import java.io.IOException;

import javax.inject.Singleton;

import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;

import io.micronaut.configuration.rabbitmq.connect.ChannelInitializer;

@Singleton
public class CarChannelPoolListener extends ChannelInitializer {

	@Override
	public void initialize(Channel channel) throws IOException {
		channel.exchangeDeclare("acme-queue", BuiltinExchangeType.DIRECT, true);
		channel.exchangeDeclare("acme-topic", BuiltinExchangeType.TOPIC, true);

		channel.queueDeclare("acme-notification", true, false, false, null);
		channel.queueBind("acme-notification", "acme-topic", "acme.notification");

		channel.queueDeclare("car-service", true, false, false, null);
		channel.queueBind("car-service", "acme-queue", "acme.car.service");
	}
}