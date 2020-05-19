package com.css.rabbit;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by JIMING on 2018/8/30.
 */
@Configuration
public class TopicRabbitConfig {

    static final String QUEUE_NAME1 = "topic.1";
    static final String QUEUE_NAME2 = "topic.2";

    @Bean
    public Queue queue1() {
        return new Queue(TopicRabbitConfig.QUEUE_NAME1);
    }

    @Bean
    public Queue queue2() {
        return new Queue(TopicRabbitConfig.QUEUE_NAME2);
    }

    @Bean
    TopicExchange exchange() {
        return new TopicExchange("topicExchange");
    }

    @Bean
    Binding bindingExchangeMessage(Queue queue1, TopicExchange exchange) {
        return BindingBuilder.bind(queue1).to(exchange).with("topic.1");
    }

    @Bean
    Binding bindingExchangeMessages(Queue queue2, TopicExchange exchange) {
        return BindingBuilder.bind(queue2).to(exchange).with("topic.#");
    }
}
