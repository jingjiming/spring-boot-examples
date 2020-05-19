package com.css;

import com.css.config.props.MultipleMongoProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Created by JIMING on 2018/9/11.
 */
@EnableConfigurationProperties(MultipleMongoProperties.class)
@SpringBootApplication(exclude = MongoAutoConfiguration.class)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
