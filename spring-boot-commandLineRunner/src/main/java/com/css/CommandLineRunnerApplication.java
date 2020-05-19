package com.css;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by JIMING on 2018/9/15.
 */
@SpringBootApplication
public class CommandLineRunnerApplication {

    public static void main(String[] args) {
        System.out.println("The service to start...");

        SpringApplication.run(CommandLineRunnerApplication.class, args);

        System.out.println("The service has started...");
    }
}
