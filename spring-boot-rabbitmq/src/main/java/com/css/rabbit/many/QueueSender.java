package com.css.rabbit.many;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QueueSender {

	@Autowired
	private AmqpTemplate rabbitTemplate;

	public void send(int i) {
		String context = "spirng boot css.queue" + " ****** " + i;
		System.out.println("Sender1 : " + context);
		this.rabbitTemplate.convertAndSend("css.queue", context);
	}

}