package com.css.rabbit;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by JIMING on 2018/8/30.
 */
@Configuration
public class RabbitConfig {

    @Bean
    public Queue helloQueue() {
        return new Queue("hello");
    }

    @Bean
    public Queue objectQueue() {
        return new Queue("object");
    }

    @Bean
    public Queue cssQueue() {
        return new Queue("css.queue");
    }
}
