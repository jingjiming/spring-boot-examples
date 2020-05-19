package com.css.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by JIMING on 2018/9/11.
 */
@Configuration
@EnableMongoRepositories(basePackages = "com.css.model.repository.secondary",
        mongoTemplateRef = SecondaryMongoConfig.MONGO_TEMPLATE)
public class SecondaryMongoConfig {

    protected static final String MONGO_TEMPLATE = "secondaryMongoTemplate";
}
