package com.css.rabbit.many;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "css.queue")
public class QueueReceiver {

    @RabbitHandler
    public void process(String msg) {
        System.out.println("Receiver 1: " + msg);
    }

}
