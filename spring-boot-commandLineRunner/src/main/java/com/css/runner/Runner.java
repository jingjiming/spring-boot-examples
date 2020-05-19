package com.css.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

/**
 * Created by JIMING on 2018/9/15.
 */
@Component
public class Runner implements CommandLineRunner {

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("The Runner start to initialize ...");
    }
}
