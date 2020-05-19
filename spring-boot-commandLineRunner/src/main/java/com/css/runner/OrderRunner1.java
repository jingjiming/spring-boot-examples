package com.css.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by JIMING on 2018/9/15.
 */
@Component
@Order(1)
public class OrderRunner1 implements CommandLineRunner {

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("The OrderRunner1 start to initialize ...");
    }
}
