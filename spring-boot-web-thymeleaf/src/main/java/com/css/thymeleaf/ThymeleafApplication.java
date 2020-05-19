package com.css.thymeleaf;

import com.css.thymeleaf.model.Message;
import com.css.thymeleaf.repository.InMemoryMessageRepository;
import com.css.thymeleaf.repository.MessageRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.convert.converter.Converter;

/**
 * Created by jiming.jing on 2018/7/26.
 */
@SpringBootApplication
public class ThymeleafApplication {

    @Bean
    public MessageRepository messageRepository() {
        return new InMemoryMessageRepository();
    }

    @Bean
    public Converter<String, Message> messageConverter() {
        return new Converter<String, Message>() {
            @Override
            public Message convert(String id) {
                return messageRepository().findMessage(Long.valueOf(id));
            }
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(ThymeleafApplication.class, args);
    }
}
