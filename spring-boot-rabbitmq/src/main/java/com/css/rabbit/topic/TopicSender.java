package com.css.rabbit.topic;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class TopicSender {

	@Autowired
	private AmqpTemplate rabbitTemplate;

	public void send() {
		String context = "hi, i am topic queue all";
		System.out.println("Sender : " + context);
		this.rabbitTemplate.convertAndSend("topicExchange", "topic.n", context);
	}

	public void send1() {
		String context = "hi, i am topic queue 1";
		System.out.println("Sender : " + context);
		this.rabbitTemplate.convertAndSend("topicExchange", "topic.1", context);
	}

	public void send2() {
		String context = "hi, i am topic queue 2";
		System.out.println("Sender : " + context);
		this.rabbitTemplate.convertAndSend("topicExchange", "topic.2", context);
	}

}