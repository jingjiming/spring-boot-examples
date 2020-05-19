package com.css.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by JIMING on 2018/9/11.
 */
@Configuration
@EnableMongoRepositories(basePackages = "com.css.model.repository.primary",
        mongoTemplateRef = PrimaryMongoConfig.MONGO_TEMPLATE)
public class PrimaryMongoConfig {

    protected static final String MONGO_TEMPLATE = "primaryMongoTemplate";
}
