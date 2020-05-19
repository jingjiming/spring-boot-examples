package com.css.thymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Created by jiming.jing on 2018/6/15.
 */
@SpringBootApplication
public class ThymeleafApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ThymeleafApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ThymeleafApplication.class, args);
    }
}
